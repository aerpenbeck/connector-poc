/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.service;

import com.example.connectorpoc.config.ApplicationProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Poor man's implementation to obtain and renew OAuth token.
 */
@Service
@Slf4j
public class TokenService {

    private final ApplicationProperties applicationProperties;

    private final Object lock;

    private Token token;

    public TokenService(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
        lock = new Object();
    }

    // poor man's solution to obtain OAuth token
    Optional<String> getToken() {
        // TODO hand-coded synchronization code rarely is a good idea
        synchronized (lock) {
            if (token == null) {
                Optional<Token> t = obtainToken();
                if (t.isPresent()) {
                    token = t.get();
                    return Optional.of(t.get().getToken());
                } else {
                    return Optional.empty();
                }
            } else {
                if (token.isExpired()) {
                    Optional<Token> t = refreshToken();
                    if (t.isPresent()) {
                        token = t.get();
                        return Optional.of(t.get().getToken());
                    } else {
                        return Optional.empty();
                    }
                } else {
                    return Optional.of(token.getToken());
                }
            }
        }
    }

    private Optional<Token> obtainToken() {
        log.info("Obtaining API token");
        try (CloseableHttpClient client = HttpClients.createDefault()){
            // https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=<AUTHKEY>
            String url = applicationProperties.getIdpUrl() + "?key=" + applicationProperties.getFtAuthKey();
            HttpPost httpPost = new HttpPost(url);

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("email", applicationProperties.getFtLogin());
            jsonObject.put("password", applicationProperties.getFtPassword());
            jsonObject.put("returnSecureToken", true);

            StringEntity entity = new StringEntity(jsonObject.toString());
            httpPost.setEntity(entity);

            return makePostRequest(client, httpPost, false);
        } catch (IOException ie) {
            log.error("Could not obtain API token", ie);
        }

        return Optional.empty();
    }

    private Optional<Token> refreshToken() {
        log.info("Refreshing API token");
        try (CloseableHttpClient client = HttpClients.createDefault()){
            // https://securetoken.googleapis.com/v1/token?grant_type=refresh_token&refresh_token=<REFRESH_TOKEN>&key=<AUTHKEY>
            String url = applicationProperties.getRefreshUrl() +
                    "?grant_type=refresh_token&refresh_token=" + token.getRefreshToken() +
                    "&key=" + applicationProperties.getFtAuthKey();

            HttpPost httpPost = new HttpPost(url);

            return makePostRequest(client, httpPost, true);
        } catch (IOException ie) {
            log.error("Could not refresh API token", ie);
        }

        return Optional.empty();
    }

    private Optional<Token> makePostRequest(CloseableHttpClient client, HttpPost httpPost, boolean refresh) throws IOException {
        httpPost.setHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

        CloseableHttpResponse response = client.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == 200) {
            if (response.getEntity() != null) {
                String json = IOUtils.toString(response.getEntity().getContent(), StandardCharsets.UTF_8.name());
                JSONObject jsonResponse = new JSONObject(json);

                Integer expires = (Integer) jsonResponse.getNumber(refresh ? "expires_in" : "expiresIn");
                String refreshToken = jsonResponse.getString(refresh ? "refresh_token" : "refreshToken");
                String token = jsonResponse.getString(refresh ? "id_token" : "idToken");

                LocalDateTime expiresAt = LocalDateTime.now().plus(Duration.ofSeconds(expires)).minus(Duration.ofMinutes(1));

                log.debug("API token: {}", token);
                log.debug("API refresh_token: {}", refreshToken);
                log.debug("API expiresAt: {}", expiresAt);

                return Optional.of(new Token(token, refreshToken, expiresAt));
            } else {
                log.warn("Could not obtain API token: Empty response");
            }
        } else {
            log.warn("Could not obtain API token: {}", response.getStatusLine());
        }
        return Optional.empty();
    }

    @Getter
    @RequiredArgsConstructor
    static class Token {

        private final String token;
        private final String refreshToken;
        private final LocalDateTime expiresAt;

        boolean isExpired() {
            return LocalDateTime.now().isAfter(expiresAt);
        }

    }

}

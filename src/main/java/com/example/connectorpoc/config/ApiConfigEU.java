/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.config;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Commercetools API client configuration for Europe.
 */
@Configuration
@ConditionalOnProperty(value="poc.clientRegion", havingValue = "EU")
public class ApiConfigEU {

    private final ApplicationProperties applicationProperties;

    public ApiConfigEU(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Bean
    public ApiRoot apiRoot() {
        return ApiFactory.create(
                ClientCredentials.of().withClientId(applicationProperties.getClientId())
                        .withClientSecret(applicationProperties.getClientSecret())
                        .withScopes(applicationProperties.getClientScopes())
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }

}

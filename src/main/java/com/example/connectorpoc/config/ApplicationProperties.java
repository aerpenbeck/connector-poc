/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

/**
 * Reads <a href="https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-application-property-files">application.properties</a> and makes properties available to application.
 */
@ConfigurationProperties(prefix = "poc")
@Validated
@Getter
@Setter
public class ApplicationProperties {

    @NotBlank
    private String projectKey;

    @NotBlank
    private String clientRegion;

    @NotBlank
    private String clientId;

    @NotBlank
    private String clientSecret;

    @NotBlank
    private String clientScopes;

    @Positive
    private int fetchOrdersInterval;

    @Positive
    private int fetchOrdersLimit;

    @NotBlank
    private String backofficeUrl;

    @NotBlank
    private String ftUrl;

    @NotBlank
    private String ftAuthKey;

    @NotBlank
    private String ftLogin;

    @NotBlank
    private String ftPassword;
}

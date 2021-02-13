/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Makes ApplicationProperties available as a Spring bean.
 * @see ApplicationProperties
 */
@Configuration
@EnableConfigurationProperties(ApplicationProperties.class)
public class ApplicationConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}

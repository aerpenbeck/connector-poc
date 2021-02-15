/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.config;

import com.commercetools.api.client.ApiRoot;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value="poc.clientRegion", havingValue = "TEST")
public class TestConfig {

    @Bean
    public ApiRoot apiRoot() {
        // TODO just a hack so that we are able to start Spring context in test scenario
        return ApiRoot.fromClient(null);
    }
}

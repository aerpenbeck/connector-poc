/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Makes ApplicationProperties available as a Spring bean.
 * @see ApplicationProperties
 */
@Configuration
@EnableConfigurationProperties(ApplicationProperties.class)
public class ApplicationConfig {
}

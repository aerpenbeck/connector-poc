/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.messaging.MessageChannel;

/**
 * Spring Integration of channels, etc.
 */
@Configuration
@IntegrationComponentScan
public class IntegrationConfig {

    @Bean
    public MessageChannel ordersChannel() {
        return new DirectChannel();
//        return new PublishSubscribeChannel();
    }
}

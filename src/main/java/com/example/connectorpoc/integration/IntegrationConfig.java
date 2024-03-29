/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

/**
 * Spring Integration of channels, etc.
 */
@Configuration
@IntegrationComponentScan
public class IntegrationConfig {

    @Bean
    public MessageChannel incomingOrdersChannel() {
        return new DirectChannel();
//        return new PublishSubscribeChannel();
    }

    @Bean
    public MessageChannel filteredOrdersChannel() {
        return new DirectChannel();
//        return new PublishSubscribeChannel();
    }

    @Bean
    public MessageChannel transformedOrdersChannel() {
        return new DirectChannel();
//        return new PublishSubscribeChannel();
    }

    @Bean
    public MessageChannel processedOrdersChannel() {
        return new DirectChannel();
//        return new PublishSubscribeChannel();
    }

}

/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.tasks;

import com.example.connectorpoc.service.FetchOrderService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Make task scheduling configurable on property.
 */
@Configuration
public class Tasks {

    private final FetchOrderService fetchOrderService;

    public Tasks(FetchOrderService fetchOrderService) {
        this.fetchOrderService = fetchOrderService;
    }

    @Bean
    @ConditionalOnProperty(value="poc.schedulingEnabled", havingValue = "true")
    public FetchOrdersTask fetchOrdersTask() {
        return new FetchOrdersTask(fetchOrderService);
    }

}

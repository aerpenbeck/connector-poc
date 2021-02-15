/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.service;

import com.example.connectorpoc.config.ApplicationProperties;
import com.example.connectorpoc.ft.api.OrdersApi;
import com.example.connectorpoc.ft.model.Order;
import com.example.connectorpoc.ft.model.OrderForCreation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

/**
 * Service to post orders using the Fulfillmenttools API.
 */
@Service
@Slf4j
public class PostOrderService {

    private final ApplicationProperties applicationProperties;

    private final OrdersApi ordersApi;

    public PostOrderService(OrdersApi ordersApi, ApplicationProperties applicationProperties) {
        this.ordersApi = ordersApi;
        this.applicationProperties = applicationProperties;
    }

    @ServiceActivator(inputChannel = "transformedOrdersChannel")
    public void processOrder(OrderForCreation order) {
        log.info("Posting Order #{}", order.getTenantOrderId());
        try {
            ordersApi.getApiClient().setBasePath(applicationProperties.getFtUrl());
            ordersApi.getApiClient().setAccessToken(applicationProperties.getFtToken());

            Order createdOrder = ordersApi.addOrder(order);

            log.info("Successfully posted Order #{}", createdOrder.getId());
        } catch (RestClientException rce) {
            log.error(String.format("Could not post Order #%s to FT API", order.getTenantOrderId()), rce);
        }
    }

}

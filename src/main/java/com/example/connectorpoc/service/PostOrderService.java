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

import java.util.Optional;

/**
 * Service to post orders using the Fulfillmenttools API.
 */
@Service
@Slf4j
public class PostOrderService {

    private final ApplicationProperties applicationProperties;

    private final OrdersApi ordersApi;

    private final TokenService tokenService;

    public PostOrderService(OrdersApi ordersApi, TokenService tokenService, ApplicationProperties applicationProperties) {
        this.ordersApi = ordersApi;
        this.tokenService = tokenService;
        this.applicationProperties = applicationProperties;
    }

    @ServiceActivator(inputChannel = "transformedOrdersChannel")
    public void processOrder(OrderForCreation order) {
        log.info("Posting Order #{}", order.getTenantOrderId());
        if (true) {
            try {
                ordersApi.getApiClient().setBasePath(applicationProperties.getFtUrl());
                Optional<String> token = tokenService.getToken();
                if (token.isPresent()) {
                    ordersApi.getApiClient().setAccessToken(token.get());

                    Order createdOrder = ordersApi.addOrder(order);

                    log.info("Successfully posted Order #{}", createdOrder.getId());
                } else {
                    log.info("Could not post Order #{}", order.getTenantOrderId());
                }
            } catch (RestClientException rce) {
                log.error(String.format("Could not post Order #%s to FT API", order.getTenantOrderId()), rce);
            }
        }
    }


}

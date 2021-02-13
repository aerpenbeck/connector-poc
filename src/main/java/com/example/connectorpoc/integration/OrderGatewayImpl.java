/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.example.connectorpoc.config.ApplicationProperties;
import com.example.connectorpoc.ft.model.OrderForCreation;
import com.example.connectorpoc.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Service to post orders using the Fulfillmenttools API.
 */
@Service
@Slf4j
// TODO rename class
public class OrderGatewayImpl {

    private final ApplicationProperties applicationProperties;

    private final RestTemplate restTemplate;

    public OrderGatewayImpl(RestTemplate restTemplate, ApplicationProperties applicationProperties) {
        this.restTemplate = restTemplate;
        this.applicationProperties = applicationProperties;
    }

    @ServiceActivator(inputChannel = "transformedOrdersChannel")
    public void processOrder(Order order) {
        log.info("Processing Order #{}", order.getId());
        OrderForCreation ofc = new OrderForCreation();
        try {
            com.example.connectorpoc.ft.model.Order createdOrder =
                    restTemplate.postForObject(applicationProperties.getFtUrl() + "/api/orders", ofc, com.example.connectorpoc.ft.model.Order.class);
        } catch (RestClientException rce) {
            log.error("Could not post Order to FT API", rce);
        }
    }

}

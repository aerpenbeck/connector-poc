/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.example.connectorpoc.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * Implementation of an OrderGateway.
 */
@Service
@Slf4j
public class OrderGatewayImpl implements OrderGateway {

    @Override
    @ServiceActivator(inputChannel = "ordersChannel")
    public void processOrder(Order order) {
        log.info("Processing Order #{}", order.getId());
    }

}

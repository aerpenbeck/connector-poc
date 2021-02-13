/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.example.connectorpoc.model.Order;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * The gateway represents the entry to our internal messaging system.
 */
@MessagingGateway(name = "orderGateway")
public interface OrderGateway {

    @Gateway(requestChannel = "ordersChannel")
    void processOrder(Order order);
}

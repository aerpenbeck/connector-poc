/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.commercetools.api.models.order.Order;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * The gateway represents the entry to our internal messaging system.
 */
@MessagingGateway(name = "orderGateway")
public interface OrderGateway {

    @Gateway(requestChannel = "incomingOrdersChannel")
    void processOrder(Order order);
}

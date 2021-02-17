/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.commercetools.api.models.order.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Random;

/**
 * Dummy filter to simulate processing only new orders.
 */
@Component
@Slf4j
public class OrderFilter {

    private final Random random = new Random();

    @Filter(inputChannel = "incomingOrdersChannel", outputChannel = "filteredOrdersChannel")
    public boolean newOrdersOnly(Order order) {
        Objects.requireNonNull(order, "Order is required, it must not be null");

        boolean process = random.nextBoolean();
        if (process) {
            log.info("Accepting new Order '{}'", order.getId());
        } else {
            log.info("Skipping previously processed Order '{}'", order.getId());
        }

        return process;
    }

}

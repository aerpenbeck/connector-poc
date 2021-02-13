/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.example.connectorpoc.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

/**
 * Transform Commercetools Order object into Fullfilmenttools Order object.
 */
@Component
@Slf4j
public class OrderTransformerCT2FT implements OrderTransformer<com.commercetools.api.models.order.Order, Order> {

    @Override
    @Transformer(inputChannel = "incomingOrdersChannel", outputChannel = "transformedOrdersChannel")
    public Order transform(com.commercetools.api.models.order.Order source) {
        log.info("Transforming Order #{}", source.getId());
        return new Order(source.getId());
    }
}

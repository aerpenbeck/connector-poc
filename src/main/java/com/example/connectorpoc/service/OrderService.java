/*
 * Copyright (C) 2021 Arno Erpenbeck
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.example.connectorpoc.service;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.models.order.OrderPagedQueryResponse;
import com.example.connectorpoc.config.ApplicationProperties;
import com.example.connectorpoc.integration.OrderGateway;
import com.example.connectorpoc.model.Order;
import io.vrap.rmf.base.client.ApiHttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Service to fetch orders using the Commercetools API.
 */
@Service
@Slf4j
public class OrderService {

    private final ApiRoot apiRoot;

    private final ApplicationProperties applicationProperties;

    private final OrderGateway orderGateway;

    public OrderService(ApiRoot apiRoot, ApplicationProperties applicationProperties,
                        OrderGateway orderGateway) {
        this.apiRoot = apiRoot;
        this.applicationProperties = applicationProperties;
        this.orderGateway = orderGateway;
    }

    public void fetchOrders() {
        log.info("Retrieving orders...");

        doFetchOrders();

        log.info("Done.");
    }

    private void doFetchOrders() {
        CompletableFuture<ApiHttpResponse<OrderPagedQueryResponse>> execute = apiRoot
                .withProjectKey(applicationProperties.getProjectKey())
                .orders()
                .get()
                .withLimit(applicationProperties.getFetchOrdersLimit())
                .execute();

        try {
            // TODO convert blocking call into non-blocking
            // TODO understand + use limit, count, offset, total
            OrderPagedQueryResponse body = execute.get().getBody();

            log.info("Retrieved {} orders", body.getCount());

            body.getResults()
                    .stream()
                    .map(this::toOrder)
                    .forEach(this::send);

        } catch (ExecutionException | InterruptedException e) {
            log.error("Order query failed", e);
        }
    }

    @PreDestroy
    public void shutdown() {
        log.info("Closing API client...");
        apiRoot.close();
        log.info("Closed");
    }

    private Order toOrder(com.commercetools.api.models.order.Order ctOrder) {
        return new Order(ctOrder.getId());
    }

    private void send(Order order) {
        log.info("Sending Order #{}", order.getId());
        orderGateway.processOrder(order);
    }

}

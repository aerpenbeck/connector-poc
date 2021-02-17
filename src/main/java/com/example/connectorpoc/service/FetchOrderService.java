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
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderPagedQueryResponse;
import com.example.connectorpoc.config.ApplicationProperties;
import com.example.connectorpoc.integration.OrderGateway;
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
public class FetchOrderService {

    private final ApiRoot apiRoot;

    private final ApplicationProperties applicationProperties;

    private final OrderGateway orderGateway;

    public FetchOrderService(ApiRoot apiRoot, ApplicationProperties applicationProperties,
                             OrderGateway orderGateway) {
        this.apiRoot = apiRoot;
        this.applicationProperties = applicationProperties;
        this.orderGateway = orderGateway;
    }

    public void fetchOrders() {
        log.info("Retrieving orders from CT...");

        doFetchOrders();

        log.info("Done.");
    }

    private void doFetchOrders() {
        // see https://docs.commercetools.com/api/general-concepts#pagedqueryresult
        int offset = 0;
        int limit = applicationProperties.getFetchOrdersLimit();
        long count = 0;

        do {
            CompletableFuture<ApiHttpResponse<OrderPagedQueryResponse>> execute = apiRoot
                    .withProjectKey(applicationProperties.getProjectKey())
                    .orders()
                    .get()
                    .withLimit(limit)
                    .withOffset(offset)
                    .withWithTotal(false)
                    .execute();

            try {
                OrderPagedQueryResponse body = execute.get().getBody();
                // TODO convert blocking call into non-blocking
//                CompletableFuture<OrderPagedQueryResponse> future = execute.thenApply(ApiHttpResponse::getBody);
//                OrderPagedQueryResponse body = future.get();

                count = body.getCount();
                log.info("Retrieved {} orders (offset={})", count, offset);

                body.getResults().forEach(this::sendOrder);

            } catch (ExecutionException | InterruptedException e) {
                log.error("Order query failed", e);
            }

            offset += limit;
            // TODO for demo only process first page
            count = 0;
        } while (count > 0);
    }

    @PreDestroy
    public void shutdown() {
        log.info("Closing API client...");
        apiRoot.close();
        log.info("Closed");
    }

    private void sendOrder(Order order) {
        log.info("Processing Order '{}'", order.getId());
        orderGateway.processOrder(order);
    }

}

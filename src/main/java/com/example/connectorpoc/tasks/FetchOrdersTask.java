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
package com.example.connectorpoc.tasks;

import com.example.connectorpoc.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * A scheduled Task that fetches the orders from the Commercetools API.
 */
@Component
@Slf4j
public class FetchOrdersTask {

	private final OrderService orderService;

	public FetchOrdersTask(OrderService orderService) {
		this.orderService = orderService;
	}

	@Scheduled(fixedRate = 30000) // TODO make rate configurable
    public void fetchOrders() {
		orderService.fetchOrders();
    }

}

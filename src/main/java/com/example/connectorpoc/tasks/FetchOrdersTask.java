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

import com.example.connectorpoc.service.FetchOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * A scheduled Task that fetches the orders from the Commercetools API.
 */
@Slf4j
public class FetchOrdersTask {

	private final FetchOrderService fetchOrderService;

	public FetchOrdersTask(FetchOrderService fetchOrderService) {
		this.fetchOrderService = fetchOrderService;
	}

	@Scheduled(fixedRate = 30000) // TODO make rate configurable
    public void fetchOrders() {
		log.debug("Time to fetch some orders...");
		fetchOrderService.fetchOrders();
    }

}

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
package com.example.connectorpoc;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.models.order.OrderPagedQueryResponse;
import com.example.connectorpoc.config.ApplicationProperties;
import io.vrap.rmf.base.client.ApiHttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Spring Boot starter class.
 */
@SpringBootApplication
@ConfigurationPropertiesScan
@Slf4j
public class ConnectorPocApplication implements CommandLineRunner {

	@Autowired
	private ApiRoot apiRoot;

	@Autowired
	private ApplicationProperties applicationProperties;

	public static void main(String[] args) {
		SpringApplication.run(ConnectorPocApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Retrieving orders...");

		fetchOrders();

		log.info("Done.");
	}

	private void fetchOrders() {
		CompletableFuture<ApiHttpResponse<OrderPagedQueryResponse>> execute = apiRoot
				.withProjectKey(applicationProperties.getProjectKey())
				.orders()
				.get()
				.withLimit(10)
				.execute();

		try {
			OrderPagedQueryResponse body = execute.get().getBody();

			log.info("Retrieved {} orders", body.getCount());
		} catch (ExecutionException | InterruptedException e) {
			log.error("Order query failed", e);
		} finally {
			log.info("Closing API client...");
			apiRoot.close();
			log.info("Closed");
		}
	}

}

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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;

import java.time.Duration;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
@TestPropertySource(locations = "classpath:/application-test.properties")
public class FetchOrdersTaskTest {

    @TestConfiguration
    static class TestConfig {
        @Bean
        public FetchOrdersTask fetchOrdersTask() {
            FetchOrderService fetchOrderService = Mockito.mock(FetchOrderService.class);
            return new FetchOrdersTask(fetchOrderService);
        }
    }

    @SpyBean
    private FetchOrdersTask fetchOrdersTask;

    @Test
    public void fetchOrdersIsCalledAtLeastOnce() {
        await()
                .atMost(Duration.ofSeconds(31))
                .untilAsserted(() -> verify(fetchOrdersTask, atLeast(1)).fetchOrders());
    }

}

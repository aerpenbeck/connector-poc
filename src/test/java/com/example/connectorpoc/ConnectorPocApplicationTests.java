/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:/application-test.properties")
class ConnectorPocApplicationTests {

	@Test
	void contextLoads() {
	}

}

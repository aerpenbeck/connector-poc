/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderImpl;
import com.commercetools.api.models.order.OrderState;
import com.example.connectorpoc.config.ApplicationProperties;
import com.example.connectorpoc.ft.model.OrderForCreation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.UUID;

import static org.mockito.Mockito.lenient;

// TODO in a real world scenario a lot more mapping tests would need to be added
@ExtendWith(MockitoExtension.class)
public class OrderTransformerCT2FTest {

    private static final String FACILITY_ID = "66edf85e-6fca-11eb-ad56-8b9b1fc66741";

    @Mock
    private ApplicationProperties properties;

    private OrderTransformerCT2FT transformer;

    @BeforeEach
    void setup() {
        lenient().when(properties.getPostOrderFacility()).thenReturn(FACILITY_ID);
        transformer = new OrderTransformerCT2FT(properties);
    }

    @Test
    public void nullOrderNotAllowed() {
        Assertions.assertThatNullPointerException().isThrownBy(() -> transformer.transform(null));
    }

    @Test
    public void invalidOrderNotAllowed() {
        Assertions.assertThatNullPointerException().isThrownBy(() -> transformer.transform(new OrderImpl()));
    }

    @Test
    public void emptyOrderAllowed() {
        // given
        String id = UUID.randomUUID().toString();
        Order source = new OrderImpl();
        source.setCreatedAt(ZonedDateTime.now());
        source.setId(id);
        source.setOrderState(OrderState.OPEN);
        source.setLineItems(Collections.emptyList());

        // when
        OrderForCreation order = transformer.transform(source);

        // then
        Assertions.assertThat(order).isNotNull();
        Assertions.assertThat(order.getTenantOrderId()).isEqualTo(id);
    }

}

/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderState;
import com.example.connectorpoc.ft.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Transform Commercetools Order object into Fulfillmenttools Order object.
 */
@Component
@Slf4j
public class OrderTransformerCT2FT implements OrderTransformer<Order, OrderForCreation> {

    @Override
    @Transformer(inputChannel = "incomingOrdersChannel", outputChannel = "transformedOrdersChannel")
    public OrderForCreation transform(Order source) {
        OrderForCreation orderForCreation = new OrderForCreation()
                .orderDate(toOffsetDateTime(source.getCreatedAt()))
                .tenantOrderId(source.getId())
                .status(toOrderStatus(source))
                .consumer(toOrderForCreationConsumer(source));

        orderForCreation.setOrderLineItems(source.getLineItems()
                .stream()
                .map(this::toOrderLineItemForCreation)
                .collect(Collectors.toList()));

        log.debug("Transformed CT Order #{} into FT Order '{}", source.getId(), orderForCreation);

        return orderForCreation;
    }

    private OrderLineItemForCreation toOrderLineItemForCreation(LineItem lineItem) {
        OrderLineItemForCreation orderLineItemForCreation = new OrderLineItemForCreation();
        orderLineItemForCreation.setQuantity(lineItem.getQuantity());
        OrderLineItemArticle article = new OrderLineItemArticle()
                .tenantArticleId(lineItem.getId())
                .title(lineItem.getName().values().getOrDefault(Locale.ENGLISH.toString(), "Missing Title"));
        orderLineItemForCreation.setArticle(article);

        return orderLineItemForCreation;
    }

    private OffsetDateTime toOffsetDateTime(ZonedDateTime zonedDateTime) {
        return OffsetDateTime.ofInstant(zonedDateTime.toInstant(), zonedDateTime.getOffset());
    }

    private OrderStatus toOrderStatus(Order order) {
        OrderState orderState = order.getOrderState();
        if (OrderState.OPEN.getJsonName().equals(orderState.getJsonName())) {
            return OrderStatus.OPEN;
        } else if (OrderState.CANCELLED.getJsonName().equals(orderState.getJsonName())) {
            return OrderStatus.CANCELLED;
        } else {
            log.warn("Don't know how to handle OrderState {} of Order #{}", orderState.getJsonName(), order.getId());
        }
        return null;
    }

    private OrderForCreationConsumer toOrderForCreationConsumer(Order order) {
        Address shippingAddress = getShippingAddress(order);
        if (shippingAddress == null) {
            log.warn("No shipping address for Order #{}", order.getId());
            return null;
        }
        OrderForCreationConsumer consumer = new OrderForCreationConsumer();
        consumer.setEmail(order.getCustomerEmail());
        ConsumerAddress address = new ConsumerAddress()
            .salutation(shippingAddress.getSalutation())
            .firstName(shippingAddress.getFirstName())
            .lastName(shippingAddress.getLastName())
            .companyName(shippingAddress.getCompany())
            .street(shippingAddress.getStreetName())
            .houseNumber(shippingAddress.getStreetNumber())
            .additionalAddressInfo(shippingAddress.getAdditionalAddressInfo())
            .city(shippingAddress.getCity())
            .postalCode(shippingAddress.getPostalCode())
            .country(shippingAddress.getCountry());
        if (shippingAddress.getPhone() != null) {
            address.addPhoneNumbersItem(new AddressPhoneNumbers().type(AddressPhoneNumbers.TypeEnum.PHONE).value(shippingAddress.getPhone()));
        }
        if (shippingAddress.getMobile() != null) {
            address.addPhoneNumbersItem(new AddressPhoneNumbers().type(AddressPhoneNumbers.TypeEnum.PHONE).value(shippingAddress.getMobile()));
        }
        consumer.addAddressesItem(address);
        return consumer;
    }

    private Address getShippingAddress(Order order) {
        if (order.getShippingAddress() != null) {
            return order.getShippingAddress();
//        } else if (order.getBillingAddress() != null) {
//            return order.getBillingAddress();
        } else if (!CollectionUtils.isEmpty(order.getItemShippingAddresses())) {
            return order.getItemShippingAddresses().get(0);
        }
        return null;
    }

}

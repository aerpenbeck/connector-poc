/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderState;
import com.example.connectorpoc.config.ApplicationProperties;
import com.example.connectorpoc.ft.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Transform Commercetools Order object into Fulfillmenttools Order object.
 */
@Component
@Slf4j
public class OrderTransformerCT2FT implements OrderTransformer<Order, OrderForCreation> {

    private final ApplicationProperties applicationProperties;

    public OrderTransformerCT2FT(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    @Transformer(inputChannel = "incomingOrdersChannel", outputChannel = "transformedOrdersChannel")
    public OrderForCreation transform(Order source) {
        OrderForCreation orderForCreation = new OrderForCreation()
                .orderDate(toOffsetDateTime(source.getCreatedAt()))
                .tenantOrderId(source.getId())
                .status(toOrderStatus(source))
                .consumer(toOrderForCreationConsumer(source))
                .deliveryPreferences(toDeliveryPreferences(source))
                .customAttributes(Collections.emptyMap());

        orderForCreation.setOrderLineItems(source.getLineItems()
                .stream()
                .map(this::toOrderLineItemForCreation)
                .collect(Collectors.toList()));

        log.debug("Transformed CT Order #{} into FT Order '{}", source.getId(), orderForCreation);

        return orderForCreation;
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

    private OrderLineItemForCreation toOrderLineItemForCreation(LineItem lineItem) {
        OrderLineItemForCreation orderLineItemForCreation = new OrderLineItemForCreation()
                .quantity(lineItem.getQuantity())
                .scannableCodes(Collections.emptyList())
                .customAttributes(Collections.emptyMap());
        OrderLineItemArticle article = new OrderLineItemArticle()
                .tenantArticleId(lineItem.getId())
                .title(lineItem.getName().values().getOrDefault(Locale.ENGLISH.toString(), "Missing Title"))
                .imageUrl("")
                .customAttributes(Collections.emptyMap())
                .attributes(Collections.emptyList());
        orderLineItemForCreation.setArticle(article);

        return orderLineItemForCreation;
    }

    private DeliveryPreferences toDeliveryPreferences(Order order) {
        // TODO guessing only, do not understand the domain
        DeliveryPreferences deliveryPreferences = new DeliveryPreferences();

        DeliveryPreferencesShipping deliveryPreferencesShipping = new DeliveryPreferencesShipping()
                .servicetype(DeliveryPreferencesShipping.ServicetypeEnum.BEST_EFFORT)
                .preferredCarriers(Collections.singletonList(CarrierKey.DHL));

        CollectDelivery collectDelivery = new CollectDelivery().facilityRef(applicationProperties.getPostOrderFacility());

        deliveryPreferences.targetTime(OffsetDateTime.now().plus(Duration.ofDays(7)))
                .collect(Collections.singletonList(collectDelivery))
                .shipping(deliveryPreferencesShipping);

        return deliveryPreferences;
    }

}

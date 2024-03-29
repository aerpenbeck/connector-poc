/*
 * fulfillmenttools API for tenant %%PROJECT_ID%%
 * This is the fulfillmenttools API for tenant %%PROJECT_ID%%
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: api@fulfillmenttools.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.connectorpoc.ft.model;

import java.util.Objects;
import java.util.Arrays;
import com.example.connectorpoc.ft.model.OrderStatus;
import com.example.connectorpoc.ft.model.StrippedOrderAllOfOrderLineItems;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StrippedOrderAllOf
 */
@JsonPropertyOrder({
  StrippedOrderAllOf.JSON_PROPERTY_ID,
  StrippedOrderAllOf.JSON_PROPERTY_ORDER_LINE_ITEMS,
  StrippedOrderAllOf.JSON_PROPERTY_STATUS,
  StrippedOrderAllOf.JSON_PROPERTY_ORDER_DATE
})
@JsonTypeName("StrippedOrder_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedOrderAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ORDER_LINE_ITEMS = "orderLineItems";
  private List<StrippedOrderAllOfOrderLineItems> orderLineItems = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private OrderStatus status;

  public static final String JSON_PROPERTY_ORDER_DATE = "orderDate";
  private OffsetDateTime orderDate;


  public StrippedOrderAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of this order. It is generated during creation automatically and suits as the primary identifier of the described entity.
   * @return id
  **/
  @ApiModelProperty(example = "LGMl2DuvPnfPoSHhYFOm", required = true, value = "The id of this order. It is generated during creation automatically and suits as the primary identifier of the described entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StrippedOrderAllOf orderLineItems(List<StrippedOrderAllOfOrderLineItems> orderLineItems) {
    
    this.orderLineItems = orderLineItems;
    return this;
  }

  public StrippedOrderAllOf addOrderLineItemsItem(StrippedOrderAllOfOrderLineItems orderLineItemsItem) {
    if (this.orderLineItems == null) {
      this.orderLineItems = new ArrayList<>();
    }
    this.orderLineItems.add(orderLineItemsItem);
    return this;
  }

   /**
   * Get orderLineItems
   * @return orderLineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StrippedOrderAllOfOrderLineItems> getOrderLineItems() {
    return orderLineItems;
  }


  public void setOrderLineItems(List<StrippedOrderAllOfOrderLineItems> orderLineItems) {
    this.orderLineItems = orderLineItems;
  }


  public StrippedOrderAllOf status(OrderStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderStatus getStatus() {
    return status;
  }


  public void setStatus(OrderStatus status) {
    this.status = status;
  }


  public StrippedOrderAllOf orderDate(OffsetDateTime orderDate) {
    
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date this order was created at the supplying system.
   * @return orderDate
  **/
  @ApiModelProperty(example = "2020-02-03T08:45:50.525Z", required = true, value = "The date this order was created at the supplying system.")
  @JsonProperty(JSON_PROPERTY_ORDER_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getOrderDate() {
    return orderDate;
  }


  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrippedOrderAllOf strippedOrderAllOf = (StrippedOrderAllOf) o;
    return Objects.equals(this.id, strippedOrderAllOf.id) &&
        Objects.equals(this.orderLineItems, strippedOrderAllOf.orderLineItems) &&
        Objects.equals(this.status, strippedOrderAllOf.status) &&
        Objects.equals(this.orderDate, strippedOrderAllOf.orderDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderLineItems, status, orderDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedOrderAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderLineItems: ").append(toIndentedString(orderLineItems)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


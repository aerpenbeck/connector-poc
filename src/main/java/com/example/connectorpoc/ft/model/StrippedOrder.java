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
import com.example.connectorpoc.ft.model.StrippedOrderAllOf;
import com.example.connectorpoc.ft.model.StrippedOrderAllOfOrderLineItems;
import com.example.connectorpoc.ft.model.VersionedResource;
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
 * StrippedOrder
 */
@JsonPropertyOrder({
  StrippedOrder.JSON_PROPERTY_VERSION,
  StrippedOrder.JSON_PROPERTY_CREATED,
  StrippedOrder.JSON_PROPERTY_LAST_MODIFIED,
  StrippedOrder.JSON_PROPERTY_ID,
  StrippedOrder.JSON_PROPERTY_ORDER_LINE_ITEMS,
  StrippedOrder.JSON_PROPERTY_STATUS,
  StrippedOrder.JSON_PROPERTY_ORDER_DATE
})
@JsonTypeName("StrippedOrder")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedOrder {
  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ORDER_LINE_ITEMS = "orderLineItems";
  private List<StrippedOrderAllOfOrderLineItems> orderLineItems = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private OrderStatus status;

  public static final String JSON_PROPERTY_ORDER_DATE = "orderDate";
  private OffsetDateTime orderDate;


  public StrippedOrder version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the document to be used in optimistic locking mechanisms.
   * @return version
  **/
  @ApiModelProperty(example = "42", required = true, value = "The version of the document to be used in optimistic locking mechanisms.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  public StrippedOrder created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The date this order was created at the platform. This value is generated by the service.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-03T08:45:51.525Z", value = "The date this order was created at the platform. This value is generated by the service.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public StrippedOrder lastModified(OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The date this order was modified last. This value is generated by the service.
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-03T09:45:51.525Z", value = "The date this order was modified last. This value is generated by the service.")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  public StrippedOrder id(String id) {
    
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


  public StrippedOrder orderLineItems(List<StrippedOrderAllOfOrderLineItems> orderLineItems) {
    
    this.orderLineItems = orderLineItems;
    return this;
  }

  public StrippedOrder addOrderLineItemsItem(StrippedOrderAllOfOrderLineItems orderLineItemsItem) {
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


  public StrippedOrder status(OrderStatus status) {
    
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


  public StrippedOrder orderDate(OffsetDateTime orderDate) {
    
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
    StrippedOrder strippedOrder = (StrippedOrder) o;
    return Objects.equals(this.version, strippedOrder.version) &&
        Objects.equals(this.created, strippedOrder.created) &&
        Objects.equals(this.lastModified, strippedOrder.lastModified) &&
        Objects.equals(this.id, strippedOrder.id) &&
        Objects.equals(this.orderLineItems, strippedOrder.orderLineItems) &&
        Objects.equals(this.status, strippedOrder.status) &&
        Objects.equals(this.orderDate, strippedOrder.orderDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, lastModified, id, orderLineItems, status, orderDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedOrder {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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


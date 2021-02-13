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
import com.example.connectorpoc.ft.model.Shipment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StrippedShipments
 */
@JsonPropertyOrder({
  StrippedShipments.JSON_PROPERTY_TOTAL,
  StrippedShipments.JSON_PROPERTY_SHIPMENTS
})
@JsonTypeName("StrippedShipments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedShipments {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_SHIPMENTS = "shipments";
  private List<Shipment> shipments = null;


  public StrippedShipments total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of found entities for this query
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42", value = "Total number of found entities for this query")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public StrippedShipments shipments(List<Shipment> shipments) {
    
    this.shipments = shipments;
    return this;
  }

  public StrippedShipments addShipmentsItem(Shipment shipmentsItem) {
    if (this.shipments == null) {
      this.shipments = new ArrayList<>();
    }
    this.shipments.add(shipmentsItem);
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Shipment> getShipments() {
    return shipments;
  }


  public void setShipments(List<Shipment> shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrippedShipments strippedShipments = (StrippedShipments) o;
    return Objects.equals(this.total, strippedShipments.total) &&
        Objects.equals(this.shipments, strippedShipments.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, shipments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedShipments {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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

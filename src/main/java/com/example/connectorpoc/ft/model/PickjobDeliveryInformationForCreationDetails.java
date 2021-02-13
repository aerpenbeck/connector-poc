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
import com.example.connectorpoc.ft.model.PickjobDeliveryInformationForCreationDetailsCollect;
import com.example.connectorpoc.ft.model.PickjobDeliveryInformationForCreationDetailsShipping;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PickjobDeliveryInformationForCreationDetails
 */
@JsonPropertyOrder({
  PickjobDeliveryInformationForCreationDetails.JSON_PROPERTY_COLLECT,
  PickjobDeliveryInformationForCreationDetails.JSON_PROPERTY_SHIPPING
})
@JsonTypeName("PickjobDeliveryInformationForCreation_details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class PickjobDeliveryInformationForCreationDetails {
  public static final String JSON_PROPERTY_COLLECT = "collect";
  private PickjobDeliveryInformationForCreationDetailsCollect collect;

  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  private PickjobDeliveryInformationForCreationDetailsShipping shipping;


  public PickjobDeliveryInformationForCreationDetails collect(PickjobDeliveryInformationForCreationDetailsCollect collect) {
    
    this.collect = collect;
    return this;
  }

   /**
   * Get collect
   * @return collect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PickjobDeliveryInformationForCreationDetailsCollect getCollect() {
    return collect;
  }


  public void setCollect(PickjobDeliveryInformationForCreationDetailsCollect collect) {
    this.collect = collect;
  }


  public PickjobDeliveryInformationForCreationDetails shipping(PickjobDeliveryInformationForCreationDetailsShipping shipping) {
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PickjobDeliveryInformationForCreationDetailsShipping getShipping() {
    return shipping;
  }


  public void setShipping(PickjobDeliveryInformationForCreationDetailsShipping shipping) {
    this.shipping = shipping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickjobDeliveryInformationForCreationDetails pickjobDeliveryInformationForCreationDetails = (PickjobDeliveryInformationForCreationDetails) o;
    return Objects.equals(this.collect, pickjobDeliveryInformationForCreationDetails.collect) &&
        Objects.equals(this.shipping, pickjobDeliveryInformationForCreationDetails.shipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collect, shipping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickjobDeliveryInformationForCreationDetails {\n");
    sb.append("    collect: ").append(toIndentedString(collect)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
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

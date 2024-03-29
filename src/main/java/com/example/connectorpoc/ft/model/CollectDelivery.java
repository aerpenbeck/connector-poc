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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CollectDelivery
 */
@JsonPropertyOrder({
  CollectDelivery.JSON_PROPERTY_FACILITY_REF
})
@JsonTypeName("CollectDelivery")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class CollectDelivery {
  public static final String JSON_PROPERTY_FACILITY_REF = "facilityRef";
  private String facilityRef;


  public CollectDelivery facilityRef(String facilityRef) {
    
    this.facilityRef = facilityRef;
    return this;
  }

   /**
   * Reference to the facility where the consumer expects to collect the items
   * @return facilityRef
  **/
  @ApiModelProperty(required = true, value = "Reference to the facility where the consumer expects to collect the items")
  @JsonProperty(JSON_PROPERTY_FACILITY_REF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFacilityRef() {
    return facilityRef;
  }


  public void setFacilityRef(String facilityRef) {
    this.facilityRef = facilityRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectDelivery collectDelivery = (CollectDelivery) o;
    return Objects.equals(this.facilityRef, collectDelivery.facilityRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectDelivery {\n");
    sb.append("    facilityRef: ").append(toIndentedString(facilityRef)).append("\n");
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


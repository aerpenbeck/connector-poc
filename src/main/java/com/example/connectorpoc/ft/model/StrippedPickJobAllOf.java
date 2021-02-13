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
import com.example.connectorpoc.ft.model.PickJobStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StrippedPickJobAllOf
 */
@JsonPropertyOrder({
  StrippedPickJobAllOf.JSON_PROPERTY_ID,
  StrippedPickJobAllOf.JSON_PROPERTY_STATUS,
  StrippedPickJobAllOf.JSON_PROPERTY_ORDER_REF,
  StrippedPickJobAllOf.JSON_PROPERTY_FACILITY_REF
})
@JsonTypeName("StrippedPickJob_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedPickJobAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private PickJobStatus status;

  public static final String JSON_PROPERTY_ORDER_REF = "orderRef";
  private String orderRef;

  public static final String JSON_PROPERTY_FACILITY_REF = "facilityRef";
  private String facilityRef;


  public StrippedPickJobAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StrippedPickJobAllOf status(PickJobStatus status) {
    
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

  public PickJobStatus getStatus() {
    return status;
  }


  public void setStatus(PickJobStatus status) {
    this.status = status;
  }


  public StrippedPickJobAllOf orderRef(String orderRef) {
    
    this.orderRef = orderRef;
    return this;
  }

   /**
   * The id of the order that lead to the creation of this pickjob. Can be empty / not present when the pickjob was created without having an order.
   * @return orderRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LGMl2DuvPnfPoSHhYFOm", value = "The id of the order that lead to the creation of this pickjob. Can be empty / not present when the pickjob was created without having an order.")
  @JsonProperty(JSON_PROPERTY_ORDER_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderRef() {
    return orderRef;
  }


  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }


  public StrippedPickJobAllOf facilityRef(String facilityRef) {
    
    this.facilityRef = facilityRef;
    return this;
  }

   /**
   * The id of the facility reference. The given ID has to be present in the system.
   * @return facilityRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Esb20gpHBL94X5NdMp3C", value = "The id of the facility reference. The given ID has to be present in the system.")
  @JsonProperty(JSON_PROPERTY_FACILITY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
    StrippedPickJobAllOf strippedPickJobAllOf = (StrippedPickJobAllOf) o;
    return Objects.equals(this.id, strippedPickJobAllOf.id) &&
        Objects.equals(this.status, strippedPickJobAllOf.status) &&
        Objects.equals(this.orderRef, strippedPickJobAllOf.orderRef) &&
        Objects.equals(this.facilityRef, strippedPickJobAllOf.facilityRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, orderRef, facilityRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedPickJobAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderRef: ").append(toIndentedString(orderRef)).append("\n");
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


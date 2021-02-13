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
import com.example.connectorpoc.ft.model.CarrierReference;
import com.example.connectorpoc.ft.model.ParcelStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StrippedParcel
 */
@JsonPropertyOrder({
  StrippedParcel.JSON_PROPERTY_PARCEL_REF,
  StrippedParcel.JSON_PROPERTY_CARRIER,
  StrippedParcel.JSON_PROPERTY_STATUS
})
@JsonTypeName("StrippedParcel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedParcel {
  public static final String JSON_PROPERTY_PARCEL_REF = "parcelRef";
  private String parcelRef;

  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private CarrierReference carrier;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ParcelStatus status;


  public StrippedParcel parcelRef(String parcelRef) {
    
    this.parcelRef = parcelRef;
    return this;
  }

   /**
   * Get parcelRef
   * @return parcelRef
  **/
  @ApiModelProperty(example = "15EZrieW09OmeriXIUbc", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PARCEL_REF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getParcelRef() {
    return parcelRef;
  }


  public void setParcelRef(String parcelRef) {
    this.parcelRef = parcelRef;
  }


  public StrippedParcel carrier(CarrierReference carrier) {
    
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CarrierReference getCarrier() {
    return carrier;
  }


  public void setCarrier(CarrierReference carrier) {
    this.carrier = carrier;
  }


  public StrippedParcel status(ParcelStatus status) {
    
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

  public ParcelStatus getStatus() {
    return status;
  }


  public void setStatus(ParcelStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrippedParcel strippedParcel = (StrippedParcel) o;
    return Objects.equals(this.parcelRef, strippedParcel.parcelRef) &&
        Objects.equals(this.carrier, strippedParcel.carrier) &&
        Objects.equals(this.status, strippedParcel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parcelRef, carrier, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedParcel {\n");
    sb.append("    parcelRef: ").append(toIndentedString(parcelRef)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


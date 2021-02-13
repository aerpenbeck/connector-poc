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
import com.example.connectorpoc.ft.model.CutoffTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FacilityCarrierConnectionCutoffs
 */
@JsonPropertyOrder({
  FacilityCarrierConnectionCutoffs.JSON_PROPERTY_SAMEDAY,
  FacilityCarrierConnectionCutoffs.JSON_PROPERTY_NEXTDAY
})
@JsonTypeName("FacilityCarrierConnection_cutoffs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class FacilityCarrierConnectionCutoffs {
  public static final String JSON_PROPERTY_SAMEDAY = "sameday";
  private CutoffTime sameday;

  public static final String JSON_PROPERTY_NEXTDAY = "nextday";
  private CutoffTime nextday;


  public FacilityCarrierConnectionCutoffs sameday(CutoffTime sameday) {
    
    this.sameday = sameday;
    return this;
  }

   /**
   * Get sameday
   * @return sameday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAMEDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CutoffTime getSameday() {
    return sameday;
  }


  public void setSameday(CutoffTime sameday) {
    this.sameday = sameday;
  }


  public FacilityCarrierConnectionCutoffs nextday(CutoffTime nextday) {
    
    this.nextday = nextday;
    return this;
  }

   /**
   * Get nextday
   * @return nextday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXTDAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CutoffTime getNextday() {
    return nextday;
  }


  public void setNextday(CutoffTime nextday) {
    this.nextday = nextday;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityCarrierConnectionCutoffs facilityCarrierConnectionCutoffs = (FacilityCarrierConnectionCutoffs) o;
    return Objects.equals(this.sameday, facilityCarrierConnectionCutoffs.sameday) &&
        Objects.equals(this.nextday, facilityCarrierConnectionCutoffs.nextday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sameday, nextday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityCarrierConnectionCutoffs {\n");
    sb.append("    sameday: ").append(toIndentedString(sameday)).append("\n");
    sb.append("    nextday: ").append(toIndentedString(nextday)).append("\n");
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

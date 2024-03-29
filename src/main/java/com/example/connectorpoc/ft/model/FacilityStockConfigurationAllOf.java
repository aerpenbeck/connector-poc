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
import com.example.connectorpoc.ft.model.FacilityStockConfigurationAllOfListingReactivationAfter;
import com.example.connectorpoc.ft.model.FacilityStockConfigurationAllOfRetainedOfflineStock;
import com.example.connectorpoc.ft.model.FacilityStockConfigurationAllOfShortpick;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FacilityStockConfigurationAllOf
 */
@JsonPropertyOrder({
  FacilityStockConfigurationAllOf.JSON_PROPERTY_RETAINED_OFFLINE_STOCK,
  FacilityStockConfigurationAllOf.JSON_PROPERTY_LISTING_REACTIVATION_AFTER,
  FacilityStockConfigurationAllOf.JSON_PROPERTY_SHORTPICK
})
@JsonTypeName("FacilityStockConfiguration_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class FacilityStockConfigurationAllOf {
  public static final String JSON_PROPERTY_RETAINED_OFFLINE_STOCK = "retainedOfflineStock";
  private FacilityStockConfigurationAllOfRetainedOfflineStock retainedOfflineStock;

  public static final String JSON_PROPERTY_LISTING_REACTIVATION_AFTER = "listingReactivationAfter";
  private FacilityStockConfigurationAllOfListingReactivationAfter listingReactivationAfter;

  public static final String JSON_PROPERTY_SHORTPICK = "shortpick";
  private FacilityStockConfigurationAllOfShortpick shortpick;


  public FacilityStockConfigurationAllOf retainedOfflineStock(FacilityStockConfigurationAllOfRetainedOfflineStock retainedOfflineStock) {
    
    this.retainedOfflineStock = retainedOfflineStock;
    return this;
  }

   /**
   * Get retainedOfflineStock
   * @return retainedOfflineStock
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RETAINED_OFFLINE_STOCK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FacilityStockConfigurationAllOfRetainedOfflineStock getRetainedOfflineStock() {
    return retainedOfflineStock;
  }


  public void setRetainedOfflineStock(FacilityStockConfigurationAllOfRetainedOfflineStock retainedOfflineStock) {
    this.retainedOfflineStock = retainedOfflineStock;
  }


  public FacilityStockConfigurationAllOf listingReactivationAfter(FacilityStockConfigurationAllOfListingReactivationAfter listingReactivationAfter) {
    
    this.listingReactivationAfter = listingReactivationAfter;
    return this;
  }

   /**
   * Get listingReactivationAfter
   * @return listingReactivationAfter
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LISTING_REACTIVATION_AFTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FacilityStockConfigurationAllOfListingReactivationAfter getListingReactivationAfter() {
    return listingReactivationAfter;
  }


  public void setListingReactivationAfter(FacilityStockConfigurationAllOfListingReactivationAfter listingReactivationAfter) {
    this.listingReactivationAfter = listingReactivationAfter;
  }


  public FacilityStockConfigurationAllOf shortpick(FacilityStockConfigurationAllOfShortpick shortpick) {
    
    this.shortpick = shortpick;
    return this;
  }

   /**
   * Get shortpick
   * @return shortpick
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHORTPICK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FacilityStockConfigurationAllOfShortpick getShortpick() {
    return shortpick;
  }


  public void setShortpick(FacilityStockConfigurationAllOfShortpick shortpick) {
    this.shortpick = shortpick;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityStockConfigurationAllOf facilityStockConfigurationAllOf = (FacilityStockConfigurationAllOf) o;
    return Objects.equals(this.retainedOfflineStock, facilityStockConfigurationAllOf.retainedOfflineStock) &&
        Objects.equals(this.listingReactivationAfter, facilityStockConfigurationAllOf.listingReactivationAfter) &&
        Objects.equals(this.shortpick, facilityStockConfigurationAllOf.shortpick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retainedOfflineStock, listingReactivationAfter, shortpick);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityStockConfigurationAllOf {\n");
    sb.append("    retainedOfflineStock: ").append(toIndentedString(retainedOfflineStock)).append("\n");
    sb.append("    listingReactivationAfter: ").append(toIndentedString(listingReactivationAfter)).append("\n");
    sb.append("    shortpick: ").append(toIndentedString(shortpick)).append("\n");
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


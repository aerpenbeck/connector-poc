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
import com.example.connectorpoc.ft.model.StrippedParcel;
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
 * StrippedParcels
 */
@JsonPropertyOrder({
  StrippedParcels.JSON_PROPERTY_TOTAL,
  StrippedParcels.JSON_PROPERTY_PARCELS
})
@JsonTypeName("StrippedParcels")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedParcels {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_PARCELS = "parcels";
  private List<StrippedParcel> parcels = null;


  public StrippedParcels total(Integer total) {
    
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


  public StrippedParcels parcels(List<StrippedParcel> parcels) {
    
    this.parcels = parcels;
    return this;
  }

  public StrippedParcels addParcelsItem(StrippedParcel parcelsItem) {
    if (this.parcels == null) {
      this.parcels = new ArrayList<>();
    }
    this.parcels.add(parcelsItem);
    return this;
  }

   /**
   * Get parcels
   * @return parcels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARCELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StrippedParcel> getParcels() {
    return parcels;
  }


  public void setParcels(List<StrippedParcel> parcels) {
    this.parcels = parcels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrippedParcels strippedParcels = (StrippedParcels) o;
    return Objects.equals(this.total, strippedParcels.total) &&
        Objects.equals(this.parcels, strippedParcels.parcels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, parcels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedParcels {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    parcels: ").append(toIndentedString(parcels)).append("\n");
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


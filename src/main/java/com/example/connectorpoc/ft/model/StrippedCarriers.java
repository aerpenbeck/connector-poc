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
import com.example.connectorpoc.ft.model.Carrier;
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
 * StrippedCarriers
 */
@JsonPropertyOrder({
  StrippedCarriers.JSON_PROPERTY_TOTAL,
  StrippedCarriers.JSON_PROPERTY_CARRIERS
})
@JsonTypeName("StrippedCarriers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedCarriers {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_CARRIERS = "carriers";
  private List<Carrier> carriers = null;


  public StrippedCarriers total(Integer total) {
    
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


  public StrippedCarriers carriers(List<Carrier> carriers) {
    
    this.carriers = carriers;
    return this;
  }

  public StrippedCarriers addCarriersItem(Carrier carriersItem) {
    if (this.carriers == null) {
      this.carriers = new ArrayList<>();
    }
    this.carriers.add(carriersItem);
    return this;
  }

   /**
   * Get carriers
   * @return carriers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARRIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Carrier> getCarriers() {
    return carriers;
  }


  public void setCarriers(List<Carrier> carriers) {
    this.carriers = carriers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrippedCarriers strippedCarriers = (StrippedCarriers) o;
    return Objects.equals(this.total, strippedCarriers.total) &&
        Objects.equals(this.carriers, strippedCarriers.carriers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, carriers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedCarriers {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    carriers: ").append(toIndentedString(carriers)).append("\n");
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

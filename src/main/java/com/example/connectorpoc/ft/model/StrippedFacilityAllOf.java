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
import com.example.connectorpoc.ft.model.FacilityStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StrippedFacilityAllOf
 */
@JsonPropertyOrder({
  StrippedFacilityAllOf.JSON_PROPERTY_ID,
  StrippedFacilityAllOf.JSON_PROPERTY_NAME,
  StrippedFacilityAllOf.JSON_PROPERTY_TENANT_FACILITY_ID,
  StrippedFacilityAllOf.JSON_PROPERTY_STATUS
})
@JsonTypeName("StrippedFacility_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedFacilityAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TENANT_FACILITY_ID = "tenantFacilityId";
  private String tenantFacilityId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FacilityStatus status;


  public StrippedFacilityAllOf id(String id) {
    
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


  public StrippedFacilityAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the facility
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Köln store", value = "name of the facility")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StrippedFacilityAllOf tenantFacilityId(String tenantFacilityId) {
    
    this.tenantFacilityId = tenantFacilityId;
    return this;
  }

   /**
   * The id of the facility in the tenants own system
   * @return tenantFacilityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "K12345", value = "The id of the facility in the tenants own system")
  @JsonProperty(JSON_PROPERTY_TENANT_FACILITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantFacilityId() {
    return tenantFacilityId;
  }


  public void setTenantFacilityId(String tenantFacilityId) {
    this.tenantFacilityId = tenantFacilityId;
  }


  public StrippedFacilityAllOf status(FacilityStatus status) {
    
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

  public FacilityStatus getStatus() {
    return status;
  }


  public void setStatus(FacilityStatus status) {
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
    StrippedFacilityAllOf strippedFacilityAllOf = (StrippedFacilityAllOf) o;
    return Objects.equals(this.id, strippedFacilityAllOf.id) &&
        Objects.equals(this.name, strippedFacilityAllOf.name) &&
        Objects.equals(this.tenantFacilityId, strippedFacilityAllOf.tenantFacilityId) &&
        Objects.equals(this.status, strippedFacilityAllOf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tenantFacilityId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedFacilityAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantFacilityId: ").append(toIndentedString(tenantFacilityId)).append("\n");
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

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
import com.example.connectorpoc.ft.model.FacilityAddress;
import com.example.connectorpoc.ft.model.FacilityForCreationContact;
import com.example.connectorpoc.ft.model.FacilityForCreationServices;
import com.example.connectorpoc.ft.model.FacilityStatus;
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
 * FacilityForCreation
 */
@JsonPropertyOrder({
  FacilityForCreation.JSON_PROPERTY_NAME,
  FacilityForCreation.JSON_PROPERTY_LOCATION_TYPE,
  FacilityForCreation.JSON_PROPERTY_TENANT_FACILITY_ID,
  FacilityForCreation.JSON_PROPERTY_ADDRESS,
  FacilityForCreation.JSON_PROPERTY_CONTACT,
  FacilityForCreation.JSON_PROPERTY_STATUS,
  FacilityForCreation.JSON_PROPERTY_SERVICES,
  FacilityForCreation.JSON_PROPERTY_CUSTOM_ATTRIBUTES
})
@JsonTypeName("FacilityForCreation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class FacilityForCreation {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets locationType
   */
  public enum LocationTypeEnum {
    STORE("STORE"),
    
    WAREHOUSE("WAREHOUSE");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocationTypeEnum fromValue(String value) {
      for (LocationTypeEnum b : LocationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LOCATION_TYPE = "locationType";
  private LocationTypeEnum locationType = LocationTypeEnum.STORE;

  public static final String JSON_PROPERTY_TENANT_FACILITY_ID = "tenantFacilityId";
  private String tenantFacilityId;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private FacilityAddress address = null;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private FacilityForCreationContact contact;

  public static final String JSON_PROPERTY_STATUS = "status";
  private FacilityStatus status;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<FacilityForCreationServices> services = null;

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES = "customAttributes";
  private Object customAttributes;


  public FacilityForCreation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Hamburg NW2", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FacilityForCreation locationType(LocationTypeEnum locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocationTypeEnum getLocationType() {
    return locationType;
  }


  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }


  public FacilityForCreation tenantFacilityId(String tenantFacilityId) {
    
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


  public FacilityForCreation address(FacilityAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FacilityAddress getAddress() {
    return address;
  }


  public void setAddress(FacilityAddress address) {
    this.address = address;
  }


  public FacilityForCreation contact(FacilityForCreationContact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacilityForCreationContact getContact() {
    return contact;
  }


  public void setContact(FacilityForCreationContact contact) {
    this.contact = contact;
  }


  public FacilityForCreation status(FacilityStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FacilityStatus getStatus() {
    return status;
  }


  public void setStatus(FacilityStatus status) {
    this.status = status;
  }


  public FacilityForCreation services(List<FacilityForCreationServices> services) {
    
    this.services = services;
    return this;
  }

  public FacilityForCreation addServicesItem(FacilityForCreationServices servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacilityForCreationServices> getServices() {
    return services;
  }


  public void setServices(List<FacilityForCreationServices> services) {
    this.services = services;
  }


  public FacilityForCreation customAttributes(Object customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

   /**
   * Attributes that can be added to the facility. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.
   * @return customAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes that can be added to the facility. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(Object customAttributes) {
    this.customAttributes = customAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityForCreation facilityForCreation = (FacilityForCreation) o;
    return Objects.equals(this.name, facilityForCreation.name) &&
        Objects.equals(this.locationType, facilityForCreation.locationType) &&
        Objects.equals(this.tenantFacilityId, facilityForCreation.tenantFacilityId) &&
        Objects.equals(this.address, facilityForCreation.address) &&
        Objects.equals(this.contact, facilityForCreation.contact) &&
        Objects.equals(this.status, facilityForCreation.status) &&
        Objects.equals(this.services, facilityForCreation.services) &&
        Objects.equals(this.customAttributes, facilityForCreation.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locationType, tenantFacilityId, address, contact, status, services, customAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityForCreation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    tenantFacilityId: ").append(toIndentedString(tenantFacilityId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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


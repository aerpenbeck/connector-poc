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
import com.example.connectorpoc.ft.model.FacilityAllOf;
import com.example.connectorpoc.ft.model.FacilityForCreation;
import com.example.connectorpoc.ft.model.FacilityForCreationContact;
import com.example.connectorpoc.ft.model.FacilityForCreationServices;
import com.example.connectorpoc.ft.model.FacilityStatus;
import com.example.connectorpoc.ft.model.LinkedConfiguration;
import com.example.connectorpoc.ft.model.VersionedResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Facility
 */
@JsonPropertyOrder({
  Facility.JSON_PROPERTY_NAME,
  Facility.JSON_PROPERTY_LOCATION_TYPE,
  Facility.JSON_PROPERTY_TENANT_FACILITY_ID,
  Facility.JSON_PROPERTY_ADDRESS,
  Facility.JSON_PROPERTY_CONTACT,
  Facility.JSON_PROPERTY_STATUS,
  Facility.JSON_PROPERTY_SERVICES,
  Facility.JSON_PROPERTY_CUSTOM_ATTRIBUTES,
  Facility.JSON_PROPERTY_VERSION,
  Facility.JSON_PROPERTY_CREATED,
  Facility.JSON_PROPERTY_LAST_MODIFIED,
  Facility.JSON_PROPERTY_ID,
  Facility.JSON_PROPERTY_CONFIGS
})
@JsonTypeName("Facility")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class Facility {
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

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CONFIGS = "configs";
  private List<LinkedConfiguration> configs = null;


  public Facility name(String name) {
    
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


  public Facility locationType(LocationTypeEnum locationType) {
    
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


  public Facility tenantFacilityId(String tenantFacilityId) {
    
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


  public Facility address(FacilityAddress address) {
    
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


  public Facility contact(FacilityForCreationContact contact) {
    
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


  public Facility status(FacilityStatus status) {
    
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


  public Facility services(List<FacilityForCreationServices> services) {
    
    this.services = services;
    return this;
  }

  public Facility addServicesItem(FacilityForCreationServices servicesItem) {
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


  public Facility customAttributes(Object customAttributes) {
    
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


  public Facility version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the document to be used in optimistic locking mechanisms.
   * @return version
  **/
  @ApiModelProperty(example = "42", required = true, value = "The version of the document to be used in optimistic locking mechanisms.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  public Facility created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The date this order was created at the platform. This value is generated by the service.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-03T08:45:51.525Z", value = "The date this order was created at the platform. This value is generated by the service.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Facility lastModified(OffsetDateTime lastModified) {
    
    this.lastModified = lastModified;
    return this;
  }

   /**
   * The date this order was modified last. This value is generated by the service.
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-03T09:45:51.525Z", value = "The date this order was modified last. This value is generated by the service.")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModified() {
    return lastModified;
  }


  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  public Facility id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of this facility. It is generated during creation automatically and suits as the primary identifier of the described entity.
   * @return id
  **/
  @ApiModelProperty(example = "Esb20gpHBL94X5NdMp3C", required = true, value = "The id of this facility. It is generated during creation automatically and suits as the primary identifier of the described entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Facility configs(List<LinkedConfiguration> configs) {
    
    this.configs = configs;
    return this;
  }

  public Facility addConfigsItem(LinkedConfiguration configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<>();
    }
    this.configs.add(configsItem);
    return this;
  }

   /**
   * Get configs
   * @return configs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LinkedConfiguration> getConfigs() {
    return configs;
  }


  public void setConfigs(List<LinkedConfiguration> configs) {
    this.configs = configs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facility facility = (Facility) o;
    return Objects.equals(this.name, facility.name) &&
        Objects.equals(this.locationType, facility.locationType) &&
        Objects.equals(this.tenantFacilityId, facility.tenantFacilityId) &&
        Objects.equals(this.address, facility.address) &&
        Objects.equals(this.contact, facility.contact) &&
        Objects.equals(this.status, facility.status) &&
        Objects.equals(this.services, facility.services) &&
        Objects.equals(this.customAttributes, facility.customAttributes) &&
        Objects.equals(this.version, facility.version) &&
        Objects.equals(this.created, facility.created) &&
        Objects.equals(this.lastModified, facility.lastModified) &&
        Objects.equals(this.id, facility.id) &&
        Objects.equals(this.configs, facility.configs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, locationType, tenantFacilityId, address, contact, status, services, customAttributes, version, created, lastModified, id, configs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facility {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    tenantFacilityId: ").append(toIndentedString(tenantFacilityId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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


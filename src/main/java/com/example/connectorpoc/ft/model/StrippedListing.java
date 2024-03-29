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
import com.example.connectorpoc.ft.model.StrippedListingAllOf;
import com.example.connectorpoc.ft.model.VersionedResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * StrippedListing
 */
@JsonPropertyOrder({
  StrippedListing.JSON_PROPERTY_VERSION,
  StrippedListing.JSON_PROPERTY_CREATED,
  StrippedListing.JSON_PROPERTY_LAST_MODIFIED,
  StrippedListing.JSON_PROPERTY_ID,
  StrippedListing.JSON_PROPERTY_STATUS,
  StrippedListing.JSON_PROPERTY_TENANT_ARTICLE_ID
})
@JsonTypeName("StrippedListing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class StrippedListing {
  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  private OffsetDateTime lastModified;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TENANT_ARTICLE_ID = "tenantArticleId";
  private String tenantArticleId;


  public StrippedListing version(Long version) {
    
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


  public StrippedListing created(OffsetDateTime created) {
    
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


  public StrippedListing lastModified(OffsetDateTime lastModified) {
    
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


  public StrippedListing id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "fsfdsf87fsd", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StrippedListing status(StatusEnum status) {
    
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

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public StrippedListing tenantArticleId(String tenantArticleId) {
    
    this.tenantArticleId = tenantArticleId;
    return this;
  }

   /**
   * This is a reference to an article Id
   * @return tenantArticleId
  **/
  @ApiModelProperty(example = "4711", required = true, value = "This is a reference to an article Id")
  @JsonProperty(JSON_PROPERTY_TENANT_ARTICLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTenantArticleId() {
    return tenantArticleId;
  }


  public void setTenantArticleId(String tenantArticleId) {
    this.tenantArticleId = tenantArticleId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StrippedListing strippedListing = (StrippedListing) o;
    return Objects.equals(this.version, strippedListing.version) &&
        Objects.equals(this.created, strippedListing.created) &&
        Objects.equals(this.lastModified, strippedListing.lastModified) &&
        Objects.equals(this.id, strippedListing.id) &&
        Objects.equals(this.status, strippedListing.status) &&
        Objects.equals(this.tenantArticleId, strippedListing.tenantArticleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, lastModified, id, status, tenantArticleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StrippedListing {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantArticleId: ").append(toIndentedString(tenantArticleId)).append("\n");
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


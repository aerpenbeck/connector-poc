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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Branding
 */
@JsonPropertyOrder({
  Branding.JSON_PROPERTY_PRIMARY_COLOR,
  Branding.JSON_PROPERTY_LOGO_URL
})
@JsonTypeName("Branding")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class Branding {
  public static final String JSON_PROPERTY_PRIMARY_COLOR = "primaryColor";
  private String primaryColor;

  public static final String JSON_PROPERTY_LOGO_URL = "logoUrl";
  private URI logoUrl;


  public Branding primaryColor(String primaryColor) {
    
    this.primaryColor = primaryColor;
    return this;
  }

   /**
   * The hexcode representation of the desired primary color.
   * @return primaryColor
  **/
  @ApiModelProperty(example = "#FFC0CB", required = true, value = "The hexcode representation of the desired primary color.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrimaryColor() {
    return primaryColor;
  }


  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }


  public Branding logoUrl(URI logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The logo URL for the tenant
   * @return logoUrl
  **/
  @ApiModelProperty(example = "https://ocff-transloadit.storage.googleapis.com/thumbnails/logo.jpg", required = true, value = "The logo URL for the tenant")
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(URI logoUrl) {
    this.logoUrl = logoUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branding branding = (Branding) o;
    return Objects.equals(this.primaryColor, branding.primaryColor) &&
        Objects.equals(this.logoUrl, branding.logoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryColor, logoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branding {\n");
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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

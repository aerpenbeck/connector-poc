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
import com.example.connectorpoc.ft.model.CarrierKey;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DhlCarrierCredentialsAllOf
 */
@JsonPropertyOrder({
  DhlCarrierCredentialsAllOf.JSON_PROPERTY_KEY,
  DhlCarrierCredentialsAllOf.JSON_PROPERTY_DHL_GK_USERNAME,
  DhlCarrierCredentialsAllOf.JSON_PROPERTY_DHL_G_K_PASSWORD,
  DhlCarrierCredentialsAllOf.JSON_PROPERTY_DHL_ACCOUNT_NUMBER,
  DhlCarrierCredentialsAllOf.JSON_PROPERTY_API_KEY
})
@JsonTypeName("DhlCarrierCredentials_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class DhlCarrierCredentialsAllOf {
  public static final String JSON_PROPERTY_KEY = "key";
  private CarrierKey key;

  public static final String JSON_PROPERTY_DHL_GK_USERNAME = "dhlGkUsername";
  private String dhlGkUsername;

  public static final String JSON_PROPERTY_DHL_G_K_PASSWORD = "dhlGKPassword";
  private String dhlGKPassword;

  public static final String JSON_PROPERTY_DHL_ACCOUNT_NUMBER = "dhlAccountNumber";
  private String dhlAccountNumber;

  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;


  public DhlCarrierCredentialsAllOf key(CarrierKey key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CarrierKey getKey() {
    return key;
  }


  public void setKey(CarrierKey key) {
    this.key = key;
  }


  public DhlCarrierCredentialsAllOf dhlGkUsername(String dhlGkUsername) {
    
    this.dhlGkUsername = dhlGkUsername;
    return this;
  }

   /**
   * Username (Benutzername) you use to login to the DHL Geschäftskundenportal
   * @return dhlGkUsername
  **/
  @ApiModelProperty(required = true, value = "Username (Benutzername) you use to login to the DHL Geschäftskundenportal")
  @JsonProperty(JSON_PROPERTY_DHL_GK_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDhlGkUsername() {
    return dhlGkUsername;
  }


  public void setDhlGkUsername(String dhlGkUsername) {
    this.dhlGkUsername = dhlGkUsername;
  }


  public DhlCarrierCredentialsAllOf dhlGKPassword(String dhlGKPassword) {
    
    this.dhlGKPassword = dhlGKPassword;
    return this;
  }

   /**
   * Password you use to login to the DHL Geschäftskundenportal
   * @return dhlGKPassword
  **/
  @ApiModelProperty(required = true, value = "Password you use to login to the DHL Geschäftskundenportal")
  @JsonProperty(JSON_PROPERTY_DHL_G_K_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDhlGKPassword() {
    return dhlGKPassword;
  }


  public void setDhlGKPassword(String dhlGKPassword) {
    this.dhlGKPassword = dhlGKPassword;
  }


  public DhlCarrierCredentialsAllOf dhlAccountNumber(String dhlAccountNumber) {
    
    this.dhlAccountNumber = dhlAccountNumber;
    return this;
  }

   /**
   * Abrechnungsnummer DHL Paket, displayed in the DHL Geschäftskundenportal under &#39;Vertragspositionen&#39;
   * @return dhlAccountNumber
  **/
  @ApiModelProperty(required = true, value = "Abrechnungsnummer DHL Paket, displayed in the DHL Geschäftskundenportal under 'Vertragspositionen'")
  @JsonProperty(JSON_PROPERTY_DHL_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDhlAccountNumber() {
    return dhlAccountNumber;
  }


  public void setDhlAccountNumber(String dhlAccountNumber) {
    this.dhlAccountNumber = dhlAccountNumber;
  }


  public DhlCarrierCredentialsAllOf apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Internal API Key to communicate with the CEP Api
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal API Key to communicate with the CEP Api")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiKey() {
    return apiKey;
  }


  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DhlCarrierCredentialsAllOf dhlCarrierCredentialsAllOf = (DhlCarrierCredentialsAllOf) o;
    return Objects.equals(this.key, dhlCarrierCredentialsAllOf.key) &&
        Objects.equals(this.dhlGkUsername, dhlCarrierCredentialsAllOf.dhlGkUsername) &&
        Objects.equals(this.dhlGKPassword, dhlCarrierCredentialsAllOf.dhlGKPassword) &&
        Objects.equals(this.dhlAccountNumber, dhlCarrierCredentialsAllOf.dhlAccountNumber) &&
        Objects.equals(this.apiKey, dhlCarrierCredentialsAllOf.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, dhlGkUsername, dhlGKPassword, dhlAccountNumber, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DhlCarrierCredentialsAllOf {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    dhlGkUsername: ").append(toIndentedString(dhlGkUsername)).append("\n");
    sb.append("    dhlGKPassword: ").append(toIndentedString(dhlGKPassword)).append("\n");
    sb.append("    dhlAccountNumber: ").append(toIndentedString(dhlAccountNumber)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

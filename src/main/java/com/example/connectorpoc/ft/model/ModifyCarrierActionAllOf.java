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
import com.example.connectorpoc.ft.model.AbstractModifyCarrierCredentials;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ModifyCarrierActionAllOf
 */
@JsonPropertyOrder({
  ModifyCarrierActionAllOf.JSON_PROPERTY_ACTION,
  ModifyCarrierActionAllOf.JSON_PROPERTY_NAME,
  ModifyCarrierActionAllOf.JSON_PROPERTY_STATUS,
  ModifyCarrierActionAllOf.JSON_PROPERTY_CREDENTIALS
})
@JsonTypeName("ModifyCarrierAction_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class ModifyCarrierActionAllOf {
  /**
   * Use value &#39;ModifyCarrierAction&#39;, because you want to modify a carrier
   */
  public enum ActionEnum {
    MODIFYCARRIER("ModifyCarrier");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * It is taken into consideration for all carriers. Default: ACTIVE
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

  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  private AbstractModifyCarrierCredentials credentials;


  public ModifyCarrierActionAllOf action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Use value &#39;ModifyCarrierAction&#39;, because you want to modify a carrier
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Use value 'ModifyCarrierAction', because you want to modify a carrier")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public ModifyCarrierActionAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This is the well known name for a supported CEP partner. Can be adapted to the clients needs.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DHL Köln", value = "This is the well known name for a supported CEP partner. Can be adapted to the clients needs.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ModifyCarrierActionAllOf status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * It is taken into consideration for all carriers. Default: ACTIVE
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "It is taken into consideration for all carriers. Default: ACTIVE")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ModifyCarrierActionAllOf credentials(AbstractModifyCarrierCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbstractModifyCarrierCredentials getCredentials() {
    return credentials;
  }


  public void setCredentials(AbstractModifyCarrierCredentials credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyCarrierActionAllOf modifyCarrierActionAllOf = (ModifyCarrierActionAllOf) o;
    return Objects.equals(this.action, modifyCarrierActionAllOf.action) &&
        Objects.equals(this.name, modifyCarrierActionAllOf.name) &&
        Objects.equals(this.status, modifyCarrierActionAllOf.status) &&
        Objects.equals(this.credentials, modifyCarrierActionAllOf.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, name, status, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyCarrierActionAllOf {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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


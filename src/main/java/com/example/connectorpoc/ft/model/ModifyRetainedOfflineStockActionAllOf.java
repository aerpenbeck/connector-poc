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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ModifyRetainedOfflineStockActionAllOf
 */
@JsonPropertyOrder({
  ModifyRetainedOfflineStockActionAllOf.JSON_PROPERTY_ACTION,
  ModifyRetainedOfflineStockActionAllOf.JSON_PROPERTY_VALUE,
  ModifyRetainedOfflineStockActionAllOf.JSON_PROPERTY_ACTIVE
})
@JsonTypeName("ModifyRetainedOfflineStockAction_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class ModifyRetainedOfflineStockActionAllOf {
  /**
   * Use value &#39;ModifyRetainedOfflineStock&#39;, if you want to modify the retained offline stocks of a facility
   */
  public enum ActionEnum {
    MODIFYRETAINEDOFFLINESTOCK("ModifyRetainedOfflineStock");

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

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;


  public ModifyRetainedOfflineStockActionAllOf action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Use value &#39;ModifyRetainedOfflineStock&#39;, if you want to modify the retained offline stocks of a facility
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Use value 'ModifyRetainedOfflineStock', if you want to modify the retained offline stocks of a facility")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public ModifyRetainedOfflineStockActionAllOf value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * The overall percentage of stock that should be reserved to offline clients.
   * minimum: 0.01
   * maximum: 1
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.15", value = "The overall percentage of stock that should be reserved to offline clients.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public ModifyRetainedOfflineStockActionAllOf active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * The retained Offline Stock is enabled or disabled.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The retained Offline Stock is enabled or disabled.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyRetainedOfflineStockActionAllOf modifyRetainedOfflineStockActionAllOf = (ModifyRetainedOfflineStockActionAllOf) o;
    return Objects.equals(this.action, modifyRetainedOfflineStockActionAllOf.action) &&
        Objects.equals(this.value, modifyRetainedOfflineStockActionAllOf.value) &&
        Objects.equals(this.active, modifyRetainedOfflineStockActionAllOf.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, value, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyRetainedOfflineStockActionAllOf {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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


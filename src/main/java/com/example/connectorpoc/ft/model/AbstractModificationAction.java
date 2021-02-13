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
import com.example.connectorpoc.ft.model.ModifyCarrierAction;
import com.example.connectorpoc.ft.model.ModifyFacilityAction;
import com.example.connectorpoc.ft.model.ModifyHandoverjobAction;
import com.example.connectorpoc.ft.model.ModifyListingAction;
import com.example.connectorpoc.ft.model.ModifyListingReactivationAfterAction;
import com.example.connectorpoc.ft.model.ModifyPickJobAction;
import com.example.connectorpoc.ft.model.ModifyPickLineItemAction;
import com.example.connectorpoc.ft.model.ModifyRetainedOfflineStockAction;
import com.example.connectorpoc.ft.model.ModifyShipmentAction;
import com.example.connectorpoc.ft.model.ModifyShortpickAction;
import com.example.connectorpoc.ft.model.ModifyUserAction;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AbstractModificationAction
 */
@JsonPropertyOrder({
  AbstractModificationAction.JSON_PROPERTY_ACTION
})
@JsonTypeName("AbstractModificationAction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ModifyCarrierAction.class, name = "ModifyCarrierAction"),
  @JsonSubTypes.Type(value = ModifyFacilityAction.class, name = "ModifyFacilityAction"),
  @JsonSubTypes.Type(value = ModifyHandoverjobAction.class, name = "ModifyHandoverjobAction"),
  @JsonSubTypes.Type(value = ModifyListingAction.class, name = "ModifyListingAction"),
  @JsonSubTypes.Type(value = ModifyListingReactivationAfterAction.class, name = "ModifyListingReactivationAfterAction"),
  @JsonSubTypes.Type(value = ModifyPickJobAction.class, name = "ModifyPickJobAction"),
  @JsonSubTypes.Type(value = ModifyPickLineItemAction.class, name = "ModifyPickLineItemAction"),
  @JsonSubTypes.Type(value = ModifyRetainedOfflineStockAction.class, name = "ModifyRetainedOfflineStockAction"),
  @JsonSubTypes.Type(value = ModifyShipmentAction.class, name = "ModifyShipmentAction"),
  @JsonSubTypes.Type(value = ModifyShortpickAction.class, name = "ModifyShortpickAction"),
  @JsonSubTypes.Type(value = ModifyUserAction.class, name = "ModifyUserAction"),
})

public class AbstractModificationAction {
  /**
   * Use value &#39;ModifyPickJob&#39; when this action is regarding the Pickjob and &#39;ModifyPickLineItem&#39; if this action is operating against a pickline and &#39;ModifyFacility&#39; if you want to patch a facility 
   */
  public enum ActionEnum {
    MODIFYPICKJOB("ModifyPickJob"),
    
    MODIFYPICKLINEITEM("ModifyPickLineItem"),
    
    MODIFYFACILITY("ModifyFacility"),
    
    MODIFYLISTING("ModifyListing"),
    
    MODIFYRETAINEDOFFLINESTOCK("ModifyRetainedOfflineStock"),
    
    MODIFYLISTINGREACTIVATIONAFTER("ModifyListingReactivationAfter"),
    
    MODIFYUSER("ModifyUser"),
    
    MODIFYSHIPMENT("ModifyShipment"),
    
    MODIFYHANDOVERJOB("ModifyHandoverjob"),
    
    MODIFYCARRIER("ModifyCarrier"),
    
    MODIFYSHORTPICK("ModifyShortpick");

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
  protected ActionEnum action;


  public AbstractModificationAction action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

//   /**
//   * Use value &#39;ModifyPickJob&#39; when this action is regarding the Pickjob and &#39;ModifyPickLineItem&#39; if this action is operating against a pickline and &#39;ModifyFacility&#39; if you want to patch a facility
//   * @return action
//  **/
//  @ApiModelProperty(example = "<Use the corresponding action, see documentation>", required = true, value = "Use value 'ModifyPickJob' when this action is regarding the Pickjob and 'ModifyPickLineItem' if this action is operating against a pickline and 'ModifyFacility' if you want to patch a facility ")
//  @JsonProperty(JSON_PROPERTY_ACTION)
//  @JsonInclude(value = JsonInclude.Include.ALWAYS)
//
//  public ActionEnum getAction() {
//    return action;
//  }
//
//
//  public void setAction(ActionEnum action) {
//    this.action = action;
//  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractModificationAction abstractModificationAction = (AbstractModificationAction) o;
    return Objects.equals(this.action, abstractModificationAction.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractModificationAction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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


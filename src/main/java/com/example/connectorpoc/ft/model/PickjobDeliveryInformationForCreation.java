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
import com.example.connectorpoc.ft.model.PickjobDeliveryInformationForCreationDetails;
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
 * PickjobDeliveryInformationForCreation
 */
@JsonPropertyOrder({
  PickjobDeliveryInformationForCreation.JSON_PROPERTY_TARGET_TIME,
  PickjobDeliveryInformationForCreation.JSON_PROPERTY_CHANNEL,
  PickjobDeliveryInformationForCreation.JSON_PROPERTY_DETAILS
})
@JsonTypeName("PickjobDeliveryInformationForCreation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class PickjobDeliveryInformationForCreation {
  public static final String JSON_PROPERTY_TARGET_TIME = "targetTime";
  private OffsetDateTime targetTime;

  /**
   * Gets or Sets channel
   */
  public enum ChannelEnum {
    COLLECT("COLLECT"),
    
    SHIPPING("SHIPPING");

    private String value;

    ChannelEnum(String value) {
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
    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private ChannelEnum channel;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private PickjobDeliveryInformationForCreationDetails details;


  public PickjobDeliveryInformationForCreation targetTime(OffsetDateTime targetTime) {
    
    this.targetTime = targetTime;
    return this;
  }

   /**
   * At which time the result is expected.
   * @return targetTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-02-03T09:45:51.525Z", value = "At which time the result is expected.")
  @JsonProperty(JSON_PROPERTY_TARGET_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTargetTime() {
    return targetTime;
  }


  public void setTargetTime(OffsetDateTime targetTime) {
    this.targetTime = targetTime;
  }


  public PickjobDeliveryInformationForCreation channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public PickjobDeliveryInformationForCreation details(PickjobDeliveryInformationForCreationDetails details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PickjobDeliveryInformationForCreationDetails getDetails() {
    return details;
  }


  public void setDetails(PickjobDeliveryInformationForCreationDetails details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PickjobDeliveryInformationForCreation pickjobDeliveryInformationForCreation = (PickjobDeliveryInformationForCreation) o;
    return Objects.equals(this.targetTime, pickjobDeliveryInformationForCreation.targetTime) &&
        Objects.equals(this.channel, pickjobDeliveryInformationForCreation.channel) &&
        Objects.equals(this.details, pickjobDeliveryInformationForCreation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetTime, channel, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickjobDeliveryInformationForCreation {\n");
    sb.append("    targetTime: ").append(toIndentedString(targetTime)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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


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
import com.example.connectorpoc.ft.model.PickLineItemAllOf;
import com.example.connectorpoc.ft.model.PickLineItemArticle;
import com.example.connectorpoc.ft.model.PickLineItemForCreation;
import com.example.connectorpoc.ft.model.PickLineItemStatus;
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
 * PickLineItem
 */
@JsonPropertyOrder({
  PickLineItem.JSON_PROPERTY_ARTICLE,
  PickLineItem.JSON_PROPERTY_QUANTITY,
  PickLineItem.JSON_PROPERTY_SCANNABLE_CODES,
  PickLineItem.JSON_PROPERTY_CUSTOM_ATTRIBUTES,
  PickLineItem.JSON_PROPERTY_ID,
  PickLineItem.JSON_PROPERTY_PICKED,
  PickLineItem.JSON_PROPERTY_STATUS
})
@JsonTypeName("PickLineItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class PickLineItem {
  public static final String JSON_PROPERTY_ARTICLE = "article";
  private PickLineItemArticle article = null;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_SCANNABLE_CODES = "scannableCodes";
  private List<String> scannableCodes = null;

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES = "customAttributes";
  private Object customAttributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PICKED = "picked";
  private Long picked;

  public static final String JSON_PROPERTY_STATUS = "status";
  private PickLineItemStatus status;


  public PickLineItem article(PickLineItemArticle article) {
    
    this.article = article;
    return this;
  }

   /**
   * Get article
   * @return article
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ARTICLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PickLineItemArticle getArticle() {
    return article;
  }


  public void setArticle(PickLineItemArticle article) {
    this.article = article;
  }


  public PickLineItem quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity of the specific article that has been ordered
   * minimum: 1
   * @return quantity
  **/
  @ApiModelProperty(example = "21", required = true, value = "quantity of the specific article that has been ordered")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public PickLineItem scannableCodes(List<String> scannableCodes) {
    
    this.scannableCodes = scannableCodes;
    return this;
  }

  public PickLineItem addScannableCodesItem(String scannableCodesItem) {
    if (this.scannableCodes == null) {
      this.scannableCodes = new ArrayList<>();
    }
    this.scannableCodes.add(scannableCodesItem);
    return this;
  }

   /**
   * Get scannableCodes
   * @return scannableCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCANNABLE_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getScannableCodes() {
    return scannableCodes;
  }


  public void setScannableCodes(List<String> scannableCodes) {
    this.scannableCodes = scannableCodes;
  }


  public PickLineItem customAttributes(Object customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

   /**
   * Attributes that can be added to the orderline. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.
   * @return customAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes that can be added to the orderline. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(Object customAttributes) {
    this.customAttributes = customAttributes;
  }


  public PickLineItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of this lineItem. It is generated during creation automatically and suits as the primary identifier of the described entity.
   * @return id
  **/
  @ApiModelProperty(example = "climk4dcQFiPdA5ULuhS", required = true, value = "The id of this lineItem. It is generated during creation automatically and suits as the primary identifier of the described entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PickLineItem picked(Long picked) {
    
    this.picked = picked;
    return this;
  }

   /**
   * The amount of articles that were picked for this pickline.
   * minimum: 0
   * @return picked
  **/
  @ApiModelProperty(example = "20", required = true, value = "The amount of articles that were picked for this pickline.")
  @JsonProperty(JSON_PROPERTY_PICKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPicked() {
    return picked;
  }


  public void setPicked(Long picked) {
    this.picked = picked;
  }


  public PickLineItem status(PickLineItemStatus status) {
    
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

  public PickLineItemStatus getStatus() {
    return status;
  }


  public void setStatus(PickLineItemStatus status) {
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
    PickLineItem pickLineItem = (PickLineItem) o;
    return Objects.equals(this.article, pickLineItem.article) &&
        Objects.equals(this.quantity, pickLineItem.quantity) &&
        Objects.equals(this.scannableCodes, pickLineItem.scannableCodes) &&
        Objects.equals(this.customAttributes, pickLineItem.customAttributes) &&
        Objects.equals(this.id, pickLineItem.id) &&
        Objects.equals(this.picked, pickLineItem.picked) &&
        Objects.equals(this.status, pickLineItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(article, quantity, scannableCodes, customAttributes, id, picked, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PickLineItem {\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    scannableCodes: ").append(toIndentedString(scannableCodes)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    picked: ").append(toIndentedString(picked)).append("\n");
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

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
import com.example.connectorpoc.ft.model.OrderLineItemAllOf;
import com.example.connectorpoc.ft.model.OrderLineItemArticle;
import com.example.connectorpoc.ft.model.OrderLineItemForCreation;
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
 * OrderLineItem
 */
@JsonPropertyOrder({
  OrderLineItem.JSON_PROPERTY_ARTICLE,
  OrderLineItem.JSON_PROPERTY_QUANTITY,
  OrderLineItem.JSON_PROPERTY_SCANNABLE_CODES,
  OrderLineItem.JSON_PROPERTY_CUSTOM_ATTRIBUTES,
  OrderLineItem.JSON_PROPERTY_ID
})
@JsonTypeName("OrderLineItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class OrderLineItem {
  public static final String JSON_PROPERTY_ARTICLE = "article";
  private OrderLineItemArticle article = null;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_SCANNABLE_CODES = "scannableCodes";
  private List<String> scannableCodes = null;

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES = "customAttributes";
  private Object customAttributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public OrderLineItem article(OrderLineItemArticle article) {
    
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

  public OrderLineItemArticle getArticle() {
    return article;
  }


  public void setArticle(OrderLineItemArticle article) {
    this.article = article;
  }


  public OrderLineItem quantity(Long quantity) {
    
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


  public OrderLineItem scannableCodes(List<String> scannableCodes) {
    
    this.scannableCodes = scannableCodes;
    return this;
  }

  public OrderLineItem addScannableCodesItem(String scannableCodesItem) {
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


  public OrderLineItem customAttributes(Object customAttributes) {
    
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


  public OrderLineItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of this orderline. It is generated during creation automatically by the API and suits as the primary identifier of the described line.
   * @return id
  **/
  @ApiModelProperty(example = "LGMl2DuvPnfPoSHhYFOm", required = true, value = "The id of this orderline. It is generated during creation automatically by the API and suits as the primary identifier of the described line.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineItem orderLineItem = (OrderLineItem) o;
    return Objects.equals(this.article, orderLineItem.article) &&
        Objects.equals(this.quantity, orderLineItem.quantity) &&
        Objects.equals(this.scannableCodes, orderLineItem.scannableCodes) &&
        Objects.equals(this.customAttributes, orderLineItem.customAttributes) &&
        Objects.equals(this.id, orderLineItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(article, quantity, scannableCodes, customAttributes, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItem {\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    scannableCodes: ").append(toIndentedString(scannableCodes)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


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
import com.example.connectorpoc.ft.model.AbstractArticle;
import com.example.connectorpoc.ft.model.OrderArticleAttributeItem;
import com.example.connectorpoc.ft.model.OrderLineItemArticleAllOf;
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
 * OrderLineItemArticle
 */
@JsonPropertyOrder({
  OrderLineItemArticle.JSON_PROPERTY_TENANT_ARTICLE_ID,
  OrderLineItemArticle.JSON_PROPERTY_TITLE,
  OrderLineItemArticle.JSON_PROPERTY_IMAGE_URL,
  OrderLineItemArticle.JSON_PROPERTY_CUSTOM_ATTRIBUTES,
  OrderLineItemArticle.JSON_PROPERTY_ATTRIBUTES
})
@JsonTypeName("OrderLineItemArticle")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class OrderLineItemArticle {
  public static final String JSON_PROPERTY_TENANT_ARTICLE_ID = "tenantArticleId";
  private String tenantArticleId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES = "customAttributes";
  private Object customAttributes;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<OrderArticleAttributeItem> attributes = null;


  public OrderLineItemArticle tenantArticleId(String tenantArticleId) {
    
    this.tenantArticleId = tenantArticleId;
    return this;
  }

   /**
   * This is a reference to an article number
   * @return tenantArticleId
  **/
  @ApiModelProperty(example = "4711", required = true, value = "This is a reference to an article number")
  @JsonProperty(JSON_PROPERTY_TENANT_ARTICLE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTenantArticleId() {
    return tenantArticleId;
  }


  public void setTenantArticleId(String tenantArticleId) {
    this.tenantArticleId = tenantArticleId;
  }


  public OrderLineItemArticle title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Cologne Water", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public OrderLineItemArticle imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * A web link to a picture of this article. Please make sure that no authentication is required to fetch the image!
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A web link to a picture of this article. Please make sure that no authentication is required to fetch the image!")
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public OrderLineItemArticle customAttributes(Object customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

   /**
   * Attributes that can be added to the article. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.
   * @return customAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes that can be added to the article. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(Object customAttributes) {
    this.customAttributes = customAttributes;
  }


  public OrderLineItemArticle attributes(List<OrderArticleAttributeItem> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public OrderLineItemArticle addAttributesItem(OrderArticleAttributeItem attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderArticleAttributeItem> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<OrderArticleAttributeItem> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineItemArticle orderLineItemArticle = (OrderLineItemArticle) o;
    return Objects.equals(this.tenantArticleId, orderLineItemArticle.tenantArticleId) &&
        Objects.equals(this.title, orderLineItemArticle.title) &&
        Objects.equals(this.imageUrl, orderLineItemArticle.imageUrl) &&
        Objects.equals(this.customAttributes, orderLineItemArticle.customAttributes) &&
        Objects.equals(this.attributes, orderLineItemArticle.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantArticleId, title, imageUrl, customAttributes, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItemArticle {\n");
    sb.append("    tenantArticleId: ").append(toIndentedString(tenantArticleId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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


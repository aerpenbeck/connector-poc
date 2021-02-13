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
import com.example.connectorpoc.ft.model.AbstractModificationAction;
import com.example.connectorpoc.ft.model.ListingAttributeItem;
import com.example.connectorpoc.ft.model.ModifyListingActionAllOf;
import com.example.connectorpoc.ft.model.StockInformation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ModifyListingAction
 */
@JsonPropertyOrder({
  ModifyListingAction.JSON_PROPERTY_ACTION,
  ModifyListingAction.JSON_PROPERTY_PRICE,
  ModifyListingAction.JSON_PROPERTY_STOCKINFORMATION,
  ModifyListingAction.JSON_PROPERTY_TITLE,
  ModifyListingAction.JSON_PROPERTY_SUBTITLE,
  ModifyListingAction.JSON_PROPERTY_IMAGE_URL,
  ModifyListingAction.JSON_PROPERTY_STATUS,
  ModifyListingAction.JSON_PROPERTY_ATTRIBUTES
})
@JsonTypeName("ModifyListingAction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", visible = true)

public class ModifyListingAction extends AbstractModificationAction {
  /**
   * Use value &#39;ModifyListing&#39;, because you want to modify a listing
   */
  public enum ActionEnum {
    MODIFYLISTING("ModifyListing");

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

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_STOCKINFORMATION = "stockinformation";
  private StockInformation stockinformation;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_SUBTITLE = "subtitle";
  private String subtitle;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  /**
   * The status indicates if a listing is available or not
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

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<ListingAttributeItem> attributes = null;


  public ModifyListingAction action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Use value &#39;ModifyListing&#39;, because you want to modify a listing
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Use value 'ModifyListing', because you want to modify a listing")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public ModifyListingAction price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1200.0", value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public ModifyListingAction stockinformation(StockInformation stockinformation) {
    
    this.stockinformation = stockinformation;
    return this;
  }

   /**
   * Get stockinformation
   * @return stockinformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STOCKINFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockInformation getStockinformation() {
    return stockinformation;
  }


  public void setStockinformation(StockInformation stockinformation) {
    this.stockinformation = stockinformation;
  }


  public ModifyListingAction title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * a title describing the article
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Adidas Superstar", value = "a title describing the article")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ModifyListingAction subtitle(String subtitle) {
    
    this.subtitle = subtitle;
    return this;
  }

   /**
   * a subtitle describing the article
   * @return subtitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "44 2/3", value = "a subtitle describing the article")
  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubtitle() {
    return subtitle;
  }


  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public ModifyListingAction imageUrl(String imageUrl) {
    
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


  public ModifyListingAction status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status indicates if a listing is available or not
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status indicates if a listing is available or not")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ModifyListingAction attributes(List<ListingAttributeItem> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ModifyListingAction addAttributesItem(ListingAttributeItem attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * The attributes of this listing
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attributes of this listing")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListingAttributeItem> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<ListingAttributeItem> attributes) {
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
    ModifyListingAction modifyListingAction = (ModifyListingAction) o;
    return Objects.equals(this.action, modifyListingAction.action) &&
        Objects.equals(this.price, modifyListingAction.price) &&
        Objects.equals(this.stockinformation, modifyListingAction.stockinformation) &&
        Objects.equals(this.title, modifyListingAction.title) &&
        Objects.equals(this.subtitle, modifyListingAction.subtitle) &&
        Objects.equals(this.imageUrl, modifyListingAction.imageUrl) &&
        Objects.equals(this.status, modifyListingAction.status) &&
        Objects.equals(this.attributes, modifyListingAction.attributes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, price, stockinformation, title, subtitle, imageUrl, status, attributes, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyListingAction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stockinformation: ").append(toIndentedString(stockinformation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

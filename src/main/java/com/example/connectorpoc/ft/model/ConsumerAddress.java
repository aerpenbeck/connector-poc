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
import com.example.connectorpoc.ft.model.Address;
import com.example.connectorpoc.ft.model.AddressPhoneNumbers;
import com.example.connectorpoc.ft.model.ConsumerAddressAllOf;
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
 * ConsumerAddress
 */
@JsonPropertyOrder({
  ConsumerAddress.JSON_PROPERTY_STREET,
  ConsumerAddress.JSON_PROPERTY_HOUSE_NUMBER,
  ConsumerAddress.JSON_PROPERTY_POSTAL_CODE,
  ConsumerAddress.JSON_PROPERTY_CITY,
  ConsumerAddress.JSON_PROPERTY_COUNTRY,
  ConsumerAddress.JSON_PROPERTY_PHONE_NUMBERS,
  ConsumerAddress.JSON_PROPERTY_ADDITIONAL_ADDRESS_INFO,
  ConsumerAddress.JSON_PROPERTY_CUSTOM_ATTRIBUTES,
  ConsumerAddress.JSON_PROPERTY_SALUTATION,
  ConsumerAddress.JSON_PROPERTY_FIRST_NAME,
  ConsumerAddress.JSON_PROPERTY_LAST_NAME,
  ConsumerAddress.JSON_PROPERTY_COMPANY_NAME
})
@JsonTypeName("ConsumerAddress")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-13T17:37:48.618828+01:00[Europe/Berlin]")
public class ConsumerAddress {
  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_HOUSE_NUMBER = "houseNumber";
  private String houseNumber;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phoneNumbers";
  private List<AddressPhoneNumbers> phoneNumbers = null;

  public static final String JSON_PROPERTY_ADDITIONAL_ADDRESS_INFO = "additionalAddressInfo";
  private String additionalAddressInfo;

  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES = "customAttributes";
  private Object customAttributes;

  public static final String JSON_PROPERTY_SALUTATION = "salutation";
  private String salutation;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;


  public ConsumerAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(example = "Hauptstr.", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public ConsumerAddress houseNumber(String houseNumber) {
    
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * Get houseNumber
   * @return houseNumber
  **/
  @ApiModelProperty(example = "42a", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHouseNumber() {
    return houseNumber;
  }


  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }


  public ConsumerAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "40764", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ConsumerAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Langenfeld", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ConsumerAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * A two-digit country code as per ISO 3166-1 alpha-2
   * @return country
  **/
  @ApiModelProperty(example = "DE", required = true, value = "A two-digit country code as per ISO 3166-1 alpha-2")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ConsumerAddress phoneNumbers(List<AddressPhoneNumbers> phoneNumbers) {
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public ConsumerAddress addPhoneNumbersItem(AddressPhoneNumbers phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddressPhoneNumbers> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<AddressPhoneNumbers> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public ConsumerAddress additionalAddressInfo(String additionalAddressInfo) {
    
    this.additionalAddressInfo = additionalAddressInfo;
    return this;
  }

   /**
   * Get additionalAddressInfo
   * @return additionalAddressInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "to care of: Mrs. Müller", value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ADDRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalAddressInfo() {
    return additionalAddressInfo;
  }


  public void setAdditionalAddressInfo(String additionalAddressInfo) {
    this.additionalAddressInfo = additionalAddressInfo;
  }


  public ConsumerAddress customAttributes(Object customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

   /**
   * Attributes that can be added to the address. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.
   * @return customAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes that can be added to the address. These attributes cannot be used within fulfillment processes, but it could be useful to have the informations carried here.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(Object customAttributes) {
    this.customAttributes = customAttributes;
  }


  public ConsumerAddress salutation(String salutation) {
    
    this.salutation = salutation;
    return this;
  }

   /**
   * Get salutation
   * @return salutation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Frau", value = "")
  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalutation() {
    return salutation;
  }


  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }


  public ConsumerAddress firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Maxine", value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ConsumerAddress lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Muller", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ConsumerAddress companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Speedy Boxales Ltd.", value = "")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerAddress consumerAddress = (ConsumerAddress) o;
    return Objects.equals(this.street, consumerAddress.street) &&
        Objects.equals(this.houseNumber, consumerAddress.houseNumber) &&
        Objects.equals(this.postalCode, consumerAddress.postalCode) &&
        Objects.equals(this.city, consumerAddress.city) &&
        Objects.equals(this.country, consumerAddress.country) &&
        Objects.equals(this.phoneNumbers, consumerAddress.phoneNumbers) &&
        Objects.equals(this.additionalAddressInfo, consumerAddress.additionalAddressInfo) &&
        Objects.equals(this.customAttributes, consumerAddress.customAttributes) &&
        Objects.equals(this.salutation, consumerAddress.salutation) &&
        Objects.equals(this.firstName, consumerAddress.firstName) &&
        Objects.equals(this.lastName, consumerAddress.lastName) &&
        Objects.equals(this.companyName, consumerAddress.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, houseNumber, postalCode, city, country, phoneNumbers, additionalAddressInfo, customAttributes, salutation, firstName, lastName, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    additionalAddressInfo: ").append(toIndentedString(additionalAddressInfo)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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


/*
 * Stroom API
 * Various APIs for interacting with Stroom and its data
 *
 * OpenAPI spec version: v1/v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InfoPopupConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class InfoPopupConfig {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("validationRegex")
  private String validationRegex = null;

  public InfoPopupConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public InfoPopupConfig title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InfoPopupConfig validationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
    return this;
  }

   /**
   * Get validationRegex
   * @return validationRegex
  **/
  @Schema(description = "")
  public String getValidationRegex() {
    return validationRegex;
  }

  public void setValidationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoPopupConfig infoPopupConfig = (InfoPopupConfig) o;
    return Objects.equals(this.enabled, infoPopupConfig.enabled) &&
        Objects.equals(this.title, infoPopupConfig.title) &&
        Objects.equals(this.validationRegex, infoPopupConfig.validationRegex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, title, validationRegex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoPopupConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    validationRegex: ").append(toIndentedString(validationRegex)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
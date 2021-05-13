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
import io.swagger.client.model.Size;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LayoutConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")

public class LayoutConfig {
  @SerializedName("preferredSize")
  private Size preferredSize = null;

  @SerializedName("type")
  private String type = null;

  public LayoutConfig() {
    this.type = this.getClass().getSimpleName();
  }
  public LayoutConfig preferredSize(Size preferredSize) {
    this.preferredSize = preferredSize;
    return this;
  }

   /**
   * Get preferredSize
   * @return preferredSize
  **/
  @Schema(description = "")
  public Size getPreferredSize() {
    return preferredSize;
  }

  public void setPreferredSize(Size preferredSize) {
    this.preferredSize = preferredSize;
  }

  public LayoutConfig type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayoutConfig layoutConfig = (LayoutConfig) o;
    return Objects.equals(this.preferredSize, layoutConfig.preferredSize) &&
        Objects.equals(this.type, layoutConfig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredSize, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayoutConfig {\n");
    
    sb.append("    preferredSize: ").append(toIndentedString(preferredSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
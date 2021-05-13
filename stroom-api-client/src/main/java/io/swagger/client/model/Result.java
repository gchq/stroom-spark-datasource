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
 * Base object for describing a set of result data
 */
@Schema(description = "Base object for describing a set of result data")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")

public class Result {
  @SerializedName("componentId")
  private String componentId = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("type")
  private String type = null;

  public Result() {
    this.type = this.getClass().getSimpleName();
  }
  public Result componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * The ID of the component that this result set was requested for. See ResultRequest in SearchRequest
   * @return componentId
  **/
  @Schema(required = true, description = "The ID of the component that this result set was requested for. See ResultRequest in SearchRequest")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public Result error(String error) {
    this.error = error;
    return this;
  }

   /**
   * If an error has occurred producing this result set then this will have details of the error
   * @return error
  **/
  @Schema(description = "If an error has occurred producing this result set then this will have details of the error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Result type(String type) {
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
    Result result = (Result) o;
    return Objects.equals(this.componentId, result.componentId) &&
        Objects.equals(this.error, result.error) &&
        Objects.equals(this.type, result.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, error, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
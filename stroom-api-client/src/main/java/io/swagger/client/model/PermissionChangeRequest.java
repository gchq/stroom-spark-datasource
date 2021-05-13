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
import io.swagger.client.model.PermissionChangeEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PermissionChangeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class PermissionChangeRequest {
  @SerializedName("event")
  private PermissionChangeEvent event = null;

  public PermissionChangeRequest event(PermissionChangeEvent event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(description = "")
  public PermissionChangeEvent getEvent() {
    return event;
  }

  public void setEvent(PermissionChangeEvent event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionChangeRequest permissionChangeRequest = (PermissionChangeRequest) o;
    return Objects.equals(this.event, permissionChangeRequest.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionChangeRequest {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

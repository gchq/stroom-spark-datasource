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
 * AddPermissionEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class AddPermissionEvent extends PermissionChangeEvent {
  @SerializedName("documentUuid")
  private String documentUuid = null;

  @SerializedName("permission")
  private String permission = null;

  @SerializedName("userUuid")
  private String userUuid = null;

  public AddPermissionEvent documentUuid(String documentUuid) {
    this.documentUuid = documentUuid;
    return this;
  }

   /**
   * Get documentUuid
   * @return documentUuid
  **/
  @Schema(description = "")
  public String getDocumentUuid() {
    return documentUuid;
  }

  public void setDocumentUuid(String documentUuid) {
    this.documentUuid = documentUuid;
  }

  public AddPermissionEvent permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @Schema(description = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public AddPermissionEvent userUuid(String userUuid) {
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @Schema(description = "")
  public String getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPermissionEvent addPermissionEvent = (AddPermissionEvent) o;
    return Objects.equals(this.documentUuid, addPermissionEvent.documentUuid) &&
        Objects.equals(this.permission, addPermissionEvent.permission) &&
        Objects.equals(this.userUuid, addPermissionEvent.userUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentUuid, permission, userUuid, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPermissionEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    documentUuid: ").append(toIndentedString(documentUuid)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
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
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
 * ChangePasswordResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class ChangePasswordResponse {
  @SerializedName("changeSucceeded")
  private Boolean changeSucceeded = null;

  @SerializedName("forceSignIn")
  private Boolean forceSignIn = null;

  @SerializedName("message")
  private String message = null;

  public ChangePasswordResponse changeSucceeded(Boolean changeSucceeded) {
    this.changeSucceeded = changeSucceeded;
    return this;
  }

   /**
   * Get changeSucceeded
   * @return changeSucceeded
  **/
  @Schema(description = "")
  public Boolean isChangeSucceeded() {
    return changeSucceeded;
  }

  public void setChangeSucceeded(Boolean changeSucceeded) {
    this.changeSucceeded = changeSucceeded;
  }

  public ChangePasswordResponse forceSignIn(Boolean forceSignIn) {
    this.forceSignIn = forceSignIn;
    return this;
  }

   /**
   * Get forceSignIn
   * @return forceSignIn
  **/
  @Schema(description = "")
  public Boolean isForceSignIn() {
    return forceSignIn;
  }

  public void setForceSignIn(Boolean forceSignIn) {
    this.forceSignIn = forceSignIn;
  }

  public ChangePasswordResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordResponse changePasswordResponse = (ChangePasswordResponse) o;
    return Objects.equals(this.changeSucceeded, changePasswordResponse.changeSucceeded) &&
        Objects.equals(this.forceSignIn, changePasswordResponse.forceSignIn) &&
        Objects.equals(this.message, changePasswordResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeSucceeded, forceSignIn, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordResponse {\n");
    
    sb.append("    changeSucceeded: ").append(toIndentedString(changeSucceeded)).append("\n");
    sb.append("    forceSignIn: ").append(toIndentedString(forceSignIn)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

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
 * CreateAccountRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class CreateAccountRequest {
  @SerializedName("comments")
  private String comments = null;

  @SerializedName("confirmPassword")
  private String confirmPassword = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("forcePasswordChange")
  private Boolean forcePasswordChange = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("neverExpires")
  private Boolean neverExpires = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("userId")
  private String userId = null;

  public CreateAccountRequest comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Schema(description = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public CreateAccountRequest confirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
    return this;
  }

   /**
   * Get confirmPassword
   * @return confirmPassword
  **/
  @Schema(description = "")
  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  public CreateAccountRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateAccountRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateAccountRequest forcePasswordChange(Boolean forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
    return this;
  }

   /**
   * Get forcePasswordChange
   * @return forcePasswordChange
  **/
  @Schema(description = "")
  public Boolean isForcePasswordChange() {
    return forcePasswordChange;
  }

  public void setForcePasswordChange(Boolean forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
  }

  public CreateAccountRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateAccountRequest neverExpires(Boolean neverExpires) {
    this.neverExpires = neverExpires;
    return this;
  }

   /**
   * Get neverExpires
   * @return neverExpires
  **/
  @Schema(description = "")
  public Boolean isNeverExpires() {
    return neverExpires;
  }

  public void setNeverExpires(Boolean neverExpires) {
    this.neverExpires = neverExpires;
  }

  public CreateAccountRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateAccountRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
    return Objects.equals(this.comments, createAccountRequest.comments) &&
        Objects.equals(this.confirmPassword, createAccountRequest.confirmPassword) &&
        Objects.equals(this.email, createAccountRequest.email) &&
        Objects.equals(this.firstName, createAccountRequest.firstName) &&
        Objects.equals(this.forcePasswordChange, createAccountRequest.forcePasswordChange) &&
        Objects.equals(this.lastName, createAccountRequest.lastName) &&
        Objects.equals(this.neverExpires, createAccountRequest.neverExpires) &&
        Objects.equals(this.password, createAccountRequest.password) &&
        Objects.equals(this.userId, createAccountRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, confirmPassword, email, firstName, forcePasswordChange, lastName, neverExpires, password, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRequest {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    confirmPassword: ").append(toIndentedString(confirmPassword)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    forcePasswordChange: ").append(toIndentedString(forcePasswordChange)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    neverExpires: ").append(toIndentedString(neverExpires)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
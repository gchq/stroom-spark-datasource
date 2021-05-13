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
import io.swagger.client.model.DocRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DocRefInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DocRefInfo {
  @SerializedName("createTime")
  private Long createTime = null;

  @SerializedName("createUser")
  private String createUser = null;

  @SerializedName("docRef")
  private DocRef docRef = null;

  @SerializedName("otherInfo")
  private String otherInfo = null;

  @SerializedName("updateTime")
  private Long updateTime = null;

  @SerializedName("updateUser")
  private String updateUser = null;

  public DocRefInfo createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public DocRefInfo createUser(String createUser) {
    this.createUser = createUser;
    return this;
  }

   /**
   * Get createUser
   * @return createUser
  **/
  @Schema(description = "")
  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public DocRefInfo docRef(DocRef docRef) {
    this.docRef = docRef;
    return this;
  }

   /**
   * Get docRef
   * @return docRef
  **/
  @Schema(description = "")
  public DocRef getDocRef() {
    return docRef;
  }

  public void setDocRef(DocRef docRef) {
    this.docRef = docRef;
  }

  public DocRefInfo otherInfo(String otherInfo) {
    this.otherInfo = otherInfo;
    return this;
  }

   /**
   * Get otherInfo
   * @return otherInfo
  **/
  @Schema(description = "")
  public String getOtherInfo() {
    return otherInfo;
  }

  public void setOtherInfo(String otherInfo) {
    this.otherInfo = otherInfo;
  }

  public DocRefInfo updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public Long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }

  public DocRefInfo updateUser(String updateUser) {
    this.updateUser = updateUser;
    return this;
  }

   /**
   * Get updateUser
   * @return updateUser
  **/
  @Schema(description = "")
  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocRefInfo docRefInfo = (DocRefInfo) o;
    return Objects.equals(this.createTime, docRefInfo.createTime) &&
        Objects.equals(this.createUser, docRefInfo.createUser) &&
        Objects.equals(this.docRef, docRefInfo.docRef) &&
        Objects.equals(this.otherInfo, docRefInfo.otherInfo) &&
        Objects.equals(this.updateTime, docRefInfo.updateTime) &&
        Objects.equals(this.updateUser, docRefInfo.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, createUser, docRef, otherInfo, updateTime, updateUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocRefInfo {\n");
    
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    docRef: ").append(toIndentedString(docRef)).append("\n");
    sb.append("    otherInfo: ").append(toIndentedString(otherInfo)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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
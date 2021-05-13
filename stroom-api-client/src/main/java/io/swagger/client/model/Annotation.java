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
 * Annotation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class Annotation {
  @SerializedName("assignedTo")
  private String assignedTo = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("createTime")
  private Long createTime = null;

  @SerializedName("createUser")
  private String createUser = null;

  @SerializedName("history")
  private String history = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("updateTime")
  private Long updateTime = null;

  @SerializedName("updateUser")
  private String updateUser = null;

  @SerializedName("version")
  private Integer version = null;

  public Annotation assignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * Get assignedTo
   * @return assignedTo
  **/
  @Schema(description = "")
  public String getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
  }

  public Annotation comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Annotation createTime(Long createTime) {
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

  public Annotation createUser(String createUser) {
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

  public Annotation history(String history) {
    this.history = history;
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @Schema(description = "")
  public String getHistory() {
    return history;
  }

  public void setHistory(String history) {
    this.history = history;
  }

  public Annotation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Annotation status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Annotation subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @Schema(description = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Annotation title(String title) {
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

  public Annotation updateTime(Long updateTime) {
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

  public Annotation updateUser(String updateUser) {
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

  public Annotation version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annotation annotation = (Annotation) o;
    return Objects.equals(this.assignedTo, annotation.assignedTo) &&
        Objects.equals(this.comment, annotation.comment) &&
        Objects.equals(this.createTime, annotation.createTime) &&
        Objects.equals(this.createUser, annotation.createUser) &&
        Objects.equals(this.history, annotation.history) &&
        Objects.equals(this.id, annotation.id) &&
        Objects.equals(this.status, annotation.status) &&
        Objects.equals(this.subject, annotation.subject) &&
        Objects.equals(this.title, annotation.title) &&
        Objects.equals(this.updateTime, annotation.updateTime) &&
        Objects.equals(this.updateUser, annotation.updateUser) &&
        Objects.equals(this.version, annotation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedTo, comment, createTime, createUser, history, id, status, subject, title, updateTime, updateUser, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
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
 * Processor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class Processor {
  @SerializedName("createTimeMs")
  private Long createTimeMs = null;

  @SerializedName("createUser")
  private String createUser = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("pipelineName")
  private String pipelineName = null;

  @SerializedName("pipelineUuid")
  private String pipelineUuid = null;

  @SerializedName("taskType")
  private String taskType = null;

  @SerializedName("updateTimeMs")
  private Long updateTimeMs = null;

  @SerializedName("updateUser")
  private String updateUser = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("version")
  private Integer version = null;

  public Processor createTimeMs(Long createTimeMs) {
    this.createTimeMs = createTimeMs;
    return this;
  }

   /**
   * Get createTimeMs
   * @return createTimeMs
  **/
  @Schema(description = "")
  public Long getCreateTimeMs() {
    return createTimeMs;
  }

  public void setCreateTimeMs(Long createTimeMs) {
    this.createTimeMs = createTimeMs;
  }

  public Processor createUser(String createUser) {
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

  public Processor deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Processor enabled(Boolean enabled) {
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

  public Processor id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Processor pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

   /**
   * Get pipelineName
   * @return pipelineName
  **/
  @Schema(description = "")
  public String getPipelineName() {
    return pipelineName;
  }

  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }

  public Processor pipelineUuid(String pipelineUuid) {
    this.pipelineUuid = pipelineUuid;
    return this;
  }

   /**
   * Get pipelineUuid
   * @return pipelineUuid
  **/
  @Schema(description = "")
  public String getPipelineUuid() {
    return pipelineUuid;
  }

  public void setPipelineUuid(String pipelineUuid) {
    this.pipelineUuid = pipelineUuid;
  }

  public Processor taskType(String taskType) {
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @Schema(description = "")
  public String getTaskType() {
    return taskType;
  }

  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }

  public Processor updateTimeMs(Long updateTimeMs) {
    this.updateTimeMs = updateTimeMs;
    return this;
  }

   /**
   * Get updateTimeMs
   * @return updateTimeMs
  **/
  @Schema(description = "")
  public Long getUpdateTimeMs() {
    return updateTimeMs;
  }

  public void setUpdateTimeMs(Long updateTimeMs) {
    this.updateTimeMs = updateTimeMs;
  }

  public Processor updateUser(String updateUser) {
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

  public Processor uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Processor version(Integer version) {
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
    Processor processor = (Processor) o;
    return Objects.equals(this.createTimeMs, processor.createTimeMs) &&
        Objects.equals(this.createUser, processor.createUser) &&
        Objects.equals(this.deleted, processor.deleted) &&
        Objects.equals(this.enabled, processor.enabled) &&
        Objects.equals(this.id, processor.id) &&
        Objects.equals(this.pipelineName, processor.pipelineName) &&
        Objects.equals(this.pipelineUuid, processor.pipelineUuid) &&
        Objects.equals(this.taskType, processor.taskType) &&
        Objects.equals(this.updateTimeMs, processor.updateTimeMs) &&
        Objects.equals(this.updateUser, processor.updateUser) &&
        Objects.equals(this.uuid, processor.uuid) &&
        Objects.equals(this.version, processor.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTimeMs, createUser, deleted, enabled, id, pipelineName, pipelineUuid, taskType, updateTimeMs, updateUser, uuid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor {\n");
    
    sb.append("    createTimeMs: ").append(toIndentedString(createTimeMs)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    pipelineUuid: ").append(toIndentedString(pipelineUuid)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    updateTimeMs: ").append(toIndentedString(updateTimeMs)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

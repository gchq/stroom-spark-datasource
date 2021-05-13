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
import io.swagger.client.model.Processor;
import io.swagger.client.model.ProcessorFilterTracker;
import io.swagger.client.model.QueryData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProcessorFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class ProcessorFilter {
  @SerializedName("createTimeMs")
  private Long createTimeMs = null;

  @SerializedName("createUser")
  private String createUser = null;

  @SerializedName("data")
  private String data = null;

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

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("processor")
  private Processor processor = null;

  @SerializedName("processorFilterTracker")
  private ProcessorFilterTracker processorFilterTracker = null;

  @SerializedName("processorUuid")
  private String processorUuid = null;

  @SerializedName("queryData")
  private QueryData queryData = null;

  @SerializedName("reprocess")
  private Boolean reprocess = null;

  @SerializedName("updateTimeMs")
  private Long updateTimeMs = null;

  @SerializedName("updateUser")
  private String updateUser = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("version")
  private Integer version = null;

  public ProcessorFilter createTimeMs(Long createTimeMs) {
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

  public ProcessorFilter createUser(String createUser) {
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

  public ProcessorFilter data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ProcessorFilter deleted(Boolean deleted) {
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

  public ProcessorFilter enabled(Boolean enabled) {
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

  public ProcessorFilter id(Integer id) {
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

  public ProcessorFilter pipelineName(String pipelineName) {
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

  public ProcessorFilter pipelineUuid(String pipelineUuid) {
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

  public ProcessorFilter priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ProcessorFilter processor(Processor processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @Schema(description = "")
  public Processor getProcessor() {
    return processor;
  }

  public void setProcessor(Processor processor) {
    this.processor = processor;
  }

  public ProcessorFilter processorFilterTracker(ProcessorFilterTracker processorFilterTracker) {
    this.processorFilterTracker = processorFilterTracker;
    return this;
  }

   /**
   * Get processorFilterTracker
   * @return processorFilterTracker
  **/
  @Schema(description = "")
  public ProcessorFilterTracker getProcessorFilterTracker() {
    return processorFilterTracker;
  }

  public void setProcessorFilterTracker(ProcessorFilterTracker processorFilterTracker) {
    this.processorFilterTracker = processorFilterTracker;
  }

  public ProcessorFilter processorUuid(String processorUuid) {
    this.processorUuid = processorUuid;
    return this;
  }

   /**
   * Get processorUuid
   * @return processorUuid
  **/
  @Schema(description = "")
  public String getProcessorUuid() {
    return processorUuid;
  }

  public void setProcessorUuid(String processorUuid) {
    this.processorUuid = processorUuid;
  }

  public ProcessorFilter queryData(QueryData queryData) {
    this.queryData = queryData;
    return this;
  }

   /**
   * Get queryData
   * @return queryData
  **/
  @Schema(description = "")
  public QueryData getQueryData() {
    return queryData;
  }

  public void setQueryData(QueryData queryData) {
    this.queryData = queryData;
  }

  public ProcessorFilter reprocess(Boolean reprocess) {
    this.reprocess = reprocess;
    return this;
  }

   /**
   * Get reprocess
   * @return reprocess
  **/
  @Schema(description = "")
  public Boolean isReprocess() {
    return reprocess;
  }

  public void setReprocess(Boolean reprocess) {
    this.reprocess = reprocess;
  }

  public ProcessorFilter updateTimeMs(Long updateTimeMs) {
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

  public ProcessorFilter updateUser(String updateUser) {
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

  public ProcessorFilter uuid(String uuid) {
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

  public ProcessorFilter version(Integer version) {
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
    ProcessorFilter processorFilter = (ProcessorFilter) o;
    return Objects.equals(this.createTimeMs, processorFilter.createTimeMs) &&
        Objects.equals(this.createUser, processorFilter.createUser) &&
        Objects.equals(this.data, processorFilter.data) &&
        Objects.equals(this.deleted, processorFilter.deleted) &&
        Objects.equals(this.enabled, processorFilter.enabled) &&
        Objects.equals(this.id, processorFilter.id) &&
        Objects.equals(this.pipelineName, processorFilter.pipelineName) &&
        Objects.equals(this.pipelineUuid, processorFilter.pipelineUuid) &&
        Objects.equals(this.priority, processorFilter.priority) &&
        Objects.equals(this.processor, processorFilter.processor) &&
        Objects.equals(this.processorFilterTracker, processorFilter.processorFilterTracker) &&
        Objects.equals(this.processorUuid, processorFilter.processorUuid) &&
        Objects.equals(this.queryData, processorFilter.queryData) &&
        Objects.equals(this.reprocess, processorFilter.reprocess) &&
        Objects.equals(this.updateTimeMs, processorFilter.updateTimeMs) &&
        Objects.equals(this.updateUser, processorFilter.updateUser) &&
        Objects.equals(this.uuid, processorFilter.uuid) &&
        Objects.equals(this.version, processorFilter.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTimeMs, createUser, data, deleted, enabled, id, pipelineName, pipelineUuid, priority, processor, processorFilterTracker, processorUuid, queryData, reprocess, updateTimeMs, updateUser, uuid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorFilter {\n");
    
    sb.append("    createTimeMs: ").append(toIndentedString(createTimeMs)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    pipelineUuid: ").append(toIndentedString(pipelineUuid)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    processorFilterTracker: ").append(toIndentedString(processorFilterTracker)).append("\n");
    sb.append("    processorUuid: ").append(toIndentedString(processorUuid)).append("\n");
    sb.append("    queryData: ").append(toIndentedString(queryData)).append("\n");
    sb.append("    reprocess: ").append(toIndentedString(reprocess)).append("\n");
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

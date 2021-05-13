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
 * ProcessorFilterTracker
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class ProcessorFilterTracker {
  @SerializedName("eventCount")
  private Long eventCount = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lastPollMs")
  private Long lastPollMs = null;

  @SerializedName("lastPollTaskCount")
  private Integer lastPollTaskCount = null;

  @SerializedName("maxMetaCreateMs")
  private Long maxMetaCreateMs = null;

  @SerializedName("metaCount")
  private Long metaCount = null;

  @SerializedName("metaCreateMs")
  private Long metaCreateMs = null;

  @SerializedName("minEventId")
  private Long minEventId = null;

  @SerializedName("minMetaCreateMs")
  private Long minMetaCreateMs = null;

  @SerializedName("minMetaId")
  private Long minMetaId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("version")
  private Integer version = null;

  public ProcessorFilterTracker eventCount(Long eventCount) {
    this.eventCount = eventCount;
    return this;
  }

   /**
   * Get eventCount
   * @return eventCount
  **/
  @Schema(description = "")
  public Long getEventCount() {
    return eventCount;
  }

  public void setEventCount(Long eventCount) {
    this.eventCount = eventCount;
  }

  public ProcessorFilterTracker id(Integer id) {
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

  public ProcessorFilterTracker lastPollMs(Long lastPollMs) {
    this.lastPollMs = lastPollMs;
    return this;
  }

   /**
   * Get lastPollMs
   * @return lastPollMs
  **/
  @Schema(description = "")
  public Long getLastPollMs() {
    return lastPollMs;
  }

  public void setLastPollMs(Long lastPollMs) {
    this.lastPollMs = lastPollMs;
  }

  public ProcessorFilterTracker lastPollTaskCount(Integer lastPollTaskCount) {
    this.lastPollTaskCount = lastPollTaskCount;
    return this;
  }

   /**
   * Get lastPollTaskCount
   * @return lastPollTaskCount
  **/
  @Schema(description = "")
  public Integer getLastPollTaskCount() {
    return lastPollTaskCount;
  }

  public void setLastPollTaskCount(Integer lastPollTaskCount) {
    this.lastPollTaskCount = lastPollTaskCount;
  }

  public ProcessorFilterTracker maxMetaCreateMs(Long maxMetaCreateMs) {
    this.maxMetaCreateMs = maxMetaCreateMs;
    return this;
  }

   /**
   * Get maxMetaCreateMs
   * @return maxMetaCreateMs
  **/
  @Schema(description = "")
  public Long getMaxMetaCreateMs() {
    return maxMetaCreateMs;
  }

  public void setMaxMetaCreateMs(Long maxMetaCreateMs) {
    this.maxMetaCreateMs = maxMetaCreateMs;
  }

  public ProcessorFilterTracker metaCount(Long metaCount) {
    this.metaCount = metaCount;
    return this;
  }

   /**
   * Get metaCount
   * @return metaCount
  **/
  @Schema(description = "")
  public Long getMetaCount() {
    return metaCount;
  }

  public void setMetaCount(Long metaCount) {
    this.metaCount = metaCount;
  }

  public ProcessorFilterTracker metaCreateMs(Long metaCreateMs) {
    this.metaCreateMs = metaCreateMs;
    return this;
  }

   /**
   * Get metaCreateMs
   * @return metaCreateMs
  **/
  @Schema(description = "")
  public Long getMetaCreateMs() {
    return metaCreateMs;
  }

  public void setMetaCreateMs(Long metaCreateMs) {
    this.metaCreateMs = metaCreateMs;
  }

  public ProcessorFilterTracker minEventId(Long minEventId) {
    this.minEventId = minEventId;
    return this;
  }

   /**
   * Get minEventId
   * @return minEventId
  **/
  @Schema(description = "")
  public Long getMinEventId() {
    return minEventId;
  }

  public void setMinEventId(Long minEventId) {
    this.minEventId = minEventId;
  }

  public ProcessorFilterTracker minMetaCreateMs(Long minMetaCreateMs) {
    this.minMetaCreateMs = minMetaCreateMs;
    return this;
  }

   /**
   * Get minMetaCreateMs
   * @return minMetaCreateMs
  **/
  @Schema(description = "")
  public Long getMinMetaCreateMs() {
    return minMetaCreateMs;
  }

  public void setMinMetaCreateMs(Long minMetaCreateMs) {
    this.minMetaCreateMs = minMetaCreateMs;
  }

  public ProcessorFilterTracker minMetaId(Long minMetaId) {
    this.minMetaId = minMetaId;
    return this;
  }

   /**
   * Get minMetaId
   * @return minMetaId
  **/
  @Schema(description = "")
  public Long getMinMetaId() {
    return minMetaId;
  }

  public void setMinMetaId(Long minMetaId) {
    this.minMetaId = minMetaId;
  }

  public ProcessorFilterTracker status(String status) {
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

  public ProcessorFilterTracker version(Integer version) {
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
    ProcessorFilterTracker processorFilterTracker = (ProcessorFilterTracker) o;
    return Objects.equals(this.eventCount, processorFilterTracker.eventCount) &&
        Objects.equals(this.id, processorFilterTracker.id) &&
        Objects.equals(this.lastPollMs, processorFilterTracker.lastPollMs) &&
        Objects.equals(this.lastPollTaskCount, processorFilterTracker.lastPollTaskCount) &&
        Objects.equals(this.maxMetaCreateMs, processorFilterTracker.maxMetaCreateMs) &&
        Objects.equals(this.metaCount, processorFilterTracker.metaCount) &&
        Objects.equals(this.metaCreateMs, processorFilterTracker.metaCreateMs) &&
        Objects.equals(this.minEventId, processorFilterTracker.minEventId) &&
        Objects.equals(this.minMetaCreateMs, processorFilterTracker.minMetaCreateMs) &&
        Objects.equals(this.minMetaId, processorFilterTracker.minMetaId) &&
        Objects.equals(this.status, processorFilterTracker.status) &&
        Objects.equals(this.version, processorFilterTracker.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventCount, id, lastPollMs, lastPollTaskCount, maxMetaCreateMs, metaCount, metaCreateMs, minEventId, minMetaCreateMs, minMetaId, status, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorFilterTracker {\n");
    
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastPollMs: ").append(toIndentedString(lastPollMs)).append("\n");
    sb.append("    lastPollTaskCount: ").append(toIndentedString(lastPollTaskCount)).append("\n");
    sb.append("    maxMetaCreateMs: ").append(toIndentedString(maxMetaCreateMs)).append("\n");
    sb.append("    metaCount: ").append(toIndentedString(metaCount)).append("\n");
    sb.append("    metaCreateMs: ").append(toIndentedString(metaCreateMs)).append("\n");
    sb.append("    minEventId: ").append(toIndentedString(minEventId)).append("\n");
    sb.append("    minMetaCreateMs: ").append(toIndentedString(minMetaCreateMs)).append("\n");
    sb.append("    minMetaId: ").append(toIndentedString(minMetaId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

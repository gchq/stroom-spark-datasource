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
 * Meta
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class Meta {
  @SerializedName("createMs")
  private Long createMs = null;

  @SerializedName("effectiveMs")
  private Long effectiveMs = null;

  @SerializedName("feedName")
  private String feedName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("parentMetaId")
  private Long parentMetaId = null;

  @SerializedName("pipelineUuid")
  private String pipelineUuid = null;

  @SerializedName("processorUuid")
  private String processorUuid = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNLOCKED("UNLOCKED"),
    LOCKED("LOCKED"),
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("statusMs")
  private Long statusMs = null;

  @SerializedName("typeName")
  private String typeName = null;

  public Meta createMs(Long createMs) {
    this.createMs = createMs;
    return this;
  }

   /**
   * Get createMs
   * @return createMs
  **/
  @Schema(description = "")
  public Long getCreateMs() {
    return createMs;
  }

  public void setCreateMs(Long createMs) {
    this.createMs = createMs;
  }

  public Meta effectiveMs(Long effectiveMs) {
    this.effectiveMs = effectiveMs;
    return this;
  }

   /**
   * Get effectiveMs
   * @return effectiveMs
  **/
  @Schema(description = "")
  public Long getEffectiveMs() {
    return effectiveMs;
  }

  public void setEffectiveMs(Long effectiveMs) {
    this.effectiveMs = effectiveMs;
  }

  public Meta feedName(String feedName) {
    this.feedName = feedName;
    return this;
  }

   /**
   * Get feedName
   * @return feedName
  **/
  @Schema(description = "")
  public String getFeedName() {
    return feedName;
  }

  public void setFeedName(String feedName) {
    this.feedName = feedName;
  }

  public Meta id(Long id) {
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

  public Meta parentMetaId(Long parentMetaId) {
    this.parentMetaId = parentMetaId;
    return this;
  }

   /**
   * Get parentMetaId
   * @return parentMetaId
  **/
  @Schema(description = "")
  public Long getParentMetaId() {
    return parentMetaId;
  }

  public void setParentMetaId(Long parentMetaId) {
    this.parentMetaId = parentMetaId;
  }

  public Meta pipelineUuid(String pipelineUuid) {
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

  public Meta processorUuid(String processorUuid) {
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

  public Meta status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Meta statusMs(Long statusMs) {
    this.statusMs = statusMs;
    return this;
  }

   /**
   * Get statusMs
   * @return statusMs
  **/
  @Schema(description = "")
  public Long getStatusMs() {
    return statusMs;
  }

  public void setStatusMs(Long statusMs) {
    this.statusMs = statusMs;
  }

  public Meta typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @Schema(description = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.createMs, meta.createMs) &&
        Objects.equals(this.effectiveMs, meta.effectiveMs) &&
        Objects.equals(this.feedName, meta.feedName) &&
        Objects.equals(this.id, meta.id) &&
        Objects.equals(this.parentMetaId, meta.parentMetaId) &&
        Objects.equals(this.pipelineUuid, meta.pipelineUuid) &&
        Objects.equals(this.processorUuid, meta.processorUuid) &&
        Objects.equals(this.status, meta.status) &&
        Objects.equals(this.statusMs, meta.statusMs) &&
        Objects.equals(this.typeName, meta.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createMs, effectiveMs, feedName, id, parentMetaId, pipelineUuid, processorUuid, status, statusMs, typeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    createMs: ").append(toIndentedString(createMs)).append("\n");
    sb.append("    effectiveMs: ").append(toIndentedString(effectiveMs)).append("\n");
    sb.append("    feedName: ").append(toIndentedString(feedName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentMetaId: ").append(toIndentedString(parentMetaId)).append("\n");
    sb.append("    pipelineUuid: ").append(toIndentedString(pipelineUuid)).append("\n");
    sb.append("    processorUuid: ").append(toIndentedString(processorUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMs: ").append(toIndentedString(statusMs)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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
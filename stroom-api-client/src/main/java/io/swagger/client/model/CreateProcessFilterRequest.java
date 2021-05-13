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
import io.swagger.client.model.QueryData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CreateProcessFilterRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class CreateProcessFilterRequest {
  @SerializedName("autoPriority")
  private Boolean autoPriority = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("pipeline")
  private DocRef pipeline = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("queryData")
  private QueryData queryData = null;

  public CreateProcessFilterRequest autoPriority(Boolean autoPriority) {
    this.autoPriority = autoPriority;
    return this;
  }

   /**
   * Get autoPriority
   * @return autoPriority
  **/
  @Schema(description = "")
  public Boolean isAutoPriority() {
    return autoPriority;
  }

  public void setAutoPriority(Boolean autoPriority) {
    this.autoPriority = autoPriority;
  }

  public CreateProcessFilterRequest enabled(Boolean enabled) {
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

  public CreateProcessFilterRequest pipeline(DocRef pipeline) {
    this.pipeline = pipeline;
    return this;
  }

   /**
   * Get pipeline
   * @return pipeline
  **/
  @Schema(description = "")
  public DocRef getPipeline() {
    return pipeline;
  }

  public void setPipeline(DocRef pipeline) {
    this.pipeline = pipeline;
  }

  public CreateProcessFilterRequest priority(Integer priority) {
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

  public CreateProcessFilterRequest queryData(QueryData queryData) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProcessFilterRequest createProcessFilterRequest = (CreateProcessFilterRequest) o;
    return Objects.equals(this.autoPriority, createProcessFilterRequest.autoPriority) &&
        Objects.equals(this.enabled, createProcessFilterRequest.enabled) &&
        Objects.equals(this.pipeline, createProcessFilterRequest.pipeline) &&
        Objects.equals(this.priority, createProcessFilterRequest.priority) &&
        Objects.equals(this.queryData, createProcessFilterRequest.queryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoPriority, enabled, pipeline, priority, queryData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProcessFilterRequest {\n");
    
    sb.append("    autoPriority: ").append(toIndentedString(autoPriority)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    queryData: ").append(toIndentedString(queryData)).append("\n");
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

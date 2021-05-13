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
 * PipelineLink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class PipelineLink {
  @SerializedName("from")
  private String from = null;

  @SerializedName("sourcePipeline")
  private DocRef sourcePipeline = null;

  @SerializedName("to")
  private String to = null;

  public PipelineLink from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(required = true, description = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public PipelineLink sourcePipeline(DocRef sourcePipeline) {
    this.sourcePipeline = sourcePipeline;
    return this;
  }

   /**
   * Get sourcePipeline
   * @return sourcePipeline
  **/
  @Schema(description = "")
  public DocRef getSourcePipeline() {
    return sourcePipeline;
  }

  public void setSourcePipeline(DocRef sourcePipeline) {
    this.sourcePipeline = sourcePipeline;
  }

  public PipelineLink to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(required = true, description = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineLink pipelineLink = (PipelineLink) o;
    return Objects.equals(this.from, pipelineLink.from) &&
        Objects.equals(this.sourcePipeline, pipelineLink.sourcePipeline) &&
        Objects.equals(this.to, pipelineLink.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, sourcePipeline, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineLink {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    sourcePipeline: ").append(toIndentedString(sourcePipeline)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

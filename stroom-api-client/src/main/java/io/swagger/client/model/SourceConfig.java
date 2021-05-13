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
 * SourceConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class SourceConfig {
  @SerializedName("maxCharactersInPreviewFetch")
  private Long maxCharactersInPreviewFetch = null;

  @SerializedName("maxCharactersPerFetch")
  private Long maxCharactersPerFetch = null;

  @SerializedName("maxCharactersToCompleteLine")
  private Long maxCharactersToCompleteLine = null;

  public SourceConfig maxCharactersInPreviewFetch(Long maxCharactersInPreviewFetch) {
    this.maxCharactersInPreviewFetch = maxCharactersInPreviewFetch;
    return this;
  }

   /**
   * Get maxCharactersInPreviewFetch
   * minimum: 1
   * @return maxCharactersInPreviewFetch
  **/
  @Schema(description = "")
  public Long getMaxCharactersInPreviewFetch() {
    return maxCharactersInPreviewFetch;
  }

  public void setMaxCharactersInPreviewFetch(Long maxCharactersInPreviewFetch) {
    this.maxCharactersInPreviewFetch = maxCharactersInPreviewFetch;
  }

  public SourceConfig maxCharactersPerFetch(Long maxCharactersPerFetch) {
    this.maxCharactersPerFetch = maxCharactersPerFetch;
    return this;
  }

   /**
   * Get maxCharactersPerFetch
   * minimum: 1
   * @return maxCharactersPerFetch
  **/
  @Schema(description = "")
  public Long getMaxCharactersPerFetch() {
    return maxCharactersPerFetch;
  }

  public void setMaxCharactersPerFetch(Long maxCharactersPerFetch) {
    this.maxCharactersPerFetch = maxCharactersPerFetch;
  }

  public SourceConfig maxCharactersToCompleteLine(Long maxCharactersToCompleteLine) {
    this.maxCharactersToCompleteLine = maxCharactersToCompleteLine;
    return this;
  }

   /**
   * Get maxCharactersToCompleteLine
   * minimum: 0
   * @return maxCharactersToCompleteLine
  **/
  @Schema(description = "")
  public Long getMaxCharactersToCompleteLine() {
    return maxCharactersToCompleteLine;
  }

  public void setMaxCharactersToCompleteLine(Long maxCharactersToCompleteLine) {
    this.maxCharactersToCompleteLine = maxCharactersToCompleteLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceConfig sourceConfig = (SourceConfig) o;
    return Objects.equals(this.maxCharactersInPreviewFetch, sourceConfig.maxCharactersInPreviewFetch) &&
        Objects.equals(this.maxCharactersPerFetch, sourceConfig.maxCharactersPerFetch) &&
        Objects.equals(this.maxCharactersToCompleteLine, sourceConfig.maxCharactersToCompleteLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCharactersInPreviewFetch, maxCharactersPerFetch, maxCharactersToCompleteLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceConfig {\n");
    
    sb.append("    maxCharactersInPreviewFetch: ").append(toIndentedString(maxCharactersInPreviewFetch)).append("\n");
    sb.append("    maxCharactersPerFetch: ").append(toIndentedString(maxCharactersPerFetch)).append("\n");
    sb.append("    maxCharactersToCompleteLine: ").append(toIndentedString(maxCharactersToCompleteLine)).append("\n");
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
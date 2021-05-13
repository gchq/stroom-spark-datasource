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
 * GetPipelineForMetaRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class GetPipelineForMetaRequest {
  @SerializedName("childMetaId")
  private Long childMetaId = null;

  @SerializedName("metaId")
  private Long metaId = null;

  public GetPipelineForMetaRequest childMetaId(Long childMetaId) {
    this.childMetaId = childMetaId;
    return this;
  }

   /**
   * Get childMetaId
   * @return childMetaId
  **/
  @Schema(description = "")
  public Long getChildMetaId() {
    return childMetaId;
  }

  public void setChildMetaId(Long childMetaId) {
    this.childMetaId = childMetaId;
  }

  public GetPipelineForMetaRequest metaId(Long metaId) {
    this.metaId = metaId;
    return this;
  }

   /**
   * Get metaId
   * @return metaId
  **/
  @Schema(description = "")
  public Long getMetaId() {
    return metaId;
  }

  public void setMetaId(Long metaId) {
    this.metaId = metaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPipelineForMetaRequest getPipelineForMetaRequest = (GetPipelineForMetaRequest) o;
    return Objects.equals(this.childMetaId, getPipelineForMetaRequest.childMetaId) &&
        Objects.equals(this.metaId, getPipelineForMetaRequest.metaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childMetaId, metaId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPipelineForMetaRequest {\n");
    
    sb.append("    childMetaId: ").append(toIndentedString(childMetaId)).append("\n");
    sb.append("    metaId: ").append(toIndentedString(metaId)).append("\n");
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
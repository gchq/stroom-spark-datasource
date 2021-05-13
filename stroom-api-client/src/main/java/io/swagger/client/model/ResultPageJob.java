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
import io.swagger.client.model.Job;
import io.swagger.client.model.PageResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A page of results.
 */
@Schema(description = "A page of results.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class ResultPageJob {
  @SerializedName("pageResponse")
  private PageResponse pageResponse = null;

  @SerializedName("values")
  private List<Job> values = null;

  public ResultPageJob pageResponse(PageResponse pageResponse) {
    this.pageResponse = pageResponse;
    return this;
  }

   /**
   * Get pageResponse
   * @return pageResponse
  **/
  @Schema(description = "")
  public PageResponse getPageResponse() {
    return pageResponse;
  }

  public void setPageResponse(PageResponse pageResponse) {
    this.pageResponse = pageResponse;
  }

  public ResultPageJob values(List<Job> values) {
    this.values = values;
    return this;
  }

  public ResultPageJob addValuesItem(Job valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<Job>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<Job> getValues() {
    return values;
  }

  public void setValues(List<Job> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultPageJob resultPageJob = (ResultPageJob) o;
    return Objects.equals(this.pageResponse, resultPageJob.pageResponse) &&
        Objects.equals(this.values, resultPageJob.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageResponse, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultPageJob {\n");
    
    sb.append("    pageResponse: ").append(toIndentedString(pageResponse)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

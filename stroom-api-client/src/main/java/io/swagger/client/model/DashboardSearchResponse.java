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
import io.swagger.client.model.DashboardQueryKey;
import io.swagger.client.model.Result;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * DashboardSearchResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DashboardSearchResponse {
  @SerializedName("complete")
  private Boolean complete = null;

  @SerializedName("errors")
  private String errors = null;

  @SerializedName("highlights")
  private List<String> highlights = null;

  @SerializedName("queryKey")
  private DashboardQueryKey queryKey = null;

  @SerializedName("results")
  private List<Result> results = null;

  public DashboardSearchResponse complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @Schema(description = "")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public DashboardSearchResponse errors(String errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public String getErrors() {
    return errors;
  }

  public void setErrors(String errors) {
    this.errors = errors;
  }

  public DashboardSearchResponse highlights(List<String> highlights) {
    this.highlights = highlights;
    return this;
  }

  public DashboardSearchResponse addHighlightsItem(String highlightsItem) {
    if (this.highlights == null) {
      this.highlights = new ArrayList<String>();
    }
    this.highlights.add(highlightsItem);
    return this;
  }

   /**
   * Get highlights
   * @return highlights
  **/
  @Schema(description = "")
  public List<String> getHighlights() {
    return highlights;
  }

  public void setHighlights(List<String> highlights) {
    this.highlights = highlights;
  }

  public DashboardSearchResponse queryKey(DashboardQueryKey queryKey) {
    this.queryKey = queryKey;
    return this;
  }

   /**
   * Get queryKey
   * @return queryKey
  **/
  @Schema(description = "")
  public DashboardQueryKey getQueryKey() {
    return queryKey;
  }

  public void setQueryKey(DashboardQueryKey queryKey) {
    this.queryKey = queryKey;
  }

  public DashboardSearchResponse results(List<Result> results) {
    this.results = results;
    return this;
  }

  public DashboardSearchResponse addResultsItem(Result resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Result>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<Result> getResults() {
    return results;
  }

  public void setResults(List<Result> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSearchResponse dashboardSearchResponse = (DashboardSearchResponse) o;
    return Objects.equals(this.complete, dashboardSearchResponse.complete) &&
        Objects.equals(this.errors, dashboardSearchResponse.errors) &&
        Objects.equals(this.highlights, dashboardSearchResponse.highlights) &&
        Objects.equals(this.queryKey, dashboardSearchResponse.queryKey) &&
        Objects.equals(this.results, dashboardSearchResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complete, errors, highlights, queryKey, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSearchResponse {\n");
    
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
    sb.append("    queryKey: ").append(toIndentedString(queryKey)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
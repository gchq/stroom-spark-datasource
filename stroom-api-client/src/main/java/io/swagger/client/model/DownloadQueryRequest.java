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
import io.swagger.client.model.DashboardSearchRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DownloadQueryRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DownloadQueryRequest {
  @SerializedName("dashboardQueryKey")
  private DashboardQueryKey dashboardQueryKey = null;

  @SerializedName("searchRequest")
  private DashboardSearchRequest searchRequest = null;

  public DownloadQueryRequest dashboardQueryKey(DashboardQueryKey dashboardQueryKey) {
    this.dashboardQueryKey = dashboardQueryKey;
    return this;
  }

   /**
   * Get dashboardQueryKey
   * @return dashboardQueryKey
  **/
  @Schema(description = "")
  public DashboardQueryKey getDashboardQueryKey() {
    return dashboardQueryKey;
  }

  public void setDashboardQueryKey(DashboardQueryKey dashboardQueryKey) {
    this.dashboardQueryKey = dashboardQueryKey;
  }

  public DownloadQueryRequest searchRequest(DashboardSearchRequest searchRequest) {
    this.searchRequest = searchRequest;
    return this;
  }

   /**
   * Get searchRequest
   * @return searchRequest
  **/
  @Schema(description = "")
  public DashboardSearchRequest getSearchRequest() {
    return searchRequest;
  }

  public void setSearchRequest(DashboardSearchRequest searchRequest) {
    this.searchRequest = searchRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadQueryRequest downloadQueryRequest = (DownloadQueryRequest) o;
    return Objects.equals(this.dashboardQueryKey, downloadQueryRequest.dashboardQueryKey) &&
        Objects.equals(this.searchRequest, downloadQueryRequest.searchRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardQueryKey, searchRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadQueryRequest {\n");
    
    sb.append("    dashboardQueryKey: ").append(toIndentedString(dashboardQueryKey)).append("\n");
    sb.append("    searchRequest: ").append(toIndentedString(searchRequest)).append("\n");
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
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
 * DashboardQueryKey
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DashboardQueryKey {
  @SerializedName("componentId")
  private String componentId = null;

  @SerializedName("dashboardUuid")
  private String dashboardUuid = null;

  @SerializedName("uuid")
  private String uuid = null;

  public DashboardQueryKey componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * Get componentId
   * @return componentId
  **/
  @Schema(description = "")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public DashboardQueryKey dashboardUuid(String dashboardUuid) {
    this.dashboardUuid = dashboardUuid;
    return this;
  }

   /**
   * Get dashboardUuid
   * @return dashboardUuid
  **/
  @Schema(description = "")
  public String getDashboardUuid() {
    return dashboardUuid;
  }

  public void setDashboardUuid(String dashboardUuid) {
    this.dashboardUuid = dashboardUuid;
  }

  public DashboardQueryKey uuid(String uuid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardQueryKey dashboardQueryKey = (DashboardQueryKey) o;
    return Objects.equals(this.componentId, dashboardQueryKey.componentId) &&
        Objects.equals(this.dashboardUuid, dashboardQueryKey.dashboardUuid) &&
        Objects.equals(this.uuid, dashboardQueryKey.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, dashboardUuid, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardQueryKey {\n");
    
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    dashboardUuid: ").append(toIndentedString(dashboardUuid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

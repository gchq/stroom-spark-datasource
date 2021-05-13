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
 * ClusterNodeInfoItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class ClusterNodeInfoItem {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("master")
  private Boolean master = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  public ClusterNodeInfoItem active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ClusterNodeInfoItem master(Boolean master) {
    this.master = master;
    return this;
  }

   /**
   * Get master
   * @return master
  **/
  @Schema(description = "")
  public Boolean isMaster() {
    return master;
  }

  public void setMaster(Boolean master) {
    this.master = master;
  }

  public ClusterNodeInfoItem nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @Schema(description = "")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterNodeInfoItem clusterNodeInfoItem = (ClusterNodeInfoItem) o;
    return Objects.equals(this.active, clusterNodeInfoItem.active) &&
        Objects.equals(this.master, clusterNodeInfoItem.master) &&
        Objects.equals(this.nodeName, clusterNodeInfoItem.nodeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, master, nodeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterNodeInfoItem {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
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
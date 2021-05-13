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
import io.swagger.client.model.Node;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NodeStatusResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class NodeStatusResult {
  @SerializedName("master")
  private Boolean master = null;

  @SerializedName("node")
  private Node node = null;

  public NodeStatusResult master(Boolean master) {
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

  public NodeStatusResult node(Node node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @Schema(description = "")
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeStatusResult nodeStatusResult = (NodeStatusResult) o;
    return Objects.equals(this.master, nodeStatusResult.master) &&
        Objects.equals(this.node, nodeStatusResult.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(master, node);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeStatusResult {\n");
    
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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
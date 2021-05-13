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
import io.swagger.client.model.TaskId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FindTaskCriteria
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class FindTaskCriteria {
  @SerializedName("ancestorIdSet")
  private List<TaskId> ancestorIdSet = null;

  @SerializedName("idSet")
  private List<TaskId> idSet = null;

  @SerializedName("sessionId")
  private String sessionId = null;

  public FindTaskCriteria ancestorIdSet(List<TaskId> ancestorIdSet) {
    this.ancestorIdSet = ancestorIdSet;
    return this;
  }

  public FindTaskCriteria addAncestorIdSetItem(TaskId ancestorIdSetItem) {
    if (this.ancestorIdSet == null) {
      this.ancestorIdSet = new ArrayList<TaskId>();
    }
    this.ancestorIdSet.add(ancestorIdSetItem);
    return this;
  }

   /**
   * Get ancestorIdSet
   * @return ancestorIdSet
  **/
  @Schema(description = "")
  public List<TaskId> getAncestorIdSet() {
    return ancestorIdSet;
  }

  public void setAncestorIdSet(List<TaskId> ancestorIdSet) {
    this.ancestorIdSet = ancestorIdSet;
  }

  public FindTaskCriteria idSet(List<TaskId> idSet) {
    this.idSet = idSet;
    return this;
  }

  public FindTaskCriteria addIdSetItem(TaskId idSetItem) {
    if (this.idSet == null) {
      this.idSet = new ArrayList<TaskId>();
    }
    this.idSet.add(idSetItem);
    return this;
  }

   /**
   * Get idSet
   * @return idSet
  **/
  @Schema(description = "")
  public List<TaskId> getIdSet() {
    return idSet;
  }

  public void setIdSet(List<TaskId> idSet) {
    this.idSet = idSet;
  }

  public FindTaskCriteria sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @Schema(description = "")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindTaskCriteria findTaskCriteria = (FindTaskCriteria) o;
    return Objects.equals(this.ancestorIdSet, findTaskCriteria.ancestorIdSet) &&
        Objects.equals(this.idSet, findTaskCriteria.idSet) &&
        Objects.equals(this.sessionId, findTaskCriteria.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestorIdSet, idSet, sessionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindTaskCriteria {\n");
    
    sb.append("    ancestorIdSet: ").append(toIndentedString(ancestorIdSet)).append("\n");
    sb.append("    idSet: ").append(toIndentedString(idSet)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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

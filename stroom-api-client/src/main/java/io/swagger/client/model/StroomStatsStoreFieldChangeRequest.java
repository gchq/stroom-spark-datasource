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
import io.swagger.client.model.StroomStatsStoreEntityData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * StroomStatsStoreFieldChangeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class StroomStatsStoreFieldChangeRequest {
  @SerializedName("newEntityData")
  private StroomStatsStoreEntityData newEntityData = null;

  @SerializedName("oldEntityData")
  private StroomStatsStoreEntityData oldEntityData = null;

  public StroomStatsStoreFieldChangeRequest newEntityData(StroomStatsStoreEntityData newEntityData) {
    this.newEntityData = newEntityData;
    return this;
  }

   /**
   * Get newEntityData
   * @return newEntityData
  **/
  @Schema(description = "")
  public StroomStatsStoreEntityData getNewEntityData() {
    return newEntityData;
  }

  public void setNewEntityData(StroomStatsStoreEntityData newEntityData) {
    this.newEntityData = newEntityData;
  }

  public StroomStatsStoreFieldChangeRequest oldEntityData(StroomStatsStoreEntityData oldEntityData) {
    this.oldEntityData = oldEntityData;
    return this;
  }

   /**
   * Get oldEntityData
   * @return oldEntityData
  **/
  @Schema(description = "")
  public StroomStatsStoreEntityData getOldEntityData() {
    return oldEntityData;
  }

  public void setOldEntityData(StroomStatsStoreEntityData oldEntityData) {
    this.oldEntityData = oldEntityData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StroomStatsStoreFieldChangeRequest stroomStatsStoreFieldChangeRequest = (StroomStatsStoreFieldChangeRequest) o;
    return Objects.equals(this.newEntityData, stroomStatsStoreFieldChangeRequest.newEntityData) &&
        Objects.equals(this.oldEntityData, stroomStatsStoreFieldChangeRequest.oldEntityData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newEntityData, oldEntityData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StroomStatsStoreFieldChangeRequest {\n");
    
    sb.append("    newEntityData: ").append(toIndentedString(newEntityData)).append("\n");
    sb.append("    oldEntityData: ").append(toIndentedString(oldEntityData)).append("\n");
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

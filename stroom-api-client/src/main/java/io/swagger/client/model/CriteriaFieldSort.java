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
 * CriteriaFieldSort
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class CriteriaFieldSort {
  @SerializedName("desc")
  private Boolean desc = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ignoreCase")
  private Boolean ignoreCase = null;

  public CriteriaFieldSort desc(Boolean desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @Schema(description = "")
  public Boolean isDesc() {
    return desc;
  }

  public void setDesc(Boolean desc) {
    this.desc = desc;
  }

  public CriteriaFieldSort id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CriteriaFieldSort ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @Schema(description = "")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriteriaFieldSort criteriaFieldSort = (CriteriaFieldSort) o;
    return Objects.equals(this.desc, criteriaFieldSort.desc) &&
        Objects.equals(this.id, criteriaFieldSort.id) &&
        Objects.equals(this.ignoreCase, criteriaFieldSort.ignoreCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, id, ignoreCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriteriaFieldSort {\n");
    
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
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

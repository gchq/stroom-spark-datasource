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
import io.swagger.client.model.PipelineReference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PipelineReferences
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class PipelineReferences {
  @SerializedName("add")
  private List<PipelineReference> add = null;

  @SerializedName("remove")
  private List<PipelineReference> remove = null;

  public PipelineReferences add(List<PipelineReference> add) {
    this.add = add;
    return this;
  }

  public PipelineReferences addAddItem(PipelineReference addItem) {
    if (this.add == null) {
      this.add = new ArrayList<PipelineReference>();
    }
    this.add.add(addItem);
    return this;
  }

   /**
   * Get add
   * @return add
  **/
  @Schema(description = "")
  public List<PipelineReference> getAdd() {
    return add;
  }

  public void setAdd(List<PipelineReference> add) {
    this.add = add;
  }

  public PipelineReferences remove(List<PipelineReference> remove) {
    this.remove = remove;
    return this;
  }

  public PipelineReferences addRemoveItem(PipelineReference removeItem) {
    if (this.remove == null) {
      this.remove = new ArrayList<PipelineReference>();
    }
    this.remove.add(removeItem);
    return this;
  }

   /**
   * Get remove
   * @return remove
  **/
  @Schema(description = "")
  public List<PipelineReference> getRemove() {
    return remove;
  }

  public void setRemove(List<PipelineReference> remove) {
    this.remove = remove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineReferences pipelineReferences = (PipelineReferences) o;
    return Objects.equals(this.add, pipelineReferences.add) &&
        Objects.equals(this.remove, pipelineReferences.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineReferences {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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
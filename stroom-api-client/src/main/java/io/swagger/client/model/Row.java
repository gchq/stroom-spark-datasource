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
import java.util.ArrayList;
import java.util.List;
/**
 * A row of data in a result set
 */
@Schema(description = "A row of data in a result set")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class Row {
  @SerializedName("backgroundColor")
  private String backgroundColor = null;

  @SerializedName("depth")
  private Integer depth = null;

  @SerializedName("groupKey")
  private String groupKey = null;

  @SerializedName("textColor")
  private String textColor = null;

  @SerializedName("values")
  private List<String> values = new ArrayList<String>();

  public Row backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @Schema(description = "")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public Row depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * The grouping depth, where 0 is the top level of grouping, or where there is no grouping
   * @return depth
  **/
  @Schema(example = "0", required = true, description = "The grouping depth, where 0 is the top level of grouping, or where there is no grouping")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public Row groupKey(String groupKey) {
    this.groupKey = groupKey;
    return this;
  }

   /**
   * TODO
   * @return groupKey
  **/
  @Schema(required = true, description = "TODO")
  public String getGroupKey() {
    return groupKey;
  }

  public void setGroupKey(String groupKey) {
    this.groupKey = groupKey;
  }

  public Row textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

   /**
   * Get textColor
   * @return textColor
  **/
  @Schema(description = "")
  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public Row values(List<String> values) {
    this.values = values;
    return this;
  }

  public Row addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The value for this row of data. The values in the list are in the same order as the fields in the ResultRequest
   * @return values
  **/
  @Schema(required = true, description = "The value for this row of data. The values in the list are in the same order as the fields in the ResultRequest")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
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
    Row row = (Row) o;
    return Objects.equals(this.backgroundColor, row.backgroundColor) &&
        Objects.equals(this.depth, row.depth) &&
        Objects.equals(this.groupKey, row.groupKey) &&
        Objects.equals(this.textColor, row.textColor) &&
        Objects.equals(this.values, row.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, depth, groupKey, textColor, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    groupKey: ").append(toIndentedString(groupKey)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
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
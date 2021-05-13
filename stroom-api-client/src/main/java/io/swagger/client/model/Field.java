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
import io.swagger.client.model.Filter;
import io.swagger.client.model.Format;
import io.swagger.client.model.Sort;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Describes a field in a result set. The field can have various expressions applied to it, e.g. SUM(), along with sorting, filtering, formatting and grouping
 */
@Schema(description = "Describes a field in a result set. The field can have various expressions applied to it, e.g. SUM(), along with sorting, filtering, formatting and grouping")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class Field {
  @SerializedName("expression")
  private String expression = null;

  @SerializedName("filter")
  private Filter filter = null;

  @SerializedName("format")
  private Format format = null;

  @SerializedName("group")
  private Integer group = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sort")
  private Sort sort = null;

  public Field expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The expression to use to generate the value for this field
   * @return expression
  **/
  @Schema(example = "SUM(${count})", required = true, description = "The expression to use to generate the value for this field")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public Field filter(Filter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public Filter getFilter() {
    return filter;
  }

  public void setFilter(Filter filter) {
    this.filter = filter;
  }

  public Field format(Format format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(description = "")
  public Format getFormat() {
    return format;
  }

  public void setFormat(Format format) {
    this.format = format;
  }

  public Field group(Integer group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @Schema(description = "")
  public Integer getGroup() {
    return group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public Field id(String id) {
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

  public Field name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field sort(Sort sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @Schema(description = "")
  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.expression, field.expression) &&
        Objects.equals(this.filter, field.filter) &&
        Objects.equals(this.format, field.format) &&
        Objects.equals(this.group, field.group) &&
        Objects.equals(this.id, field.id) &&
        Objects.equals(this.name, field.name) &&
        Objects.equals(this.sort, field.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, filter, format, group, id, name, sort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
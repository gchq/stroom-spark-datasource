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
import io.swagger.client.model.DocRef;
import io.swagger.client.model.ExpressionOperator;
import io.swagger.client.model.Limits;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * QueryData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class QueryData {
  @SerializedName("dataSource")
  private DocRef dataSource = null;

  @SerializedName("expression")
  private ExpressionOperator expression = null;

  @SerializedName("limits")
  private Limits limits = null;

  public QueryData dataSource(DocRef dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @Schema(description = "")
  public DocRef getDataSource() {
    return dataSource;
  }

  public void setDataSource(DocRef dataSource) {
    this.dataSource = dataSource;
  }

  public QueryData expression(ExpressionOperator expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @Schema(description = "")
  public ExpressionOperator getExpression() {
    return expression;
  }

  public void setExpression(ExpressionOperator expression) {
    this.expression = expression;
  }

  public QueryData limits(Limits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @Schema(description = "")
  public Limits getLimits() {
    return limits;
  }

  public void setLimits(Limits limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryData queryData = (QueryData) o;
    return Objects.equals(this.dataSource, queryData.dataSource) &&
        Objects.equals(this.expression, queryData.expression) &&
        Objects.equals(this.limits, queryData.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, expression, limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryData {\n");
    
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

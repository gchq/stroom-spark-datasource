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
import io.swagger.client.model.CriteriaFieldSort;
import io.swagger.client.model.ExpressionOperator;
import io.swagger.client.model.PageRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ExpressionCriteria
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class ExpressionCriteria {
  @SerializedName("expression")
  private ExpressionOperator expression = null;

  @SerializedName("pageRequest")
  private PageRequest pageRequest = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("sortList")
  private List<CriteriaFieldSort> sortList = null;

  public ExpressionCriteria expression(ExpressionOperator expression) {
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

  public ExpressionCriteria pageRequest(PageRequest pageRequest) {
    this.pageRequest = pageRequest;
    return this;
  }

   /**
   * Get pageRequest
   * @return pageRequest
  **/
  @Schema(description = "")
  public PageRequest getPageRequest() {
    return pageRequest;
  }

  public void setPageRequest(PageRequest pageRequest) {
    this.pageRequest = pageRequest;
  }

  public ExpressionCriteria sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @Schema(description = "")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public ExpressionCriteria sortList(List<CriteriaFieldSort> sortList) {
    this.sortList = sortList;
    return this;
  }

  public ExpressionCriteria addSortListItem(CriteriaFieldSort sortListItem) {
    if (this.sortList == null) {
      this.sortList = new ArrayList<CriteriaFieldSort>();
    }
    this.sortList.add(sortListItem);
    return this;
  }

   /**
   * Get sortList
   * @return sortList
  **/
  @Schema(description = "")
  public List<CriteriaFieldSort> getSortList() {
    return sortList;
  }

  public void setSortList(List<CriteriaFieldSort> sortList) {
    this.sortList = sortList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressionCriteria expressionCriteria = (ExpressionCriteria) o;
    return Objects.equals(this.expression, expressionCriteria.expression) &&
        Objects.equals(this.pageRequest, expressionCriteria.pageRequest) &&
        Objects.equals(this.sort, expressionCriteria.sort) &&
        Objects.equals(this.sortList, expressionCriteria.sortList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, pageRequest, sort, sortList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressionCriteria {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    pageRequest: ").append(toIndentedString(pageRequest)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    sortList: ").append(toIndentedString(sortList)).append("\n");
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
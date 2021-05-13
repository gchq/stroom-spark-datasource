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
import io.swagger.client.model.PageRequest;
import io.swagger.client.model.RangeInteger;
import io.swagger.client.model.SelectionIndexShardStatus;
import io.swagger.client.model.SelectionInteger;
import io.swagger.client.model.SelectionLong;
import io.swagger.client.model.SelectionString;
import io.swagger.client.model.StringCriteria;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FindIndexShardCriteria
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class FindIndexShardCriteria {
  @SerializedName("documentCountRange")
  private RangeInteger documentCountRange = null;

  @SerializedName("indexShardIdSet")
  private SelectionLong indexShardIdSet = null;

  @SerializedName("indexShardStatusSet")
  private SelectionIndexShardStatus indexShardStatusSet = null;

  @SerializedName("indexUuidSet")
  private SelectionString indexUuidSet = null;

  @SerializedName("nodeNameSet")
  private SelectionString nodeNameSet = null;

  @SerializedName("pageRequest")
  private PageRequest pageRequest = null;

  @SerializedName("partition")
  private StringCriteria partition = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("sortList")
  private List<CriteriaFieldSort> sortList = null;

  @SerializedName("volumeIdSet")
  private SelectionInteger volumeIdSet = null;

  public FindIndexShardCriteria documentCountRange(RangeInteger documentCountRange) {
    this.documentCountRange = documentCountRange;
    return this;
  }

   /**
   * Get documentCountRange
   * @return documentCountRange
  **/
  @Schema(description = "")
  public RangeInteger getDocumentCountRange() {
    return documentCountRange;
  }

  public void setDocumentCountRange(RangeInteger documentCountRange) {
    this.documentCountRange = documentCountRange;
  }

  public FindIndexShardCriteria indexShardIdSet(SelectionLong indexShardIdSet) {
    this.indexShardIdSet = indexShardIdSet;
    return this;
  }

   /**
   * Get indexShardIdSet
   * @return indexShardIdSet
  **/
  @Schema(description = "")
  public SelectionLong getIndexShardIdSet() {
    return indexShardIdSet;
  }

  public void setIndexShardIdSet(SelectionLong indexShardIdSet) {
    this.indexShardIdSet = indexShardIdSet;
  }

  public FindIndexShardCriteria indexShardStatusSet(SelectionIndexShardStatus indexShardStatusSet) {
    this.indexShardStatusSet = indexShardStatusSet;
    return this;
  }

   /**
   * Get indexShardStatusSet
   * @return indexShardStatusSet
  **/
  @Schema(description = "")
  public SelectionIndexShardStatus getIndexShardStatusSet() {
    return indexShardStatusSet;
  }

  public void setIndexShardStatusSet(SelectionIndexShardStatus indexShardStatusSet) {
    this.indexShardStatusSet = indexShardStatusSet;
  }

  public FindIndexShardCriteria indexUuidSet(SelectionString indexUuidSet) {
    this.indexUuidSet = indexUuidSet;
    return this;
  }

   /**
   * Get indexUuidSet
   * @return indexUuidSet
  **/
  @Schema(description = "")
  public SelectionString getIndexUuidSet() {
    return indexUuidSet;
  }

  public void setIndexUuidSet(SelectionString indexUuidSet) {
    this.indexUuidSet = indexUuidSet;
  }

  public FindIndexShardCriteria nodeNameSet(SelectionString nodeNameSet) {
    this.nodeNameSet = nodeNameSet;
    return this;
  }

   /**
   * Get nodeNameSet
   * @return nodeNameSet
  **/
  @Schema(description = "")
  public SelectionString getNodeNameSet() {
    return nodeNameSet;
  }

  public void setNodeNameSet(SelectionString nodeNameSet) {
    this.nodeNameSet = nodeNameSet;
  }

  public FindIndexShardCriteria pageRequest(PageRequest pageRequest) {
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

  public FindIndexShardCriteria partition(StringCriteria partition) {
    this.partition = partition;
    return this;
  }

   /**
   * Get partition
   * @return partition
  **/
  @Schema(description = "")
  public StringCriteria getPartition() {
    return partition;
  }

  public void setPartition(StringCriteria partition) {
    this.partition = partition;
  }

  public FindIndexShardCriteria sort(String sort) {
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

  public FindIndexShardCriteria sortList(List<CriteriaFieldSort> sortList) {
    this.sortList = sortList;
    return this;
  }

  public FindIndexShardCriteria addSortListItem(CriteriaFieldSort sortListItem) {
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

  public FindIndexShardCriteria volumeIdSet(SelectionInteger volumeIdSet) {
    this.volumeIdSet = volumeIdSet;
    return this;
  }

   /**
   * Get volumeIdSet
   * @return volumeIdSet
  **/
  @Schema(description = "")
  public SelectionInteger getVolumeIdSet() {
    return volumeIdSet;
  }

  public void setVolumeIdSet(SelectionInteger volumeIdSet) {
    this.volumeIdSet = volumeIdSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindIndexShardCriteria findIndexShardCriteria = (FindIndexShardCriteria) o;
    return Objects.equals(this.documentCountRange, findIndexShardCriteria.documentCountRange) &&
        Objects.equals(this.indexShardIdSet, findIndexShardCriteria.indexShardIdSet) &&
        Objects.equals(this.indexShardStatusSet, findIndexShardCriteria.indexShardStatusSet) &&
        Objects.equals(this.indexUuidSet, findIndexShardCriteria.indexUuidSet) &&
        Objects.equals(this.nodeNameSet, findIndexShardCriteria.nodeNameSet) &&
        Objects.equals(this.pageRequest, findIndexShardCriteria.pageRequest) &&
        Objects.equals(this.partition, findIndexShardCriteria.partition) &&
        Objects.equals(this.sort, findIndexShardCriteria.sort) &&
        Objects.equals(this.sortList, findIndexShardCriteria.sortList) &&
        Objects.equals(this.volumeIdSet, findIndexShardCriteria.volumeIdSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentCountRange, indexShardIdSet, indexShardStatusSet, indexUuidSet, nodeNameSet, pageRequest, partition, sort, sortList, volumeIdSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindIndexShardCriteria {\n");
    
    sb.append("    documentCountRange: ").append(toIndentedString(documentCountRange)).append("\n");
    sb.append("    indexShardIdSet: ").append(toIndentedString(indexShardIdSet)).append("\n");
    sb.append("    indexShardStatusSet: ").append(toIndentedString(indexShardStatusSet)).append("\n");
    sb.append("    indexUuidSet: ").append(toIndentedString(indexUuidSet)).append("\n");
    sb.append("    nodeNameSet: ").append(toIndentedString(nodeNameSet)).append("\n");
    sb.append("    pageRequest: ").append(toIndentedString(pageRequest)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    sortList: ").append(toIndentedString(sortList)).append("\n");
    sb.append("    volumeIdSet: ").append(toIndentedString(volumeIdSet)).append("\n");
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

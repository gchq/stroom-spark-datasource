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
import io.swagger.client.model.DataRange;
import io.swagger.client.model.TextRange;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SourceLocation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class SourceLocation {
  @SerializedName("childType")
  private String childType = null;

  @SerializedName("dataRange")
  private DataRange dataRange = null;

  @SerializedName("highlight")
  private TextRange highlight = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("partNo")
  private Long partNo = null;

  @SerializedName("segmentNo")
  private Long segmentNo = null;

  @SerializedName("truncateToWholeLines")
  private Boolean truncateToWholeLines = null;

  public SourceLocation childType(String childType) {
    this.childType = childType;
    return this;
  }

   /**
   * Get childType
   * @return childType
  **/
  @Schema(description = "")
  public String getChildType() {
    return childType;
  }

  public void setChildType(String childType) {
    this.childType = childType;
  }

  public SourceLocation dataRange(DataRange dataRange) {
    this.dataRange = dataRange;
    return this;
  }

   /**
   * Get dataRange
   * @return dataRange
  **/
  @Schema(description = "")
  public DataRange getDataRange() {
    return dataRange;
  }

  public void setDataRange(DataRange dataRange) {
    this.dataRange = dataRange;
  }

  public SourceLocation highlight(TextRange highlight) {
    this.highlight = highlight;
    return this;
  }

   /**
   * Get highlight
   * @return highlight
  **/
  @Schema(description = "")
  public TextRange getHighlight() {
    return highlight;
  }

  public void setHighlight(TextRange highlight) {
    this.highlight = highlight;
  }

  public SourceLocation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SourceLocation partNo(Long partNo) {
    this.partNo = partNo;
    return this;
  }

   /**
   * Get partNo
   * @return partNo
  **/
  @Schema(description = "")
  public Long getPartNo() {
    return partNo;
  }

  public void setPartNo(Long partNo) {
    this.partNo = partNo;
  }

  public SourceLocation segmentNo(Long segmentNo) {
    this.segmentNo = segmentNo;
    return this;
  }

   /**
   * Get segmentNo
   * @return segmentNo
  **/
  @Schema(description = "")
  public Long getSegmentNo() {
    return segmentNo;
  }

  public void setSegmentNo(Long segmentNo) {
    this.segmentNo = segmentNo;
  }

  public SourceLocation truncateToWholeLines(Boolean truncateToWholeLines) {
    this.truncateToWholeLines = truncateToWholeLines;
    return this;
  }

   /**
   * Get truncateToWholeLines
   * @return truncateToWholeLines
  **/
  @Schema(description = "")
  public Boolean isTruncateToWholeLines() {
    return truncateToWholeLines;
  }

  public void setTruncateToWholeLines(Boolean truncateToWholeLines) {
    this.truncateToWholeLines = truncateToWholeLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceLocation sourceLocation = (SourceLocation) o;
    return Objects.equals(this.childType, sourceLocation.childType) &&
        Objects.equals(this.dataRange, sourceLocation.dataRange) &&
        Objects.equals(this.highlight, sourceLocation.highlight) &&
        Objects.equals(this.id, sourceLocation.id) &&
        Objects.equals(this.partNo, sourceLocation.partNo) &&
        Objects.equals(this.segmentNo, sourceLocation.segmentNo) &&
        Objects.equals(this.truncateToWholeLines, sourceLocation.truncateToWholeLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childType, dataRange, highlight, id, partNo, segmentNo, truncateToWholeLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceLocation {\n");
    
    sb.append("    childType: ").append(toIndentedString(childType)).append("\n");
    sb.append("    dataRange: ").append(toIndentedString(dataRange)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partNo: ").append(toIndentedString(partNo)).append("\n");
    sb.append("    segmentNo: ").append(toIndentedString(segmentNo)).append("\n");
    sb.append("    truncateToWholeLines: ").append(toIndentedString(truncateToWholeLines)).append("\n");
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
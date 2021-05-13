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
import io.swagger.client.model.Location;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DataRange
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DataRange {
  @SerializedName("byteOffsetFrom")
  private Long byteOffsetFrom = null;

  @SerializedName("byteOffsetTo")
  private Long byteOffsetTo = null;

  @SerializedName("charOffsetFrom")
  private Long charOffsetFrom = null;

  @SerializedName("charOffsetTo")
  private Long charOffsetTo = null;

  @SerializedName("length")
  private Long length = null;

  @SerializedName("locationFrom")
  private Location locationFrom = null;

  @SerializedName("locationTo")
  private Location locationTo = null;

  public DataRange byteOffsetFrom(Long byteOffsetFrom) {
    this.byteOffsetFrom = byteOffsetFrom;
    return this;
  }

   /**
   * Get byteOffsetFrom
   * @return byteOffsetFrom
  **/
  @Schema(description = "")
  public Long getByteOffsetFrom() {
    return byteOffsetFrom;
  }

  public void setByteOffsetFrom(Long byteOffsetFrom) {
    this.byteOffsetFrom = byteOffsetFrom;
  }

  public DataRange byteOffsetTo(Long byteOffsetTo) {
    this.byteOffsetTo = byteOffsetTo;
    return this;
  }

   /**
   * Get byteOffsetTo
   * @return byteOffsetTo
  **/
  @Schema(description = "")
  public Long getByteOffsetTo() {
    return byteOffsetTo;
  }

  public void setByteOffsetTo(Long byteOffsetTo) {
    this.byteOffsetTo = byteOffsetTo;
  }

  public DataRange charOffsetFrom(Long charOffsetFrom) {
    this.charOffsetFrom = charOffsetFrom;
    return this;
  }

   /**
   * Get charOffsetFrom
   * @return charOffsetFrom
  **/
  @Schema(description = "")
  public Long getCharOffsetFrom() {
    return charOffsetFrom;
  }

  public void setCharOffsetFrom(Long charOffsetFrom) {
    this.charOffsetFrom = charOffsetFrom;
  }

  public DataRange charOffsetTo(Long charOffsetTo) {
    this.charOffsetTo = charOffsetTo;
    return this;
  }

   /**
   * Get charOffsetTo
   * @return charOffsetTo
  **/
  @Schema(description = "")
  public Long getCharOffsetTo() {
    return charOffsetTo;
  }

  public void setCharOffsetTo(Long charOffsetTo) {
    this.charOffsetTo = charOffsetTo;
  }

  public DataRange length(Long length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @Schema(description = "")
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public DataRange locationFrom(Location locationFrom) {
    this.locationFrom = locationFrom;
    return this;
  }

   /**
   * Get locationFrom
   * @return locationFrom
  **/
  @Schema(description = "")
  public Location getLocationFrom() {
    return locationFrom;
  }

  public void setLocationFrom(Location locationFrom) {
    this.locationFrom = locationFrom;
  }

  public DataRange locationTo(Location locationTo) {
    this.locationTo = locationTo;
    return this;
  }

   /**
   * Get locationTo
   * @return locationTo
  **/
  @Schema(description = "")
  public Location getLocationTo() {
    return locationTo;
  }

  public void setLocationTo(Location locationTo) {
    this.locationTo = locationTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataRange dataRange = (DataRange) o;
    return Objects.equals(this.byteOffsetFrom, dataRange.byteOffsetFrom) &&
        Objects.equals(this.byteOffsetTo, dataRange.byteOffsetTo) &&
        Objects.equals(this.charOffsetFrom, dataRange.charOffsetFrom) &&
        Objects.equals(this.charOffsetTo, dataRange.charOffsetTo) &&
        Objects.equals(this.length, dataRange.length) &&
        Objects.equals(this.locationFrom, dataRange.locationFrom) &&
        Objects.equals(this.locationTo, dataRange.locationTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(byteOffsetFrom, byteOffsetTo, charOffsetFrom, charOffsetTo, length, locationFrom, locationTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataRange {\n");
    
    sb.append("    byteOffsetFrom: ").append(toIndentedString(byteOffsetFrom)).append("\n");
    sb.append("    byteOffsetTo: ").append(toIndentedString(byteOffsetTo)).append("\n");
    sb.append("    charOffsetFrom: ").append(toIndentedString(charOffsetFrom)).append("\n");
    sb.append("    charOffsetTo: ").append(toIndentedString(charOffsetTo)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    locationFrom: ").append(toIndentedString(locationFrom)).append("\n");
    sb.append("    locationTo: ").append(toIndentedString(locationTo)).append("\n");
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

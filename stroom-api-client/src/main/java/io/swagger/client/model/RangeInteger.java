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
 * RangeInteger
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class RangeInteger {
  @SerializedName("from")
  private Integer from = null;

  @SerializedName("matchNull")
  private Boolean matchNull = null;

  @SerializedName("to")
  private Integer to = null;

  public RangeInteger from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @Schema(description = "")
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public RangeInteger matchNull(Boolean matchNull) {
    this.matchNull = matchNull;
    return this;
  }

   /**
   * Get matchNull
   * @return matchNull
  **/
  @Schema(description = "")
  public Boolean isMatchNull() {
    return matchNull;
  }

  public void setMatchNull(Boolean matchNull) {
    this.matchNull = matchNull;
  }

  public RangeInteger to(Integer to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(description = "")
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeInteger rangeInteger = (RangeInteger) o;
    return Objects.equals(this.from, rangeInteger.from) &&
        Objects.equals(this.matchNull, rangeInteger.matchNull) &&
        Objects.equals(this.to, rangeInteger.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, matchNull, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeInteger {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    matchNull: ").append(toIndentedString(matchNull)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
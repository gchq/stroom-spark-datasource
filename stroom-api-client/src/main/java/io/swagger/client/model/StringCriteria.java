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
 * StringCriteria
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class StringCriteria {
  @SerializedName("caseInsensitive")
  private Boolean caseInsensitive = null;

  @SerializedName("matchNull")
  private Boolean matchNull = null;

  /**
   * Gets or Sets matchStyle
   */
  @JsonAdapter(MatchStyleEnum.Adapter.class)
  public enum MatchStyleEnum {
    WILD("Wild"),
    WILDSTART("WildStart"),
    WILDEND("WildEnd"),
    WILDSTARTANDEND("WildStartAndEnd");

    private String value;

    MatchStyleEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MatchStyleEnum fromValue(String text) {
      for (MatchStyleEnum b : MatchStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MatchStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchStyleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MatchStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("matchStyle")
  private MatchStyleEnum matchStyle = null;

  @SerializedName("string")
  private String string = null;

  @SerializedName("stringUpper")
  private String stringUpper = null;

  public StringCriteria caseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
    return this;
  }

   /**
   * Get caseInsensitive
   * @return caseInsensitive
  **/
  @Schema(description = "")
  public Boolean isCaseInsensitive() {
    return caseInsensitive;
  }

  public void setCaseInsensitive(Boolean caseInsensitive) {
    this.caseInsensitive = caseInsensitive;
  }

  public StringCriteria matchNull(Boolean matchNull) {
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

  public StringCriteria matchStyle(MatchStyleEnum matchStyle) {
    this.matchStyle = matchStyle;
    return this;
  }

   /**
   * Get matchStyle
   * @return matchStyle
  **/
  @Schema(description = "")
  public MatchStyleEnum getMatchStyle() {
    return matchStyle;
  }

  public void setMatchStyle(MatchStyleEnum matchStyle) {
    this.matchStyle = matchStyle;
  }

  public StringCriteria string(String string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @Schema(description = "")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public StringCriteria stringUpper(String stringUpper) {
    this.stringUpper = stringUpper;
    return this;
  }

   /**
   * Get stringUpper
   * @return stringUpper
  **/
  @Schema(description = "")
  public String getStringUpper() {
    return stringUpper;
  }

  public void setStringUpper(String stringUpper) {
    this.stringUpper = stringUpper;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringCriteria stringCriteria = (StringCriteria) o;
    return Objects.equals(this.caseInsensitive, stringCriteria.caseInsensitive) &&
        Objects.equals(this.matchNull, stringCriteria.matchNull) &&
        Objects.equals(this.matchStyle, stringCriteria.matchStyle) &&
        Objects.equals(this.string, stringCriteria.string) &&
        Objects.equals(this.stringUpper, stringCriteria.stringUpper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseInsensitive, matchNull, matchStyle, string, stringUpper);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringCriteria {\n");
    
    sb.append("    caseInsensitive: ").append(toIndentedString(caseInsensitive)).append("\n");
    sb.append("    matchNull: ").append(toIndentedString(matchNull)).append("\n");
    sb.append("    matchStyle: ").append(toIndentedString(matchStyle)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    stringUpper: ").append(toIndentedString(stringUpper)).append("\n");
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
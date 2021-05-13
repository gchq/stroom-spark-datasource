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
import io.swagger.client.model.XPathFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SteppingFilterSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class SteppingFilterSettings {
  @SerializedName("filters")
  private List<XPathFilter> filters = null;

  /**
   * Gets or Sets skipToOutput
   */
  @JsonAdapter(SkipToOutputEnum.Adapter.class)
  public enum SkipToOutputEnum {
    NOT_EMPTY("NOT_EMPTY"),
    EMPTY("EMPTY");

    private String value;

    SkipToOutputEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SkipToOutputEnum fromValue(String text) {
      for (SkipToOutputEnum b : SkipToOutputEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SkipToOutputEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SkipToOutputEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SkipToOutputEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SkipToOutputEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("skipToOutput")
  private SkipToOutputEnum skipToOutput = null;

  /**
   * Gets or Sets skipToSeverity
   */
  @JsonAdapter(SkipToSeverityEnum.Adapter.class)
  public enum SkipToSeverityEnum {
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR"),
    FATAL("FATAL");

    private String value;

    SkipToSeverityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SkipToSeverityEnum fromValue(String text) {
      for (SkipToSeverityEnum b : SkipToSeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SkipToSeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SkipToSeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SkipToSeverityEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SkipToSeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("skipToSeverity")
  private SkipToSeverityEnum skipToSeverity = null;

  public SteppingFilterSettings filters(List<XPathFilter> filters) {
    this.filters = filters;
    return this;
  }

  public SteppingFilterSettings addFiltersItem(XPathFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<XPathFilter>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Schema(description = "")
  public List<XPathFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<XPathFilter> filters) {
    this.filters = filters;
  }

  public SteppingFilterSettings skipToOutput(SkipToOutputEnum skipToOutput) {
    this.skipToOutput = skipToOutput;
    return this;
  }

   /**
   * Get skipToOutput
   * @return skipToOutput
  **/
  @Schema(description = "")
  public SkipToOutputEnum getSkipToOutput() {
    return skipToOutput;
  }

  public void setSkipToOutput(SkipToOutputEnum skipToOutput) {
    this.skipToOutput = skipToOutput;
  }

  public SteppingFilterSettings skipToSeverity(SkipToSeverityEnum skipToSeverity) {
    this.skipToSeverity = skipToSeverity;
    return this;
  }

   /**
   * Get skipToSeverity
   * @return skipToSeverity
  **/
  @Schema(description = "")
  public SkipToSeverityEnum getSkipToSeverity() {
    return skipToSeverity;
  }

  public void setSkipToSeverity(SkipToSeverityEnum skipToSeverity) {
    this.skipToSeverity = skipToSeverity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SteppingFilterSettings steppingFilterSettings = (SteppingFilterSettings) o;
    return Objects.equals(this.filters, steppingFilterSettings.filters) &&
        Objects.equals(this.skipToOutput, steppingFilterSettings.skipToOutput) &&
        Objects.equals(this.skipToSeverity, steppingFilterSettings.skipToSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, skipToOutput, skipToSeverity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SteppingFilterSettings {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    skipToOutput: ").append(toIndentedString(skipToOutput)).append("\n");
    sb.append("    skipToSeverity: ").append(toIndentedString(skipToSeverity)).append("\n");
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
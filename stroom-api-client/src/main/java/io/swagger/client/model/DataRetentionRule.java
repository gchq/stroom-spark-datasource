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
import io.swagger.client.model.ExpressionOperator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DataRetentionRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DataRetentionRule {
  @SerializedName("age")
  private Integer age = null;

  @SerializedName("creationTime")
  private Long creationTime = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("expression")
  private ExpressionOperator expression = null;

  @SerializedName("forever")
  private Boolean forever = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ruleNumber")
  private Integer ruleNumber = null;

  /**
   * Gets or Sets timeUnit
   */
  @JsonAdapter(TimeUnitEnum.Adapter.class)
  public enum TimeUnitEnum {
    MINUTES("MINUTES"),
    HOURS("HOURS"),
    DAYS("DAYS"),
    WEEKS("WEEKS"),
    MONTHS("MONTHS"),
    YEARS("YEARS");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TimeUnitEnum fromValue(String text) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TimeUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeUnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TimeUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("timeUnit")
  private TimeUnitEnum timeUnit = null;

  public DataRetentionRule age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @Schema(description = "")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public DataRetentionRule creationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @Schema(description = "")
  public Long getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  public DataRetentionRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public DataRetentionRule expression(ExpressionOperator expression) {
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

  public DataRetentionRule forever(Boolean forever) {
    this.forever = forever;
    return this;
  }

   /**
   * Get forever
   * @return forever
  **/
  @Schema(description = "")
  public Boolean isForever() {
    return forever;
  }

  public void setForever(Boolean forever) {
    this.forever = forever;
  }

  public DataRetentionRule name(String name) {
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

  public DataRetentionRule ruleNumber(Integer ruleNumber) {
    this.ruleNumber = ruleNumber;
    return this;
  }

   /**
   * Get ruleNumber
   * @return ruleNumber
  **/
  @Schema(description = "")
  public Integer getRuleNumber() {
    return ruleNumber;
  }

  public void setRuleNumber(Integer ruleNumber) {
    this.ruleNumber = ruleNumber;
  }

  public DataRetentionRule timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @Schema(description = "")
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataRetentionRule dataRetentionRule = (DataRetentionRule) o;
    return Objects.equals(this.age, dataRetentionRule.age) &&
        Objects.equals(this.creationTime, dataRetentionRule.creationTime) &&
        Objects.equals(this.enabled, dataRetentionRule.enabled) &&
        Objects.equals(this.expression, dataRetentionRule.expression) &&
        Objects.equals(this.forever, dataRetentionRule.forever) &&
        Objects.equals(this.name, dataRetentionRule.name) &&
        Objects.equals(this.ruleNumber, dataRetentionRule.ruleNumber) &&
        Objects.equals(this.timeUnit, dataRetentionRule.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, creationTime, enabled, expression, forever, name, ruleNumber, timeUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataRetentionRule {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    forever: ").append(toIndentedString(forever)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleNumber: ").append(toIndentedString(ruleNumber)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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

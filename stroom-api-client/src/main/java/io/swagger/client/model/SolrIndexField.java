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
import java.util.ArrayList;
import java.util.List;
/**
 * SolrIndexField
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class SolrIndexField {
  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("docValues")
  private Boolean docValues = null;

  @SerializedName("fieldName")
  private String fieldName = null;

  @SerializedName("fieldType")
  private String fieldType = null;

  /**
   * Gets or Sets fieldUse
   */
  @JsonAdapter(FieldUseEnum.Adapter.class)
  public enum FieldUseEnum {
    ID("ID"),
    BOOLEAN_FIELD("BOOLEAN_FIELD"),
    INTEGER_FIELD("INTEGER_FIELD"),
    LONG_FIELD("LONG_FIELD"),
    FLOAT_FIELD("FLOAT_FIELD"),
    DOUBLE_FIELD("DOUBLE_FIELD"),
    DATE_FIELD("DATE_FIELD"),
    FIELD("FIELD"),
    NUMERIC_FIELD("NUMERIC_FIELD");

    private String value;

    FieldUseEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FieldUseEnum fromValue(String text) {
      for (FieldUseEnum b : FieldUseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FieldUseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldUseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldUseEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FieldUseEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("fieldUse")
  private FieldUseEnum fieldUse = null;

  @SerializedName("indexed")
  private Boolean indexed = null;

  @SerializedName("multiValued")
  private Boolean multiValued = null;

  @SerializedName("omitNorms")
  private Boolean omitNorms = null;

  @SerializedName("omitPositions")
  private Boolean omitPositions = null;

  @SerializedName("omitTermFreqAndPositions")
  private Boolean omitTermFreqAndPositions = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("sortMissingFirst")
  private Boolean sortMissingFirst = null;

  @SerializedName("sortMissingLast")
  private Boolean sortMissingLast = null;

  @SerializedName("stored")
  private Boolean stored = null;

  /**
   * Gets or Sets supportedConditions
   */
  @JsonAdapter(SupportedConditionsEnum.Adapter.class)
  public enum SupportedConditionsEnum {
    CONTAINS("CONTAINS"),
    EQUALS("EQUALS"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    BETWEEN("BETWEEN"),
    IN("IN"),
    IN_DICTIONARY("IN_DICTIONARY"),
    IN_FOLDER("IN_FOLDER"),
    IS_DOC_REF("IS_DOC_REF"),
    IS_NULL("IS_NULL"),
    IS_NOT_NULL("IS_NOT_NULL");

    private String value;

    SupportedConditionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SupportedConditionsEnum fromValue(String text) {
      for (SupportedConditionsEnum b : SupportedConditionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SupportedConditionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SupportedConditionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SupportedConditionsEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SupportedConditionsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("supportedConditions")
  private List<SupportedConditionsEnum> supportedConditions = null;

  @SerializedName("termOffsets")
  private Boolean termOffsets = null;

  @SerializedName("termPayloads")
  private Boolean termPayloads = null;

  @SerializedName("termPositions")
  private Boolean termPositions = null;

  @SerializedName("termVectors")
  private Boolean termVectors = null;

  @SerializedName("uninvertible")
  private Boolean uninvertible = null;

  public SolrIndexField defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @Schema(description = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public SolrIndexField docValues(Boolean docValues) {
    this.docValues = docValues;
    return this;
  }

   /**
   * Get docValues
   * @return docValues
  **/
  @Schema(description = "")
  public Boolean isDocValues() {
    return docValues;
  }

  public void setDocValues(Boolean docValues) {
    this.docValues = docValues;
  }

  public SolrIndexField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @Schema(description = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public SolrIndexField fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @Schema(description = "")
  public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public SolrIndexField fieldUse(FieldUseEnum fieldUse) {
    this.fieldUse = fieldUse;
    return this;
  }

   /**
   * Get fieldUse
   * @return fieldUse
  **/
  @Schema(description = "")
  public FieldUseEnum getFieldUse() {
    return fieldUse;
  }

  public void setFieldUse(FieldUseEnum fieldUse) {
    this.fieldUse = fieldUse;
  }

  public SolrIndexField indexed(Boolean indexed) {
    this.indexed = indexed;
    return this;
  }

   /**
   * Get indexed
   * @return indexed
  **/
  @Schema(description = "")
  public Boolean isIndexed() {
    return indexed;
  }

  public void setIndexed(Boolean indexed) {
    this.indexed = indexed;
  }

  public SolrIndexField multiValued(Boolean multiValued) {
    this.multiValued = multiValued;
    return this;
  }

   /**
   * Get multiValued
   * @return multiValued
  **/
  @Schema(description = "")
  public Boolean isMultiValued() {
    return multiValued;
  }

  public void setMultiValued(Boolean multiValued) {
    this.multiValued = multiValued;
  }

  public SolrIndexField omitNorms(Boolean omitNorms) {
    this.omitNorms = omitNorms;
    return this;
  }

   /**
   * Get omitNorms
   * @return omitNorms
  **/
  @Schema(description = "")
  public Boolean isOmitNorms() {
    return omitNorms;
  }

  public void setOmitNorms(Boolean omitNorms) {
    this.omitNorms = omitNorms;
  }

  public SolrIndexField omitPositions(Boolean omitPositions) {
    this.omitPositions = omitPositions;
    return this;
  }

   /**
   * Get omitPositions
   * @return omitPositions
  **/
  @Schema(description = "")
  public Boolean isOmitPositions() {
    return omitPositions;
  }

  public void setOmitPositions(Boolean omitPositions) {
    this.omitPositions = omitPositions;
  }

  public SolrIndexField omitTermFreqAndPositions(Boolean omitTermFreqAndPositions) {
    this.omitTermFreqAndPositions = omitTermFreqAndPositions;
    return this;
  }

   /**
   * Get omitTermFreqAndPositions
   * @return omitTermFreqAndPositions
  **/
  @Schema(description = "")
  public Boolean isOmitTermFreqAndPositions() {
    return omitTermFreqAndPositions;
  }

  public void setOmitTermFreqAndPositions(Boolean omitTermFreqAndPositions) {
    this.omitTermFreqAndPositions = omitTermFreqAndPositions;
  }

  public SolrIndexField required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @Schema(description = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public SolrIndexField sortMissingFirst(Boolean sortMissingFirst) {
    this.sortMissingFirst = sortMissingFirst;
    return this;
  }

   /**
   * Get sortMissingFirst
   * @return sortMissingFirst
  **/
  @Schema(description = "")
  public Boolean isSortMissingFirst() {
    return sortMissingFirst;
  }

  public void setSortMissingFirst(Boolean sortMissingFirst) {
    this.sortMissingFirst = sortMissingFirst;
  }

  public SolrIndexField sortMissingLast(Boolean sortMissingLast) {
    this.sortMissingLast = sortMissingLast;
    return this;
  }

   /**
   * Get sortMissingLast
   * @return sortMissingLast
  **/
  @Schema(description = "")
  public Boolean isSortMissingLast() {
    return sortMissingLast;
  }

  public void setSortMissingLast(Boolean sortMissingLast) {
    this.sortMissingLast = sortMissingLast;
  }

  public SolrIndexField stored(Boolean stored) {
    this.stored = stored;
    return this;
  }

   /**
   * Get stored
   * @return stored
  **/
  @Schema(description = "")
  public Boolean isStored() {
    return stored;
  }

  public void setStored(Boolean stored) {
    this.stored = stored;
  }

  public SolrIndexField supportedConditions(List<SupportedConditionsEnum> supportedConditions) {
    this.supportedConditions = supportedConditions;
    return this;
  }

  public SolrIndexField addSupportedConditionsItem(SupportedConditionsEnum supportedConditionsItem) {
    if (this.supportedConditions == null) {
      this.supportedConditions = new ArrayList<SupportedConditionsEnum>();
    }
    this.supportedConditions.add(supportedConditionsItem);
    return this;
  }

   /**
   * Get supportedConditions
   * @return supportedConditions
  **/
  @Schema(description = "")
  public List<SupportedConditionsEnum> getSupportedConditions() {
    return supportedConditions;
  }

  public void setSupportedConditions(List<SupportedConditionsEnum> supportedConditions) {
    this.supportedConditions = supportedConditions;
  }

  public SolrIndexField termOffsets(Boolean termOffsets) {
    this.termOffsets = termOffsets;
    return this;
  }

   /**
   * Get termOffsets
   * @return termOffsets
  **/
  @Schema(description = "")
  public Boolean isTermOffsets() {
    return termOffsets;
  }

  public void setTermOffsets(Boolean termOffsets) {
    this.termOffsets = termOffsets;
  }

  public SolrIndexField termPayloads(Boolean termPayloads) {
    this.termPayloads = termPayloads;
    return this;
  }

   /**
   * Get termPayloads
   * @return termPayloads
  **/
  @Schema(description = "")
  public Boolean isTermPayloads() {
    return termPayloads;
  }

  public void setTermPayloads(Boolean termPayloads) {
    this.termPayloads = termPayloads;
  }

  public SolrIndexField termPositions(Boolean termPositions) {
    this.termPositions = termPositions;
    return this;
  }

   /**
   * Get termPositions
   * @return termPositions
  **/
  @Schema(description = "")
  public Boolean isTermPositions() {
    return termPositions;
  }

  public void setTermPositions(Boolean termPositions) {
    this.termPositions = termPositions;
  }

  public SolrIndexField termVectors(Boolean termVectors) {
    this.termVectors = termVectors;
    return this;
  }

   /**
   * Get termVectors
   * @return termVectors
  **/
  @Schema(description = "")
  public Boolean isTermVectors() {
    return termVectors;
  }

  public void setTermVectors(Boolean termVectors) {
    this.termVectors = termVectors;
  }

  public SolrIndexField uninvertible(Boolean uninvertible) {
    this.uninvertible = uninvertible;
    return this;
  }

   /**
   * Get uninvertible
   * @return uninvertible
  **/
  @Schema(description = "")
  public Boolean isUninvertible() {
    return uninvertible;
  }

  public void setUninvertible(Boolean uninvertible) {
    this.uninvertible = uninvertible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolrIndexField solrIndexField = (SolrIndexField) o;
    return Objects.equals(this.defaultValue, solrIndexField.defaultValue) &&
        Objects.equals(this.docValues, solrIndexField.docValues) &&
        Objects.equals(this.fieldName, solrIndexField.fieldName) &&
        Objects.equals(this.fieldType, solrIndexField.fieldType) &&
        Objects.equals(this.fieldUse, solrIndexField.fieldUse) &&
        Objects.equals(this.indexed, solrIndexField.indexed) &&
        Objects.equals(this.multiValued, solrIndexField.multiValued) &&
        Objects.equals(this.omitNorms, solrIndexField.omitNorms) &&
        Objects.equals(this.omitPositions, solrIndexField.omitPositions) &&
        Objects.equals(this.omitTermFreqAndPositions, solrIndexField.omitTermFreqAndPositions) &&
        Objects.equals(this.required, solrIndexField.required) &&
        Objects.equals(this.sortMissingFirst, solrIndexField.sortMissingFirst) &&
        Objects.equals(this.sortMissingLast, solrIndexField.sortMissingLast) &&
        Objects.equals(this.stored, solrIndexField.stored) &&
        Objects.equals(this.supportedConditions, solrIndexField.supportedConditions) &&
        Objects.equals(this.termOffsets, solrIndexField.termOffsets) &&
        Objects.equals(this.termPayloads, solrIndexField.termPayloads) &&
        Objects.equals(this.termPositions, solrIndexField.termPositions) &&
        Objects.equals(this.termVectors, solrIndexField.termVectors) &&
        Objects.equals(this.uninvertible, solrIndexField.uninvertible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, docValues, fieldName, fieldType, fieldUse, indexed, multiValued, omitNorms, omitPositions, omitTermFreqAndPositions, required, sortMissingFirst, sortMissingLast, stored, supportedConditions, termOffsets, termPayloads, termPositions, termVectors, uninvertible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolrIndexField {\n");
    
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    docValues: ").append(toIndentedString(docValues)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldUse: ").append(toIndentedString(fieldUse)).append("\n");
    sb.append("    indexed: ").append(toIndentedString(indexed)).append("\n");
    sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
    sb.append("    omitNorms: ").append(toIndentedString(omitNorms)).append("\n");
    sb.append("    omitPositions: ").append(toIndentedString(omitPositions)).append("\n");
    sb.append("    omitTermFreqAndPositions: ").append(toIndentedString(omitTermFreqAndPositions)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    sortMissingFirst: ").append(toIndentedString(sortMissingFirst)).append("\n");
    sb.append("    sortMissingLast: ").append(toIndentedString(sortMissingLast)).append("\n");
    sb.append("    stored: ").append(toIndentedString(stored)).append("\n");
    sb.append("    supportedConditions: ").append(toIndentedString(supportedConditions)).append("\n");
    sb.append("    termOffsets: ").append(toIndentedString(termOffsets)).append("\n");
    sb.append("    termPayloads: ").append(toIndentedString(termPayloads)).append("\n");
    sb.append("    termPositions: ").append(toIndentedString(termPositions)).append("\n");
    sb.append("    termVectors: ").append(toIndentedString(termVectors)).append("\n");
    sb.append("    uninvertible: ").append(toIndentedString(uninvertible)).append("\n");
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

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
import io.swagger.client.model.DashboardSearchRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DownloadSearchResultsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DownloadSearchResultsRequest {
  @SerializedName("applicationInstanceId")
  private String applicationInstanceId = null;

  @SerializedName("componentId")
  private String componentId = null;

  @SerializedName("dateTimeLocale")
  private String dateTimeLocale = null;

  /**
   * Gets or Sets fileType
   */
  @JsonAdapter(FileTypeEnum.Adapter.class)
  public enum FileTypeEnum {
    EXCEL("EXCEL"),
    CSV("CSV"),
    TSV("TSV");

    private String value;

    FileTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FileTypeEnum fromValue(String text) {
      for (FileTypeEnum b : FileTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FileTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FileTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FileTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return FileTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("fileType")
  private FileTypeEnum fileType = null;

  @SerializedName("percent")
  private Integer percent = null;

  @SerializedName("sample")
  private Boolean sample = null;

  @SerializedName("searchRequest")
  private DashboardSearchRequest searchRequest = null;

  public DownloadSearchResultsRequest applicationInstanceId(String applicationInstanceId) {
    this.applicationInstanceId = applicationInstanceId;
    return this;
  }

   /**
   * Get applicationInstanceId
   * @return applicationInstanceId
  **/
  @Schema(description = "")
  public String getApplicationInstanceId() {
    return applicationInstanceId;
  }

  public void setApplicationInstanceId(String applicationInstanceId) {
    this.applicationInstanceId = applicationInstanceId;
  }

  public DownloadSearchResultsRequest componentId(String componentId) {
    this.componentId = componentId;
    return this;
  }

   /**
   * Get componentId
   * @return componentId
  **/
  @Schema(description = "")
  public String getComponentId() {
    return componentId;
  }

  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }

  public DownloadSearchResultsRequest dateTimeLocale(String dateTimeLocale) {
    this.dateTimeLocale = dateTimeLocale;
    return this;
  }

   /**
   * Get dateTimeLocale
   * @return dateTimeLocale
  **/
  @Schema(description = "")
  public String getDateTimeLocale() {
    return dateTimeLocale;
  }

  public void setDateTimeLocale(String dateTimeLocale) {
    this.dateTimeLocale = dateTimeLocale;
  }

  public DownloadSearchResultsRequest fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @Schema(description = "")
  public FileTypeEnum getFileType() {
    return fileType;
  }

  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }

  public DownloadSearchResultsRequest percent(Integer percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @Schema(description = "")
  public Integer getPercent() {
    return percent;
  }

  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  public DownloadSearchResultsRequest sample(Boolean sample) {
    this.sample = sample;
    return this;
  }

   /**
   * Get sample
   * @return sample
  **/
  @Schema(description = "")
  public Boolean isSample() {
    return sample;
  }

  public void setSample(Boolean sample) {
    this.sample = sample;
  }

  public DownloadSearchResultsRequest searchRequest(DashboardSearchRequest searchRequest) {
    this.searchRequest = searchRequest;
    return this;
  }

   /**
   * Get searchRequest
   * @return searchRequest
  **/
  @Schema(description = "")
  public DashboardSearchRequest getSearchRequest() {
    return searchRequest;
  }

  public void setSearchRequest(DashboardSearchRequest searchRequest) {
    this.searchRequest = searchRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadSearchResultsRequest downloadSearchResultsRequest = (DownloadSearchResultsRequest) o;
    return Objects.equals(this.applicationInstanceId, downloadSearchResultsRequest.applicationInstanceId) &&
        Objects.equals(this.componentId, downloadSearchResultsRequest.componentId) &&
        Objects.equals(this.dateTimeLocale, downloadSearchResultsRequest.dateTimeLocale) &&
        Objects.equals(this.fileType, downloadSearchResultsRequest.fileType) &&
        Objects.equals(this.percent, downloadSearchResultsRequest.percent) &&
        Objects.equals(this.sample, downloadSearchResultsRequest.sample) &&
        Objects.equals(this.searchRequest, downloadSearchResultsRequest.searchRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationInstanceId, componentId, dateTimeLocale, fileType, percent, sample, searchRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadSearchResultsRequest {\n");
    
    sb.append("    applicationInstanceId: ").append(toIndentedString(applicationInstanceId)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    dateTimeLocale: ").append(toIndentedString(dateTimeLocale)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
    sb.append("    searchRequest: ").append(toIndentedString(searchRequest)).append("\n");
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

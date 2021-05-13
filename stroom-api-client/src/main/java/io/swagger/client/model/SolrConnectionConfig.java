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
 * SolrConnectionConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class SolrConnectionConfig {
  /**
   * Gets or Sets instanceType
   */
  @JsonAdapter(InstanceTypeEnum.Adapter.class)
  public enum InstanceTypeEnum {
    SINGLE_NOOE("SINGLE_NOOE"),
    SOLR_CLOUD("SOLR_CLOUD");

    private String value;

    InstanceTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InstanceTypeEnum fromValue(String text) {
      for (InstanceTypeEnum b : InstanceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InstanceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstanceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstanceTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InstanceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("instanceType")
  private InstanceTypeEnum instanceType = null;

  @SerializedName("solrUrls")
  private List<String> solrUrls = null;

  @SerializedName("useZk")
  private Boolean useZk = null;

  @SerializedName("zkHosts")
  private List<String> zkHosts = null;

  @SerializedName("zkPath")
  private String zkPath = null;

  public SolrConnectionConfig instanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(description = "")
  public InstanceTypeEnum getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(InstanceTypeEnum instanceType) {
    this.instanceType = instanceType;
  }

  public SolrConnectionConfig solrUrls(List<String> solrUrls) {
    this.solrUrls = solrUrls;
    return this;
  }

  public SolrConnectionConfig addSolrUrlsItem(String solrUrlsItem) {
    if (this.solrUrls == null) {
      this.solrUrls = new ArrayList<String>();
    }
    this.solrUrls.add(solrUrlsItem);
    return this;
  }

   /**
   * Get solrUrls
   * @return solrUrls
  **/
  @Schema(description = "")
  public List<String> getSolrUrls() {
    return solrUrls;
  }

  public void setSolrUrls(List<String> solrUrls) {
    this.solrUrls = solrUrls;
  }

  public SolrConnectionConfig useZk(Boolean useZk) {
    this.useZk = useZk;
    return this;
  }

   /**
   * Get useZk
   * @return useZk
  **/
  @Schema(description = "")
  public Boolean isUseZk() {
    return useZk;
  }

  public void setUseZk(Boolean useZk) {
    this.useZk = useZk;
  }

  public SolrConnectionConfig zkHosts(List<String> zkHosts) {
    this.zkHosts = zkHosts;
    return this;
  }

  public SolrConnectionConfig addZkHostsItem(String zkHostsItem) {
    if (this.zkHosts == null) {
      this.zkHosts = new ArrayList<String>();
    }
    this.zkHosts.add(zkHostsItem);
    return this;
  }

   /**
   * Get zkHosts
   * @return zkHosts
  **/
  @Schema(description = "")
  public List<String> getZkHosts() {
    return zkHosts;
  }

  public void setZkHosts(List<String> zkHosts) {
    this.zkHosts = zkHosts;
  }

  public SolrConnectionConfig zkPath(String zkPath) {
    this.zkPath = zkPath;
    return this;
  }

   /**
   * Get zkPath
   * @return zkPath
  **/
  @Schema(description = "")
  public String getZkPath() {
    return zkPath;
  }

  public void setZkPath(String zkPath) {
    this.zkPath = zkPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolrConnectionConfig solrConnectionConfig = (SolrConnectionConfig) o;
    return Objects.equals(this.instanceType, solrConnectionConfig.instanceType) &&
        Objects.equals(this.solrUrls, solrConnectionConfig.solrUrls) &&
        Objects.equals(this.useZk, solrConnectionConfig.useZk) &&
        Objects.equals(this.zkHosts, solrConnectionConfig.zkHosts) &&
        Objects.equals(this.zkPath, solrConnectionConfig.zkPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, solrUrls, useZk, zkHosts, zkPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolrConnectionConfig {\n");
    
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    solrUrls: ").append(toIndentedString(solrUrls)).append("\n");
    sb.append("    useZk: ").append(toIndentedString(useZk)).append("\n");
    sb.append("    zkHosts: ").append(toIndentedString(zkHosts)).append("\n");
    sb.append("    zkPath: ").append(toIndentedString(zkPath)).append("\n");
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

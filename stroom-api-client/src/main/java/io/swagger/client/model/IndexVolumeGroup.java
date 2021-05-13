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
 * IndexVolumeGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class IndexVolumeGroup {
  @SerializedName("createTimeMs")
  private Long createTimeMs = null;

  @SerializedName("createUser")
  private String createUser = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updateTimeMs")
  private Long updateTimeMs = null;

  @SerializedName("updateUser")
  private String updateUser = null;

  @SerializedName("version")
  private Integer version = null;

  public IndexVolumeGroup createTimeMs(Long createTimeMs) {
    this.createTimeMs = createTimeMs;
    return this;
  }

   /**
   * Get createTimeMs
   * @return createTimeMs
  **/
  @Schema(description = "")
  public Long getCreateTimeMs() {
    return createTimeMs;
  }

  public void setCreateTimeMs(Long createTimeMs) {
    this.createTimeMs = createTimeMs;
  }

  public IndexVolumeGroup createUser(String createUser) {
    this.createUser = createUser;
    return this;
  }

   /**
   * Get createUser
   * @return createUser
  **/
  @Schema(description = "")
  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public IndexVolumeGroup id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public IndexVolumeGroup name(String name) {
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

  public IndexVolumeGroup updateTimeMs(Long updateTimeMs) {
    this.updateTimeMs = updateTimeMs;
    return this;
  }

   /**
   * Get updateTimeMs
   * @return updateTimeMs
  **/
  @Schema(description = "")
  public Long getUpdateTimeMs() {
    return updateTimeMs;
  }

  public void setUpdateTimeMs(Long updateTimeMs) {
    this.updateTimeMs = updateTimeMs;
  }

  public IndexVolumeGroup updateUser(String updateUser) {
    this.updateUser = updateUser;
    return this;
  }

   /**
   * Get updateUser
   * @return updateUser
  **/
  @Schema(description = "")
  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public IndexVolumeGroup version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexVolumeGroup indexVolumeGroup = (IndexVolumeGroup) o;
    return Objects.equals(this.createTimeMs, indexVolumeGroup.createTimeMs) &&
        Objects.equals(this.createUser, indexVolumeGroup.createUser) &&
        Objects.equals(this.id, indexVolumeGroup.id) &&
        Objects.equals(this.name, indexVolumeGroup.name) &&
        Objects.equals(this.updateTimeMs, indexVolumeGroup.updateTimeMs) &&
        Objects.equals(this.updateUser, indexVolumeGroup.updateUser) &&
        Objects.equals(this.version, indexVolumeGroup.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTimeMs, createUser, id, name, updateTimeMs, updateUser, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexVolumeGroup {\n");
    
    sb.append("    createTimeMs: ").append(toIndentedString(createTimeMs)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updateTimeMs: ").append(toIndentedString(updateTimeMs)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
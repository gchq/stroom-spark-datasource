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
 * A class for describing a unique reference to a &#x27;document&#x27; in stroom.  A &#x27;document&#x27; is an entity in stroom such as a data source dictionary or pipeline.
 */
@Schema(description = "A class for describing a unique reference to a 'document' in stroom.  A 'document' is an entity in stroom such as a data source dictionary or pipeline.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DocRef {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uuid")
  private String uuid = null;

  public DocRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for the data source
   * @return name
  **/
  @Schema(example = "MyStatistic", required = true, description = "The name for the data source")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocRef type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the &#x27;document&#x27; that this DocRef refers to
   * @return type
  **/
  @Schema(example = "StroomStatsStore", required = true, description = "The type of the 'document' that this DocRef refers to")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DocRef uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * The unique identifier for this &#x27;document&#x27;
   * @return uuid
  **/
  @Schema(example = "9f6184b4-bd78-48bc-b0cd-6e51a357f6a6", required = true, description = "The unique identifier for this 'document'")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocRef docRef = (DocRef) o;
    return Objects.equals(this.name, docRef.name) &&
        Objects.equals(this.type, docRef.type) &&
        Objects.equals(this.uuid, docRef.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocRef {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

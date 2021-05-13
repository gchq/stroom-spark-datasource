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
import io.swagger.client.model.DocRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ExplorerServiceMoveRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class ExplorerServiceMoveRequest {
  @SerializedName("destinationFolderRef")
  private DocRef destinationFolderRef = null;

  @SerializedName("docRefs")
  private List<DocRef> docRefs = null;

  /**
   * Gets or Sets permissionInheritance
   */
  @JsonAdapter(PermissionInheritanceEnum.Adapter.class)
  public enum PermissionInheritanceEnum {
    NONE("NONE"),
    SOURCE("SOURCE"),
    DESTINATION("DESTINATION"),
    COMBINED("COMBINED");

    private String value;

    PermissionInheritanceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PermissionInheritanceEnum fromValue(String text) {
      for (PermissionInheritanceEnum b : PermissionInheritanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PermissionInheritanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionInheritanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionInheritanceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return PermissionInheritanceEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("permissionInheritance")
  private PermissionInheritanceEnum permissionInheritance = null;

  public ExplorerServiceMoveRequest destinationFolderRef(DocRef destinationFolderRef) {
    this.destinationFolderRef = destinationFolderRef;
    return this;
  }

   /**
   * Get destinationFolderRef
   * @return destinationFolderRef
  **/
  @Schema(description = "")
  public DocRef getDestinationFolderRef() {
    return destinationFolderRef;
  }

  public void setDestinationFolderRef(DocRef destinationFolderRef) {
    this.destinationFolderRef = destinationFolderRef;
  }

  public ExplorerServiceMoveRequest docRefs(List<DocRef> docRefs) {
    this.docRefs = docRefs;
    return this;
  }

  public ExplorerServiceMoveRequest addDocRefsItem(DocRef docRefsItem) {
    if (this.docRefs == null) {
      this.docRefs = new ArrayList<DocRef>();
    }
    this.docRefs.add(docRefsItem);
    return this;
  }

   /**
   * Get docRefs
   * @return docRefs
  **/
  @Schema(description = "")
  public List<DocRef> getDocRefs() {
    return docRefs;
  }

  public void setDocRefs(List<DocRef> docRefs) {
    this.docRefs = docRefs;
  }

  public ExplorerServiceMoveRequest permissionInheritance(PermissionInheritanceEnum permissionInheritance) {
    this.permissionInheritance = permissionInheritance;
    return this;
  }

   /**
   * Get permissionInheritance
   * @return permissionInheritance
  **/
  @Schema(description = "")
  public PermissionInheritanceEnum getPermissionInheritance() {
    return permissionInheritance;
  }

  public void setPermissionInheritance(PermissionInheritanceEnum permissionInheritance) {
    this.permissionInheritance = permissionInheritance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplorerServiceMoveRequest explorerServiceMoveRequest = (ExplorerServiceMoveRequest) o;
    return Objects.equals(this.destinationFolderRef, explorerServiceMoveRequest.destinationFolderRef) &&
        Objects.equals(this.docRefs, explorerServiceMoveRequest.docRefs) &&
        Objects.equals(this.permissionInheritance, explorerServiceMoveRequest.permissionInheritance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationFolderRef, docRefs, permissionInheritance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplorerServiceMoveRequest {\n");
    
    sb.append("    destinationFolderRef: ").append(toIndentedString(destinationFolderRef)).append("\n");
    sb.append("    docRefs: ").append(toIndentedString(docRefs)).append("\n");
    sb.append("    permissionInheritance: ").append(toIndentedString(permissionInheritance)).append("\n");
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

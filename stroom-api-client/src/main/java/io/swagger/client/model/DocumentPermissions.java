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
import io.swagger.client.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * DocumentPermissions
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class DocumentPermissions {
  @SerializedName("docUuid")
  private String docUuid = null;

  @SerializedName("groups")
  private List<User> groups = null;

  @SerializedName("permissions")
  private Map<String, List<String>> permissions = null;

  @SerializedName("users")
  private List<User> users = null;

  public DocumentPermissions docUuid(String docUuid) {
    this.docUuid = docUuid;
    return this;
  }

   /**
   * Get docUuid
   * @return docUuid
  **/
  @Schema(description = "")
  public String getDocUuid() {
    return docUuid;
  }

  public void setDocUuid(String docUuid) {
    this.docUuid = docUuid;
  }

  public DocumentPermissions groups(List<User> groups) {
    this.groups = groups;
    return this;
  }

  public DocumentPermissions addGroupsItem(User groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<User>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<User> getGroups() {
    return groups;
  }

  public void setGroups(List<User> groups) {
    this.groups = groups;
  }

  public DocumentPermissions permissions(Map<String, List<String>> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DocumentPermissions putPermissionsItem(String key, List<String> permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new HashMap<String, List<String>>();
    }
    this.permissions.put(key, permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public Map<String, List<String>> getPermissions() {
    return permissions;
  }

  public void setPermissions(Map<String, List<String>> permissions) {
    this.permissions = permissions;
  }

  public DocumentPermissions users(List<User> users) {
    this.users = users;
    return this;
  }

  public DocumentPermissions addUsersItem(User usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<User>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentPermissions documentPermissions = (DocumentPermissions) o;
    return Objects.equals(this.docUuid, documentPermissions.docUuid) &&
        Objects.equals(this.groups, documentPermissions.groups) &&
        Objects.equals(this.permissions, documentPermissions.permissions) &&
        Objects.equals(this.users, documentPermissions.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docUuid, groups, permissions, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentPermissions {\n");
    
    sb.append("    docUuid: ").append(toIndentedString(docUuid)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
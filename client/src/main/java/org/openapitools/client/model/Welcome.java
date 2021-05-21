/*
 * Stroom API
 * Various APIs for interacting with Stroom and its data
 *
 * The version of the OpenAPI document: v1/v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * Welcome
 */
@JsonPropertyOrder({
  Welcome.JSON_PROPERTY_HTML
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-21T12:01:37.582+01:00[Europe/London]")
public class Welcome {
  public static final String JSON_PROPERTY_HTML = "html";
  private String html;


  public Welcome html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Get html
   * @return html
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtml() {
    return html;
  }


  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtml(String html) {
    this.html = html;
  }


  /**
   * Return true if this Welcome object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Welcome welcome = (Welcome) o;
    return Objects.equals(this.html, welcome.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Welcome {\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


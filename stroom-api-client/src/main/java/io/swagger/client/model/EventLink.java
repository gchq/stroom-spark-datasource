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
import io.swagger.client.model.EventId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * EventLink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class EventLink {
  @SerializedName("annotationId")
  private Long annotationId = null;

  @SerializedName("eventId")
  private EventId eventId = null;

  public EventLink annotationId(Long annotationId) {
    this.annotationId = annotationId;
    return this;
  }

   /**
   * Get annotationId
   * @return annotationId
  **/
  @Schema(description = "")
  public Long getAnnotationId() {
    return annotationId;
  }

  public void setAnnotationId(Long annotationId) {
    this.annotationId = annotationId;
  }

  public EventLink eventId(EventId eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @Schema(description = "")
  public EventId getEventId() {
    return eventId;
  }

  public void setEventId(EventId eventId) {
    this.eventId = eventId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventLink eventLink = (EventLink) o;
    return Objects.equals(this.annotationId, eventLink.annotationId) &&
        Objects.equals(this.eventId, eventLink.eventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationId, eventId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventLink {\n");
    
    sb.append("    annotationId: ").append(toIndentedString(annotationId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
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
import io.swagger.client.model.ActivityConfig;
import io.swagger.client.model.ProcessConfig;
import io.swagger.client.model.QueryConfig;
import io.swagger.client.model.SourceConfig;
import io.swagger.client.model.SplashConfig;
import io.swagger.client.model.ThemeConfig;
import io.swagger.client.model.UiPreferences;
import io.swagger.client.model.UrlConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UiConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-13T17:13:49.037+01:00[Europe/London]")
public class UiConfig {
  @SerializedName("aboutHtml")
  private String aboutHtml = null;

  @SerializedName("activity")
  private ActivityConfig activity = null;

  @SerializedName("defaultMaxResults")
  private String defaultMaxResults = null;

  @SerializedName("helpUrl")
  private String helpUrl = null;

  @SerializedName("htmlTitle")
  private String htmlTitle = null;

  @SerializedName("maintenanceMessage")
  private String maintenanceMessage = null;

  @SerializedName("namePattern")
  private String namePattern = null;

  @SerializedName("oncontextmenu")
  private String oncontextmenu = null;

  @SerializedName("process")
  private ProcessConfig process = null;

  @SerializedName("query")
  private QueryConfig query = null;

  @SerializedName("requireReactWrapper")
  private Boolean requireReactWrapper = null;

  @SerializedName("source")
  private SourceConfig source = null;

  @SerializedName("splash")
  private SplashConfig splash = null;

  @SerializedName("theme")
  private ThemeConfig theme = null;

  @SerializedName("uiPreferences")
  private UiPreferences uiPreferences = null;

  @SerializedName("url")
  private UrlConfig url = null;

  @SerializedName("welcomeHtml")
  private String welcomeHtml = null;

  public UiConfig aboutHtml(String aboutHtml) {
    this.aboutHtml = aboutHtml;
    return this;
  }

   /**
   * Get aboutHtml
   * @return aboutHtml
  **/
  @Schema(description = "")
  public String getAboutHtml() {
    return aboutHtml;
  }

  public void setAboutHtml(String aboutHtml) {
    this.aboutHtml = aboutHtml;
  }

  public UiConfig activity(ActivityConfig activity) {
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @Schema(description = "")
  public ActivityConfig getActivity() {
    return activity;
  }

  public void setActivity(ActivityConfig activity) {
    this.activity = activity;
  }

  public UiConfig defaultMaxResults(String defaultMaxResults) {
    this.defaultMaxResults = defaultMaxResults;
    return this;
  }

   /**
   * Get defaultMaxResults
   * @return defaultMaxResults
  **/
  @Schema(description = "")
  public String getDefaultMaxResults() {
    return defaultMaxResults;
  }

  public void setDefaultMaxResults(String defaultMaxResults) {
    this.defaultMaxResults = defaultMaxResults;
  }

  public UiConfig helpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
    return this;
  }

   /**
   * Get helpUrl
   * @return helpUrl
  **/
  @Schema(description = "")
  public String getHelpUrl() {
    return helpUrl;
  }

  public void setHelpUrl(String helpUrl) {
    this.helpUrl = helpUrl;
  }

  public UiConfig htmlTitle(String htmlTitle) {
    this.htmlTitle = htmlTitle;
    return this;
  }

   /**
   * Get htmlTitle
   * @return htmlTitle
  **/
  @Schema(description = "")
  public String getHtmlTitle() {
    return htmlTitle;
  }

  public void setHtmlTitle(String htmlTitle) {
    this.htmlTitle = htmlTitle;
  }

  public UiConfig maintenanceMessage(String maintenanceMessage) {
    this.maintenanceMessage = maintenanceMessage;
    return this;
  }

   /**
   * Get maintenanceMessage
   * @return maintenanceMessage
  **/
  @Schema(description = "")
  public String getMaintenanceMessage() {
    return maintenanceMessage;
  }

  public void setMaintenanceMessage(String maintenanceMessage) {
    this.maintenanceMessage = maintenanceMessage;
  }

  public UiConfig namePattern(String namePattern) {
    this.namePattern = namePattern;
    return this;
  }

   /**
   * Get namePattern
   * @return namePattern
  **/
  @Schema(description = "")
  public String getNamePattern() {
    return namePattern;
  }

  public void setNamePattern(String namePattern) {
    this.namePattern = namePattern;
  }

  public UiConfig oncontextmenu(String oncontextmenu) {
    this.oncontextmenu = oncontextmenu;
    return this;
  }

   /**
   * Get oncontextmenu
   * @return oncontextmenu
  **/
  @Schema(description = "")
  public String getOncontextmenu() {
    return oncontextmenu;
  }

  public void setOncontextmenu(String oncontextmenu) {
    this.oncontextmenu = oncontextmenu;
  }

  public UiConfig process(ProcessConfig process) {
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @Schema(description = "")
  public ProcessConfig getProcess() {
    return process;
  }

  public void setProcess(ProcessConfig process) {
    this.process = process;
  }

  public UiConfig query(QueryConfig query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @Schema(description = "")
  public QueryConfig getQuery() {
    return query;
  }

  public void setQuery(QueryConfig query) {
    this.query = query;
  }

  public UiConfig requireReactWrapper(Boolean requireReactWrapper) {
    this.requireReactWrapper = requireReactWrapper;
    return this;
  }

   /**
   * Get requireReactWrapper
   * @return requireReactWrapper
  **/
  @Schema(description = "")
  public Boolean isRequireReactWrapper() {
    return requireReactWrapper;
  }

  public void setRequireReactWrapper(Boolean requireReactWrapper) {
    this.requireReactWrapper = requireReactWrapper;
  }

  public UiConfig source(SourceConfig source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(description = "")
  public SourceConfig getSource() {
    return source;
  }

  public void setSource(SourceConfig source) {
    this.source = source;
  }

  public UiConfig splash(SplashConfig splash) {
    this.splash = splash;
    return this;
  }

   /**
   * Get splash
   * @return splash
  **/
  @Schema(description = "")
  public SplashConfig getSplash() {
    return splash;
  }

  public void setSplash(SplashConfig splash) {
    this.splash = splash;
  }

  public UiConfig theme(ThemeConfig theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @Schema(description = "")
  public ThemeConfig getTheme() {
    return theme;
  }

  public void setTheme(ThemeConfig theme) {
    this.theme = theme;
  }

  public UiConfig uiPreferences(UiPreferences uiPreferences) {
    this.uiPreferences = uiPreferences;
    return this;
  }

   /**
   * Get uiPreferences
   * @return uiPreferences
  **/
  @Schema(description = "")
  public UiPreferences getUiPreferences() {
    return uiPreferences;
  }

  public void setUiPreferences(UiPreferences uiPreferences) {
    this.uiPreferences = uiPreferences;
  }

  public UiConfig url(UrlConfig url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public UrlConfig getUrl() {
    return url;
  }

  public void setUrl(UrlConfig url) {
    this.url = url;
  }

  public UiConfig welcomeHtml(String welcomeHtml) {
    this.welcomeHtml = welcomeHtml;
    return this;
  }

   /**
   * Get welcomeHtml
   * @return welcomeHtml
  **/
  @Schema(description = "")
  public String getWelcomeHtml() {
    return welcomeHtml;
  }

  public void setWelcomeHtml(String welcomeHtml) {
    this.welcomeHtml = welcomeHtml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiConfig uiConfig = (UiConfig) o;
    return Objects.equals(this.aboutHtml, uiConfig.aboutHtml) &&
        Objects.equals(this.activity, uiConfig.activity) &&
        Objects.equals(this.defaultMaxResults, uiConfig.defaultMaxResults) &&
        Objects.equals(this.helpUrl, uiConfig.helpUrl) &&
        Objects.equals(this.htmlTitle, uiConfig.htmlTitle) &&
        Objects.equals(this.maintenanceMessage, uiConfig.maintenanceMessage) &&
        Objects.equals(this.namePattern, uiConfig.namePattern) &&
        Objects.equals(this.oncontextmenu, uiConfig.oncontextmenu) &&
        Objects.equals(this.process, uiConfig.process) &&
        Objects.equals(this.query, uiConfig.query) &&
        Objects.equals(this.requireReactWrapper, uiConfig.requireReactWrapper) &&
        Objects.equals(this.source, uiConfig.source) &&
        Objects.equals(this.splash, uiConfig.splash) &&
        Objects.equals(this.theme, uiConfig.theme) &&
        Objects.equals(this.uiPreferences, uiConfig.uiPreferences) &&
        Objects.equals(this.url, uiConfig.url) &&
        Objects.equals(this.welcomeHtml, uiConfig.welcomeHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aboutHtml, activity, defaultMaxResults, helpUrl, htmlTitle, maintenanceMessage, namePattern, oncontextmenu, process, query, requireReactWrapper, source, splash, theme, uiPreferences, url, welcomeHtml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiConfig {\n");
    
    sb.append("    aboutHtml: ").append(toIndentedString(aboutHtml)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    defaultMaxResults: ").append(toIndentedString(defaultMaxResults)).append("\n");
    sb.append("    helpUrl: ").append(toIndentedString(helpUrl)).append("\n");
    sb.append("    htmlTitle: ").append(toIndentedString(htmlTitle)).append("\n");
    sb.append("    maintenanceMessage: ").append(toIndentedString(maintenanceMessage)).append("\n");
    sb.append("    namePattern: ").append(toIndentedString(namePattern)).append("\n");
    sb.append("    oncontextmenu: ").append(toIndentedString(oncontextmenu)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requireReactWrapper: ").append(toIndentedString(requireReactWrapper)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    splash: ").append(toIndentedString(splash)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    uiPreferences: ").append(toIndentedString(uiPreferences)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    welcomeHtml: ").append(toIndentedString(welcomeHtml)).append("\n");
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

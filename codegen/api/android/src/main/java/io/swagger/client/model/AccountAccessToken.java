/*
 * drfrank
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * AccountAccessToken
 */

public class AccountAccessToken {
  @SerializedName("id")
  private String id = null;

  @SerializedName("ttl")
  private Double ttl = 1209600.0d;

  @SerializedName("scopes")
  private List<String> scopes = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("userId")
  private Double userId = null;

  public AccountAccessToken id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountAccessToken ttl(Double ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * time to live in seconds (2 weeks by default)
   * @return ttl
  **/
  @ApiModelProperty(value = "time to live in seconds (2 weeks by default)")
  public Double getTtl() {
    return ttl;
  }

  public void setTtl(Double ttl) {
    this.ttl = ttl;
  }

  public AccountAccessToken scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public AccountAccessToken addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Array of scopes granted to this access token.
   * @return scopes
  **/
  @ApiModelProperty(value = "Array of scopes granted to this access token.")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public AccountAccessToken created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AccountAccessToken userId(Double userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Double getUserId() {
    return userId;
  }

  public void setUserId(Double userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAccessToken accountAccessToken = (AccountAccessToken) o;
    return Objects.equals(this.id, accountAccessToken.id) &&
        Objects.equals(this.ttl, accountAccessToken.ttl) &&
        Objects.equals(this.scopes, accountAccessToken.scopes) &&
        Objects.equals(this.created, accountAccessToken.created) &&
        Objects.equals(this.userId, accountAccessToken.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ttl, scopes, created, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAccessToken {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


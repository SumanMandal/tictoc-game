package com.suman.tictac.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-28T13:27:51.824432900+05:30[Asia/Calcutta]")


public class UserDetails   {
  @JsonProperty("player_x")
  private String playerX = null;

  @JsonProperty("player_o")
  private String playerO = null;

  public UserDetails playerX(String playerX) {
    this.playerX = playerX;
    return this;
  }

  /**
   * Get playerX
   * @return playerX
   **/
  @Schema(description = "")
  
    public String getPlayerX() {
    return playerX;
  }

  public void setPlayerX(String playerX) {
    this.playerX = playerX;
  }

  public UserDetails playerO(String playerO) {
    this.playerO = playerO;
    return this;
  }

  /**
   * Get playerO
   * @return playerO
   **/
  @Schema(description = "")
  
    public String getPlayerO() {
    return playerO;
  }

  public void setPlayerO(String playerO) {
    this.playerO = playerO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(this.playerX, userDetails.playerX) &&
        Objects.equals(this.playerO, userDetails.playerO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerX, playerO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    
    sb.append("    playerX: ").append(toIndentedString(playerX)).append("\n");
    sb.append("    playerO: ").append(toIndentedString(playerO)).append("\n");
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

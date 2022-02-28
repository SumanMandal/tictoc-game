package com.suman.tictac.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.suman.tictac.model.GameDetailsReplay;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-28T13:27:51.824432900+05:30[Asia/Calcutta]")


public class GameDetails   {
  public GameDetails(String id, String playerX, String playerO, @Valid List<GameDetailsReplay> replay) {
		super();
		this.id = id;
		this.playerX = playerX;
		this.playerO = playerO;
		this.replay = replay;
	}

@JsonProperty("id")
  private String id = null;

  @JsonProperty("player_x")
  private String playerX = null;

  @JsonProperty("player_o")
  private String playerO = null;

  @JsonProperty("replay")
  @Valid
  private List<GameDetailsReplay> replay = null;

  public GameDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GameDetails playerX(String playerX) {
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

  public GameDetails playerO(String playerO) {
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

  public GameDetails replay(List<GameDetailsReplay> replay) {
    this.replay = replay;
    return this;
  }

  public GameDetails addReplayItem(GameDetailsReplay replayItem) {
    if (this.replay == null) {
      this.replay = new ArrayList<GameDetailsReplay>();
    }
    this.replay.add(replayItem);
    return this;
  }

  /**
   * Get replay
   * @return replay
   **/
  @Schema(description = "")
      @Valid
    public List<GameDetailsReplay> getReplay() {
    return replay;
  }

  public void setReplay(List<GameDetailsReplay> replay) {
    this.replay = replay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameDetails gameDetails = (GameDetails) o;
    return Objects.equals(this.id, gameDetails.id) &&
        Objects.equals(this.playerX, gameDetails.playerX) &&
        Objects.equals(this.playerO, gameDetails.playerO) &&
        Objects.equals(this.replay, gameDetails.replay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, playerX, playerO, replay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    playerX: ").append(toIndentedString(playerX)).append("\n");
    sb.append("    playerO: ").append(toIndentedString(playerO)).append("\n");
    sb.append("    replay: ").append(toIndentedString(replay)).append("\n");
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

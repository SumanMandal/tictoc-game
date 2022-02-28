package com.suman.tictac.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * MoveResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-28T13:27:51.824432900+05:30[Asia/Calcutta]")


public class MoveResponse   {
  @JsonProperty("id")
  private String id = null;

  public MoveResponse(String id, String string, @Valid String[] board, @Valid List<GameDetailsReplay> list) {
	super();
	this.id = id;
	this.nextPlayer = string;
	this.board = board;
	this.replay = list;
}

@JsonProperty("next_player")
  private String nextPlayer = null;

  @JsonProperty("board")
  @Valid
  private String[] board  = null;

  @JsonProperty("replay")
  @Valid
  private List<GameDetailsReplay> replay = null;

  public MoveResponse id(String id) {
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

  public MoveResponse nextPlayer(String nextPlayer) {
    this.nextPlayer = nextPlayer;
    return this;
  }

  /**
   * Get nextPlayer
   * @return nextPlayer
   **/
  @Schema(description = "")
  
    @Valid
    public String getNextPlayer() {
    return nextPlayer;
  }

  public void setNextPlayer(String nextPlayer) {
    this.nextPlayer = nextPlayer;
  }

  /**
   * Get board
   * @return board
   **/
  @Schema(description = "")
      @Valid
    public String[] getBoard() {
    return board;
  }

  public void setBoard(String[] board) {
    this.board = board;
  }

  public MoveResponse replay(List<GameDetailsReplay> replay) {
    this.replay = replay;
    return this;
  }

  public MoveResponse addReplayItem(GameDetailsReplay replayItem) {
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
    MoveResponse moveResponse = (MoveResponse) o;
    return Objects.equals(this.id, moveResponse.id) &&
        Objects.equals(this.nextPlayer, moveResponse.nextPlayer) &&
        Objects.equals(this.board, moveResponse.board) &&
        Objects.equals(this.replay, moveResponse.replay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nextPlayer, board, replay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nextPlayer: ").append(toIndentedString(nextPlayer)).append("\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
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

package com.suman.tictac.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GameDetailsReplay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-28T13:27:51.824432900+05:30[Asia/Calcutta]")


public class GameDetailsReplay   {
	
  @JsonProperty("player")
  private String player = null;
	
  @JsonProperty("row")
  private Integer row = null;

  @JsonProperty("column")
  private Integer column = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public GameDetailsReplay row(Integer row) {
    this.row = row;
    return this;
  }

  
  public GameDetailsReplay(String player, Integer row, Integer column) {
	super();
	this.player = player;
	this.row = row;
	this.column = column;
	this.timestamp =  LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
}


@Schema(description = "")
	  public String getPlayer() {
		return player;
	}
	
	
	
	public void setPlayer(String player) {
		this.player = player;
	}



/**
   * Get row
   * @return row
   **/
  @Schema(description = "")
  
    public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public GameDetailsReplay column(Integer column) {
    this.column = column;
    return this;
  }

  /**
   * Get column
   * @return column
   **/
  @Schema(description = "")
  
    public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public GameDetailsReplay timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @Schema(description = "")
  
    public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameDetailsReplay gameDetailsReplay = (GameDetailsReplay) o;
    return Objects.equals(this.row, gameDetailsReplay.row) &&
        Objects.equals(this.column, gameDetailsReplay.column) &&
        Objects.equals(this.player, gameDetailsReplay.player) &&
        Objects.equals(this.timestamp, gameDetailsReplay.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, column, timestamp,player);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameDetailsReplay {\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

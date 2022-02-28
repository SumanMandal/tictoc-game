package com.suman.tictac.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * MoveResponseReplay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-28T13:27:51.824432900+05:30[Asia/Calcutta]")


public class MoveResponseReplay   {
  @JsonProperty("row")
  private Integer row = null;

  @JsonProperty("column")
  private Integer column = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public MoveResponseReplay row(Integer row) {
    this.row = row;
    return this;
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

  public MoveResponseReplay column(Integer column) {
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

  public MoveResponseReplay timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
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
    MoveResponseReplay moveResponseReplay = (MoveResponseReplay) o;
    return Objects.equals(this.row, moveResponseReplay.row) &&
        Objects.equals(this.column, moveResponseReplay.column) &&
        Objects.equals(this.timestamp, moveResponseReplay.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, column, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveResponseReplay {\n");
    
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

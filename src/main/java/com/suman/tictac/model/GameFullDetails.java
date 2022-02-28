package com.suman.tictac.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.suman.tictac.config.CommonVariable;


public class GameFullDetails {

	  @Override
	public String toString() {
		return "GameFullDetails [id=" + id + ", playerX=" + playerX + ", playerO=" + playerO + ", replay=" + replay
				+ ", gameState=" + Arrays.toString(gameState) + ", nextPlayer=" + nextPlayer + "]";
	}

	private String  id = null;

	  private String playerX = null;
	  
	  private String playerO = null;

	  private List<GameDetailsReplay> replay = null;
	  
	  private String[] gameState = null; //
	  
	  private String nextPlayer = null;

		public String getNextPlayer() {
			return nextPlayer;
		}
	
		public void setNextPlayer(String nextPlayer) {
			this.nextPlayer = nextPlayer;
		}
	
		public String  getId() {
			return id;
		}
	
		public String getPlayerX() {
			return playerX;
		}
	
		public String getPlayerO() {
			return playerO;
		}
	
		public GameFullDetails(String playerX, String playerO) {
			super();
			this.id = UUID.randomUUID().toString();
			this.playerX = playerX;
			this.playerO = playerO;
			this.nextPlayer = CommonVariable.X_CODE;
			this.gameState = new String[9];
			this.replay = new ArrayList<>();
		}
		
		public void  updateState(int row, int col) {
			int pos  =  (row -1)*3 + (col-1);
			this.gameState[pos] = this.nextPlayer;
			GameDetailsReplay gdReply = new GameDetailsReplay(this.nextPlayer,row,col);
			this.replay.add(gdReply);
			this.nextPlayer = this.nextPlayer == CommonVariable.X_CODE ? CommonVariable.O_CODE : CommonVariable.X_CODE;
			
			
		}

		public List<GameDetailsReplay> getReplay() {
			return replay;
		}
	
		public String[] getGameState() {
			return gameState;
		}
	  
	  
	  
	  
}

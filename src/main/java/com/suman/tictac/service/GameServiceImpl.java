package com.suman.tictac.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.tictac.model.GameDetails;
import com.suman.tictac.model.GameDetailsReplay;
import com.suman.tictac.model.GameFullDetails;
import com.suman.tictac.model.GameResponse;
import com.suman.tictac.model.MoveResponse;
import com.suman.tictac.repository.GameRepoImpl;

@Service
public class GameServiceImpl {

	@Autowired
	GameRepoImpl gameRepo;
	
   public GameResponse createGame(String playerX , String playerO) {
	  String id =  gameRepo.createGame(playerX, playerO);
	  return new GameResponse(id);
		
	}
	
	public MoveResponse updateMove(String id, int row , int column) {
		GameFullDetails  gf = gameRepo.updateMove(id,row,column);
		String result = checkWinner(gf.getGameState());
		List<GameDetailsReplay> list = result != null ? gf.getReplay() : null ;
		return new MoveResponse(gf.getId(), gf.getNextPlayer(), gf.getGameState(), list);
	}
	
	public List<GameDetails> getAllGame(){
		List<GameDetails> gdList = new ArrayList<>();
		for(GameFullDetails gfd : gameRepo.getAllGame() ) {
			gdList.add(new GameDetails(gfd.getId(),gfd.getPlayerX(),gfd.getPlayerO(),gfd.getReplay()));
		}
		return  gdList;
				
	}
	
//	public static void main(String[] args) {
//		GameRepoImpl gr = new GameRepoImpl();
//		String id = gr.createGame("Suman", "Amit");
//		GameFullDetails gfd = gr.updateMove(id, 1, 2);
//		System.out.println(gfd.toString());
//		GameFullDetails gfd1 = gr.updateMove(id, 1, 3);
//		System.out.println(gfd1.toString());
//		
//    }
	
	static String checkWinner(String[] board)
	{
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			//For X winner
			if (line.equals("XXX")) {
				return "X";
			}
			
			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}
		
		for (int a = 0; a < 9; a++) {
			if (board[0] == null) {
				break;
			}
			else if (a == 8) {
				return "draw";
			}
		}
		return null;
	}

}

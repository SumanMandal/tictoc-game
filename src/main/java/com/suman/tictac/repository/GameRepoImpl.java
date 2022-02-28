package com.suman.tictac.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.suman.tictac.model.GameFullDetails;

@Repository
public class GameRepoImpl {
	
	public static Map<String , GameFullDetails> gameMap = new HashMap<>();
	
	public String createGame(String playerX , String playerO) {
		
		GameFullDetails  gf = new GameFullDetails(playerX,playerO);
		gameMap.put(gf.getId(), gf);
		return gf.getId();
		
	}
	
	public GameFullDetails updateMove(String id, int row , int column) {
		GameFullDetails  gf = gameMap.get(id);
		gf.updateState(row, column);
		return gf;
	}
	
	public Collection<GameFullDetails> getAllGame(){
		return  gameMap.values();
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

}

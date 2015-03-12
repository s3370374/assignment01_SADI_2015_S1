package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.interfaces.GameEngine;
import model.interfaces.GameEngineCallback;
import model.interfaces.Player;

public class GameEngineImpl implements GameEngine {
	
	private List<Player> players;
	
	public GameEngineImpl() {
		this.players = new ArrayList<Player>();
	}
	
	@Override
	public void rollPlayer(Player player, int initialDelay, int finalDelay,
			int delayIncrement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollHouse(int initialDelay, int finalDelay, int delayIncrement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPlayer(Player player) {
		this.players.add(player);
	}

	@Override
	public boolean removePlayer(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void calculateResult() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Player> getAllPlayers() {
		return this.players;
	}

	@Override
	public boolean placeBet(Player player, int bet) {
		return player.placeBet(bet);
	}

}

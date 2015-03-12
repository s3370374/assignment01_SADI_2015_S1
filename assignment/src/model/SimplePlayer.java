package model;

import model.interfaces.DicePair;
import model.interfaces.Player;

public class SimplePlayer implements Player {
	
	private String ID;
	private String name;
	private int points;
	private int currentBet;

	public SimplePlayer(String id, String name, int points) {
		this.ID = id;
		this.name = name;
		this.points = points;
		this.currentBet = 0;
	}

	@Override
	public String getPlayerName() { return this.name; }
	@Override
	public void setPlayerName(String name) { this.name = name; }

	@Override
	public int getPoints() { return this.points; }
	@Override
	public void setPoints(int points) { this.points = points; }

	@Override
	public String getPlayerId() { return this.ID; }

	@Override
	public boolean placeBet(int bet) {
		if(bet > this.points) {
			return false;
		} 
		this.currentBet = bet;
		this.points -= bet;
		return true;
	}

	@Override
	public int getBet() {
		return this.currentBet;
	}

	@Override
	public DicePair getRollResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRollResult(DicePair rollResult) {
		// TODO Auto-generated method stub
		
	}
}

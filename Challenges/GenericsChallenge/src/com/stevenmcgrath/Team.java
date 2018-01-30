package com.stevenmcgrath;

public class Team<T extends Sport> implements Comparable<Team<T>> {
	private String name;
	private int gamesPlayed = 0;
	private int gamesWon = 0;
	private int gamesLost = 0;
	private int gamesTied = 0;
	
	public Team(String name) {
		this.name = name;
	}
	
	public int leaguePoints() {
		return ((this.gamesWon * 2) + this.gamesTied - this.gamesLost);
	}
	
	@Override
	public int compareTo(Team<T> team) {
		if (this.leaguePoints() > team.leaguePoints()) {
			return -1;
		} else if (this.leaguePoints() < team.leaguePoints()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}
	
	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}
	
	public void setGamesTied(int gamesTied) {
		this.gamesTied = gamesTied;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
	public int getGamesWon() {
		return gamesWon;
	}
	
	public int getGamesLost() {
		return gamesLost;
	}
	
	public int getGamesTied() {
		return gamesTied;
	}
}

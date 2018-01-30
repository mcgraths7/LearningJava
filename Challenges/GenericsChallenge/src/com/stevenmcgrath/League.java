package com.stevenmcgrath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Sport> {
	private String name;
	private List<Team<T>> leagueTeams;
	
	public League(String name) {
		this.name = name;
		this.leagueTeams = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void addTeamToLeague(Team<T> team) {
		if (leagueTeams.contains(team)) {
			System.out.println("That team is already in " + this.getName());
		}
		leagueTeams.add(team);
		System.out.println(team.getName() + " has been added to " + this.getName());
	}
	
	public void standings() {
		Collections.sort(leagueTeams, null);
		System.out.println(this.getName() + " Regular Season Standings:");
		for (Team<T> team:leagueTeams) {
			System.out.println("Team: " + team.getName() + " | Games Played: " + team.getGamesPlayed() + " | Wins:  "  + team.getGamesWon() + " | Losses: " +
												team.getGamesLost() + " | Ties: " + team.getGamesTied() + " | Points: " +
												team.leaguePoints());
		}
	}
	
	public void matchResult(Team<T> homeTeam, Team<T> awayTeam, int homeScore, int awayScore) {
		if (homeScore > awayScore) {
			homeTeam.setGamesWon(homeTeam.getGamesWon() + 1);
			awayTeam.setGamesLost(awayTeam.getGamesLost() + 1);
			System.out.println(homeTeam.getName() + " defeated " + awayTeam.getName() + " " + homeScore + "-" + awayScore );
		} else if (homeScore < awayScore) {
			homeTeam.setGamesLost(homeTeam.getGamesLost() + 1);
			awayTeam.setGamesWon(awayTeam.getGamesWon() + 1);
			System.out.println(awayTeam.getName() + " defeated " + homeTeam.getName() + " " + awayScore + "-" + homeScore );
			
		} else {
			homeTeam.setGamesTied(homeTeam.getGamesTied() + 1);
			awayTeam.setGamesTied(awayTeam.getGamesTied() + 1);
			System.out.println(homeTeam.getName() + " tied " + awayTeam.getName() + " " + homeScore + "-" + awayScore );
		}
		homeTeam.setGamesPlayed(homeTeam.getGamesPlayed() + 1);
		awayTeam.setGamesPlayed(awayTeam.getGamesPlayed() + 1);
	}
	
}

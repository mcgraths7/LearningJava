package com.stevenmcgrath;

public class Main {
	public static void main(String[] args) {
		Team<Baseball> clevelandIndians = new Team<>("Cleveland Indians");
		Team<Baseball> minnesotaTwins = new Team<>("Minnesota Twins");
		Team<Baseball> kansasCityRoyals = new Team<>("Kansas City Royals");
		Team<Baseball> chicagoWhiteSox = new Team<>("Chicago White Sox");
		Team<Baseball> detroitTigers = new Team<>("Detroit Tigers");
		
		League<Baseball> americanLeagueCentral = new League<>("American League Central");
		
		americanLeagueCentral.addTeamToLeague(clevelandIndians);
		americanLeagueCentral.addTeamToLeague(minnesotaTwins);
		americanLeagueCentral.addTeamToLeague(kansasCityRoyals);
		americanLeagueCentral.addTeamToLeague(chicagoWhiteSox);
		americanLeagueCentral.addTeamToLeague(detroitTigers);
		
		americanLeagueCentral.matchResult(clevelandIndians, minnesotaTwins, 4, 2);
		americanLeagueCentral.matchResult(clevelandIndians, kansasCityRoyals, 3, 3);
		americanLeagueCentral.matchResult(clevelandIndians, chicagoWhiteSox, 7, 2);
		americanLeagueCentral.matchResult(clevelandIndians, detroitTigers, 1, 0);
		americanLeagueCentral.matchResult(kansasCityRoyals, clevelandIndians, 5, 9);
		americanLeagueCentral.matchResult(kansasCityRoyals, minnesotaTwins, 2, 3);
		americanLeagueCentral.matchResult(kansasCityRoyals, chicagoWhiteSox, 3, 4);
		americanLeagueCentral.matchResult(kansasCityRoyals, detroitTigers, 5, 5);
		americanLeagueCentral.matchResult(clevelandIndians, minnesotaTwins, 11, 9);
		americanLeagueCentral.matchResult(minnesotaTwins, clevelandIndians, 16, 12);
		americanLeagueCentral.matchResult(minnesotaTwins, kansasCityRoyals, 2, 2);
		americanLeagueCentral.matchResult(minnesotaTwins, chicagoWhiteSox, 4, 3);
		americanLeagueCentral.matchResult(minnesotaTwins, detroitTigers, 0, 5);
		americanLeagueCentral.matchResult(chicagoWhiteSox, clevelandIndians, 9, 5);
		americanLeagueCentral.matchResult(chicagoWhiteSox, kansasCityRoyals, 3, 1);
		americanLeagueCentral.matchResult(chicagoWhiteSox, minnesotaTwins, 1, 4);
		americanLeagueCentral.matchResult(chicagoWhiteSox, detroitTigers, 3, 7);
		americanLeagueCentral.matchResult(detroitTigers, clevelandIndians, 2, 2);
		americanLeagueCentral.matchResult(detroitTigers, kansasCityRoyals, 4, 0);
		americanLeagueCentral.matchResult(detroitTigers, chicagoWhiteSox, 6, 1);
		americanLeagueCentral.matchResult(detroitTigers, minnesotaTwins, 4, 2);
		
		americanLeagueCentral.standings();
	}
}

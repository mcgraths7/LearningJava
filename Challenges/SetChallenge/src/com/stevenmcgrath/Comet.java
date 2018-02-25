package com.stevenmcgrath;

public class Comet extends HeavenlyBody {
	
	public Comet(String name, double orbitalPeriod) {
		super(name, orbitalPeriod, BodyTypes.COMET);
	}
	
	@Override
	public boolean addSatellite(HeavenlyBody satellite) {
		return false;
	}
}

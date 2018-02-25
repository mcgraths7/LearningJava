package com.stevenmcgrath;

public class Planet extends HeavenlyBody {
	private final String type;
	
	public Planet(String name, double orbitalPeriod) {
		super(name, orbitalPeriod);
		this.type = "planet";
	}
}

package com.stevenmcgrath;

public class Comet extends HeavenlyBody {
	private final String type;
	
	public Comet(String name, double orbitalPeriod, String type) {
		super(name, orbitalPeriod);
		this.type = type;
	}
}

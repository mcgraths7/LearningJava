package com.stevenmcgrath;

public class Star extends HeavenlyBody {
	private final String type;
	
	public Star(String name, double orbitalPeriod, String bodyType, String type) {
		super(name, orbitalPeriod, bodyType);
		this.type = type;
	}
}

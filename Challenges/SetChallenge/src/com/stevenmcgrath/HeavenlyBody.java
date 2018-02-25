package com.stevenmcgrath;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private final BodyTypes bodyType;
	private final Set<HeavenlyBody> satellites;
	
	public enum BodyTypes {
		STAR,
		PLANET,
		MOON,
		COMET
	}
	public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.bodyType = bodyType;
		this.satellites = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public BodyTypes getBodyType() { return bodyType; }
	
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public boolean addSatellite(HeavenlyBody satellite) {
		return this.satellites.add(satellite);
	}
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}
	
	@Override
	public boolean equals(Object body) {
		if (this == body) {
			return true;
		}
		System.out.println("Object.getClass() is: " + body.getClass());
		System.out.println("this.getClass() is: " + this.getClass());
		if (body == null || body.getClass() != this.getClass()) {
			return false;
		}
		String bodyName = ((HeavenlyBody) body).getName();
		return this.name.equals(bodyName);
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode() called");
		return this.name.hashCode() + 85;
		
	}

}

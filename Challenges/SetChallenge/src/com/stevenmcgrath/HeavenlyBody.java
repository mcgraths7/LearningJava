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
	public final boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
			if (this.name.equals(theObject.getName())) {
				return this.bodyType == theObject.getBodyType();
			}
		}
		return false;
	}
	
	@Override
	public final int hashCode() {
		return this.name.hashCode() + 85 + this.bodyType.hashCode();
	}
	
	@Override
	public String toString() { return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod; }
	
}

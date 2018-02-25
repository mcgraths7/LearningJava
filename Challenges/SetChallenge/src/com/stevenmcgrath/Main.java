package com.stevenmcgrath;

import sun.security.provider.Sun;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	        /*
        Modify the previous HeavenlyBody example so that the HeavenlyBody
        class also has a "bodyType" field. This field will store the
        type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

        You can include as many types as you want, but must support at
        least PLANET and MOON.

        For each of the types that you support, subclass the HeavenlyBody class
        so that your program can create objects of the appropriate type.

        Although astronomers may shudder at this, our solar systems will
        allow two bodies to have the same name as long as they are not the
        same type of body: so you could have a star called "BetaMinor" and
        an asteroid also called "BetaMinor", for example.

        Hint: This is much easier to implement for the Set than it is for the Map,
        because the Map will need a key that uses both fields.

        There is a restriction that the only satellites that planets can have must
        be moons. Even if you don't implement a STAR type, though, your program
        should not prevent one being added in the future (and a STAR's satellites
        can be almost every kind of HeavenlyBody).

        Test cases:
        1. The planets and moons that we added in the previous video should appear in
        the solarSystem collection and in the sets of moons for the appropriate planets.

        2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

        3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).

        4. Attempting to add a duplicate to a Map results in the original being replaced
        by the new object.

        5. Two bodies with the same name but different designations can be added to the same set.

        6. Two bodies with the same name but different designations can be added to the same map,
        and can be retrieved from the map.
*/
	
	
	public static void main(String[] args) {
		HeavenlyBody planet = new Planet("Mercury", 88);
		solarSystem.put(planet.getName(), planet);
		planets.add(planet);
		
		HeavenlyBody sun = new Star("The Sun", 839500000);
		solarSystem.put(sun.getName(),sun);
		sun.addSatellite(planet);
		
		HeavenlyBody moon = new Moon("Luna", 28);
		solarSystem.put(moon.getName(), moon);
		sun.addSatellite(moon);
		
		planet = new Planet("Earth", 365);
		solarSystem.put(planet.getName(), planet);
		planet.addSatellite(moon);
		sun.addSatellite(planet);
		
		HeavenlyBody comet = new Comet("Hailey", 27375);
		solarSystem.put(comet.getName(), comet);
		sun.addSatellite(comet);
		
		planet = new Planet("Jupiter", 12*365);
		solarSystem.put(planet.getName(), planet);
		sun.addSatellite(planet);
		
		moon = new Moon("Io", 2);
		solarSystem.put(moon.getName(), moon);
		planet.addSatellite(moon);
		sun.addSatellite(moon);
		
		moon = new Moon("Europa", 5);
		solarSystem.put(moon.getName(), moon);
		planet.addSatellite(moon);
		sun.addSatellite(moon);
		
		moon = new Moon("Ganymede", 7);
		solarSystem.put(moon.getName(), moon);
		planet.addSatellite(moon);
		sun.addSatellite(moon);
		
		moon = new Moon("Callisto", 17);
		solarSystem.put(moon.getName(), moon);
		planet.addSatellite(moon);
		sun.addSatellite(moon);
		
		comet = new Comet("Callisto", 29800);
		solarSystem.put(comet.getName(), comet);
		sun.addSatellite(comet);
		
		
	}
	
}

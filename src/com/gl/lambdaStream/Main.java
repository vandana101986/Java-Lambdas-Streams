package com.gl.lambdaStream;

import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PlanetUtils utils = new PlanetUtils();
		
		List<Planet> beginningWithM = utils.getPlanetsBeginnningWithM(SolarSystem.getPlanets());
		System.out.println("Has name beginning with 'M' : ");
		for (Planet p : beginningWithM) {		
			System.out.println(p.getName());
		}
		List<Planet> hasMoreThanThreeMoons = utils.getPlanetsWithMoreThanThreeMoons(SolarSystem.getPlanets());
		System.out.println("Has more than 3 Moons : ");
		for (Planet p : hasMoreThanThreeMoons) {		
			System.out.println(p.getName());
		}
		
		List<Planet> hasRings = utils.getPlanetsWithRings(SolarSystem.getPlanets());
		System.out.println("Has rings : ");
		for (Planet p : hasRings) {		
			System.out.println(p.getName());
		}
	}

}

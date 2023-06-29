package com.gl.lambdaStream;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PlanetUtils utils = new PlanetUtils();
		List<Planet> beginningWithM = utils.getPlanetsBeginnningWithM(SolarSystem.getPlanets());
		List<Planet> hasMoreThanThreeMoons = utils.getPlanetsWithMoreThanThreeMoons(SolarSystem.getPlanets());
		//System.out.println("Has Rings : "+utils.getPlanetsWithRings(SolarSystem.getPlanets()));
		System.out.println("Has Rings : "+ hasMoreThanThreeMoons);
	}

}

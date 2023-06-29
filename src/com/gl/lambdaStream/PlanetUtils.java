package com.gl.lambdaStream;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {
	
	public List<Planet> getPlanetsBeginnningWithM(List<Planet> planets){
		return planets.stream()
				.filter(p -> p.getName().startsWith("M"))
				.collect(Collectors.toList());
	}
	
	public List<Planet> getPlanetsWithRings(List<Planet> planets){
		return planets.stream()
				.filter(p -> p.isHasRings())
				.collect(Collectors.toList());
	}
	
	public List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets){
		return planets.stream()
				.filter(p -> p.getNumberOfMoons() > 3)
				.collect(Collectors.toList());
	}
}

package com.arya.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperheroService {

//	public static Supplier<List<Superhero>> SUPERHEROSUPPLIER = () -> 
//		Arrays.asList(
//			new Superhero(1, "Wade", "Deadpool", "Street fighter", 28, false),
//			new Superhero(2, "Bruce", "Hulk", "Doctor", 50, false),
//			new Superhero(3, "Steve", "Captain America", "Solder", 120, false),
//			new Superhero(4, "Tony", "Iron Man", "Business man", 45, true),
//			new Superhero(5, "Steve", "Dr. Strange", "Doctor", 45, true),
//			new Superhero(6, "Peter", "Spider Man", "Student", 21, true)
//			);
//
//		
//		
//	public List<Superhero> getSuperheroes() {
//		return SUPERHEROSUPPLIER.get();
//	}
//
//	public static List<Superhero> getSuperheroByName(String name) {
//		return SUPERHEROSUPPLIER.get()
//				.stream()
//				.filter(superhero -> superhero.getName().equalsIgnoreCase(name))
//				.collect(Collectors.toList());
//	}
	
	
	
	public static List<Superhero> SUPERHEROS = Arrays.asList(
			new Superhero(1, "Wade", "Deadpool", "Street fighter", 28, false),
			new Superhero(2, "Bruce", "Hulk", "Doctor", 50, false),
			new Superhero(3, "Steve", "Captain America", "Solder", 120, false),
			new Superhero(4, "Tony", "Iron Man", "Business man", 45, true),
			new Superhero(5, "Steve", "Dr. Strange", "Doctor", 45, true),
			new Superhero(6, "Peter", "Spider Man", "Student", 21, true));

	
	
	public List<Superhero> getSuperheroes() {
		return SUPERHEROS;
	}

	
	public static List<Superhero> getSuperheroByName(String name) {

		List<Superhero> superheros = new ArrayList<Superhero>();

		for (Superhero superhero : SUPERHEROS) {
			if (superhero.getName().equalsIgnoreCase(name)) {
				superheros.add(superhero);
			}
		}
		
		if(superheros.isEmpty())
			superheros.add(new Superhero(0, "No matching data", "No matching data", "No matching data", 0, false));
		
		
		return superheros;
	}
}






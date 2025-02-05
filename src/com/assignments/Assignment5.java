package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {

		// Problem 1
		// Creating ArrayList of top 5 most populated countries in world and printing

		List<String> topPopulatedCountries = new ArrayList<String>();
		topPopulatedCountries.add("China");
		topPopulatedCountries.add("United States");
		topPopulatedCountries.add("Indonesia");
		topPopulatedCountries.add("France");
		topPopulatedCountries.add("England");
		// Printing 2nd country from above list
		System.out.println(topPopulatedCountries.get(1));

		// Problem 2
		// Created Hash set to store the top 10 cities of the worlds here just need to
		// print the size so used Hash set
		Set<String> topTenCities = new HashSet<String>();
		topTenCities.add("Akola");
		topTenCities.add("Pune");
		topTenCities.add("Mumbai");
		topTenCities.add("London");
		topTenCities.add("Hong Kong");
		topTenCities.add("Dubai");
		topTenCities.add("Macau");
		topTenCities.add("Bangkok");
		topTenCities.add("Paris");
		topTenCities.add("Kuala Lumpur");

		// Printing size of top Ten Cities set and that is 10
		System.out.println("Total Countries in the list :" + topTenCities.size());

		// Problem 3
		// Creating Hash map for top 5 cities in United State
		Map<String, Integer> topFiveCitiesInUS = new HashMap<String, Integer>();
		topFiveCitiesInUS.put("New York City", 8335897);
		topFiveCitiesInUS.put("Los Angeles", 3822238);
		topFiveCitiesInUS.put("Chicago", 2665039);
		topFiveCitiesInUS.put("Houston", 2302878);
		topFiveCitiesInUS.put("Phoenix", 1644409);

		// Printing top 5 cities Map
		System.out.println(topFiveCitiesInUS);

		// Problem 4
		// Created 10 random integer of array and do the addition of 3rd and 5th integer value
		int[] numbers = { 10, 90, 94, 40, 50, 90, 70, 80, 90, 99 };
		
		int thirdValue = numbers[2]; // Access the 3rd element (index 2)

        int fifthValue = numbers[4]; // Access the 5th element (index 4)

        int sum = thirdValue + fifthValue; // Add them together

		System.out.println("Addition of 3rd and 4th Values from given array :" + sum);
		//System.out.println("Addition of 3rd and 4th Values from given array :" + numbers[2] + numbers[4]);

		// Problem 5
		// Creating ArrayList of top 5 highest grossing movies

		List<String> topMovies = new ArrayList<String>();
		topMovies.add("Avatar");
		topMovies.add("Avengers: Endgame");
		topMovies.add("Avatar: The Way of Water");
		topMovies.add("Titanic");
		topMovies.add("Star Wars: Episode VIII - The Last Jedi:");

		// Printing 3rd movie from above list
		System.out.println(topMovies.get(2));

	}

}

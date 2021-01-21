package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Declaring and initializing a Map
		Map<String, String> nameToZip = new HashMap<String, String>();

		// Adding an item to a Map
		nameToZip.put("David", "44120");
		nameToZip.put("Dan", "44124");
		nameToZip.put("Elizabeth", "44012");
		nameToZip.put("Dan", "44100");

		// Retrieving an item from a Map
		System.out.println("David lives in " + nameToZip.get("David"));
		System.out.println("Dan lives in " + nameToZip.get("Dan"));
		System.out.println("Elizabeth lives in " + nameToZip.get("Elizabeth111111"));
		System.out.println();
		
		String someCustomerToSearch = "Bob";
		String zip = "43034";
		
		if (nameToZip.get(someCustomerToSearch) != null) {
			//we found bob
		}
		else {
			// put bob in the map
			nameToZip.put(someCustomerToSearch, zip);
		}
		
		
		
		//Declare and instantiate a map to hold Average population by state
		//state is our key --> String,   avg pop is our value --> Double
		
		Map<String, Double> averagePopulationOfStates = new HashMap<String, Double> ();
		
		averagePopulationOfStates.put("OH", 12222.00);  // java is handling the conversion for us from double to Double = boxing
		averagePopulationOfStates.put("PA", 12422.00);
		averagePopulationOfStates.put("TX", 128972.00);
		averagePopulationOfStates.put("LA", 1222.00);
		
		
		double avgOhio = averagePopulationOfStates.get("OH");  // java is handling the conversion from Double to double -> unboxing
		System.out.println(avgOhio);
		
		
		

		// Retrieving just the keys from a Map
		System.out.println("We can also retrieve a list of keys and iterate over them using a for loop:");

		//*** Note to instructor:
		//*** The return type of `Map<String, String>.keySet()` is a `Set<String>`. Keys are required to be unique 
		//*** and sets guarantee uniqueness.
		Set<String> keys = nameToZip.keySet(); // returns a Collection of all of the keys in the Map
		
		
		for (String name : keys) {
			System.out.println(name + " lives in " + nameToZip.get(name));
		}
		System.out.println();

		// Check to see if a key already exists
		if (nameToZip.containsKey("David")) {
			System.out.println("David exists");
		}
		System.out.println();

		System.out.println("set 12345 for key David");
		nameToZip.put("David", "12345"); // If key already exists, value is updated, otherwise key-value added

		// Iterate through the key-value pairs in the Map
		for (Map.Entry<String, String> nameZip : nameToZip.entrySet()) {
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		System.out.println();

		// Remove an element from the Map
		nameToZip.remove("David");
		System.out.println("removed David");
		System.out.println();

		// loop through again to show David was removed
		for (Map.Entry<String, String> nameZip : nameToZip.entrySet()) {
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		System.out.println();
		
		
		
		
		
		// create a map, put something it...
		Map<String, Integer> kidsNames = new HashMap<String, Integer> ();
		kidsNames.put("Timmy", 10);
		kidsNames.put("Sammy", 17);
		kidsNames.put("Kelly", 12);
		kidsNames.put("Josh", 11);
		kidsNames.put("Aiden", 1);
		
	
		
		//iterate through the map,  print out what inside (Before)
		Set<String> kidsKeys = kidsNames.keySet();
		
		for (String name : kidsKeys) {
			System.out.println(name + " is  " + kidsNames.get(name) + " years old (Before)");
			
			
			//iterate and add 1 to each vale in the map and put back in the map...
			int newAge = kidsNames.get(name) + 1;
			kidsNames.put(name, newAge);
			
			System.out.println(name + " is  " + kidsNames.get(name) + " years old (After)");
			
			
		}
		

		
		
		
		// how to convert a map to an Arraylist
		
		List<Integer> ageList = new ArrayList<Integer>();
		
		Set<String> setOfKeys = kidsNames.keySet();
		
		for (String key : setOfKeys) {
			Integer age = kidsNames.get(key);
			ageList.add(age);
			
			//  ageList.add(kidsName.get(key));
			
		}
		
		System.out.println(ageList);
		
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

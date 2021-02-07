package com.techelevator.homes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Inventory {
	
	
	// This hashmap contains our inventory of homes. We must protect it so it is private.
	// Only way to modify data is to go through the public methods below.
	private Map<String, Home> homeInventory;
	
	/**
	 * This constructor is called when the program loads (see HomeApp class). When inventory class is created
	 * it will load 'sample data'. Later in module 2, we will load data from a database. 
	 */
	public Inventory() {
		InventoryLoader loader = new InventoryLoader();
        homeInventory = loader.loadInventoryFromFile();
	}



	/**
	 * This method returns a list of all homes in the map
	 * @return
	 */
	public List<Home> retrieveListOfHomes() {
		
		List<Home> homeList = new ArrayList<Home>();
		
		Set<String> keys = homeInventory.keySet();
		
		for (String key : keys) {
			
			homeList.add(homeInventory.get(key));
			
		}

		
		return homeList;
	}
	
	/**
	 * This method takes a mls number and uses it to search the map.
	 * @param mlsNumber
	 * @returns found home, or null if not found
	 */
	public Home findHomeByMLSNumber(String mlsNumber) {
		return homeInventory.get(mlsNumber);
	}
	
	/**
	 * This method takes a home object and adds it to the map
	 * @param home
	 */
	public void addNewListing(Home home) { 
		homeInventory.put(home.getMlsNumber(), home);
	}
	
	
	
	

}

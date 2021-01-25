package com.techelevator.homes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Inventory {
	
	
	private Map<String, Home> homeInventory = new HashMap<String, Home>();
	
	
	public Inventory() {
		loadData();
	}



	//TODO: Go to the map and build a list from it
	public List<Home> retrieveListOfHomes() {
		
		List<Home> homeList = new ArrayList<Home>();
		
		Set<String> keys = homeInventory.keySet();
		
		for (String key : keys) {
			
			homeList.add(homeInventory.get(key));
			
		}

		
		return homeList;
	}
	
	//TODO: search map for mls and return the data
	public Home findHomeByMLSNumber(String mlsNumber) {
		return homeInventory.get(mlsNumber);
	}
	
	//TODO:  take home and add to our inventory map
	public void addNewListing(Home home) { 
		
	}
	
	
	private void loadData() {
		//create some populated home objects
		//int streetNumber, String streetName, String city, String state, int zipCode
		Address address = new Address(123, "North Drive", "Columbus", "OH", 43225);
		
		Home home1 = new Home();
		home1.setAddress(address);
		home1.setMlsNumber("123");
		home1.setNumberOfBathrooms(4.5);
		home1.setNumberOfBedrooms(4);
		home1.setPrice(10000.00);
		home1.setShortDescription("This house sits on top of an old graveyard.");
		
		homeInventory.put("123", home1);
		
		
		
		Address address1 = new Address(456, "Some Street", "Columbus", "OH", 43225);
		
		Home home2 = new Home();
		home2.setAddress(address1);
		home2.setMlsNumber("456");
		home2.setNumberOfBathrooms(4.5);
		home2.setNumberOfBedrooms(4);
		home2.setPrice(100.00);
		home2.setShortDescription("This house sits on top of nuclear waste disposal");
		
		homeInventory.put(home2.getMlsNumber(), home2);		
		
		
		
		
	}

	

}

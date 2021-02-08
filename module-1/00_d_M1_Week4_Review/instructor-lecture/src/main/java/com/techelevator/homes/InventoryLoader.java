package com.techelevator.homes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryLoader {
	
	
	public Map<String, Home> loadInventoryFromFile() {
		
		Map<String, Home> tempMap = new HashMap<String, Home> ();
		
		try (Scanner scanner = new Scanner(new File("inventory.txt"))) {
			
			
		
			while (scanner.hasNextLine()) {
				
				
			    // assign line to a string - record
				String record = scanner.nextLine();
				
				
			    // parse using split(,)
				String[] fields = record.split(",");
	
				Home home;
				
		    	Address address = new Address(Integer.parseInt(fields[1]), fields[2], fields[3], fields[4], Integer.parseInt(fields[5]));
			    // create a home object (and then set individual fields from the split[]
			    if (fields[10].equalsIgnoreCase("S")) {
			    	//single family home

			       home = new SingleFamilyHome(address, fields[0]);
			    
			    }
			    else {
			    	//rental home
			    	home = new RentalHome(address, fields[0], Integer.parseInt(fields[11]));
			    }
			    
			    home.setNumberOfBathrooms(Double.parseDouble(fields[7]));
			    home.setNumberOfBedrooms(Double.parseDouble(fields[6]));
			    home.setPrice(Double.parseDouble(fields[9]));
			    home.setShortDescription(fields[8]);
			
			    // put it in the map
			    tempMap.put(fields[0], home);
				
				
			}

			
		} catch (FileNotFoundException e) {		
			
			// 
			e.printStackTrace();
		}
		
		
		
		
		return tempMap;
	}

}

package com.techelevator.sample;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;




public class Inventory {
	
	// This hashmap contains our inventory of cateringItems. We must protect it so it is private.
		// Only way to modify data is to go through the public methods below.
		private Map<String, CateringItem> cateringInventory;
		
		/**
		 * This constructor is called when the program loads (see CateringSystemCLI class). When inventory class is created
		 * it will load 'sample data.
		 * @throws FileNotFoundException 
		 */
		public Inventory() throws FileNotFoundException {
			MyInventoryLoader loader = new MyInventoryLoader();
	        cateringInventory = loader.loadInventoryFromFile();
		}
		
		/**
		 * This method returns a list of all catering items in the map
		 * @return
		 */
		public List<CateringItem> retrieveListOfCateringItem() {
			
			List<CateringItem> cateringItemList = new ArrayList<CateringItem>();
			
			Set<String> keys = cateringInventory.keySet();
			
			for (String key : keys) {
				
				cateringItemList.add(cateringInventory.get(key));
				
			}

			
			return cateringItemList;
		}
		

	
		
		
		
		// MAP Inventory
		
		
		// new InventoryLoader
		
		
		// Load items to map
		
		
		// return items
		
		
		// search items with Product Code
		
		
	

}

package com.techelevator.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MyInventoryLoader {

	//The job of this class is to load inventory from file
	
	public Map <String, CateringItem>loadInventoryFromFile() throws FileNotFoundException{
		Map<String, CateringItem>CateringItemMap = new HashMap<String, CateringItem>();
		try(Scanner scanner = new Scanner(new File("cateringsystem.csv"))){
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] splitedValues = line.split(Pattern.quote("|"));
				if(splitedValues[3].equals("B")) {
					CateringItem cateringItem = new Beverage(splitedValues[1], Double.parseDouble(splitedValues[2]));
					CateringItemMap.put(splitedValues[0], cateringItem);
					
				} else if(splitedValues[3].equals("A")) {
					CateringItem cateringItem = new Appetizer(splitedValues[1], Double.parseDouble(splitedValues[2]));
					CateringItemMap.put(splitedValues[0], cateringItem);
					
				} else if(splitedValues[3].equals("D")) {
					CateringItem cateringItem = new Dessert(splitedValues[1], Double.parseDouble(splitedValues[2]));	
					CateringItemMap.put(splitedValues[0], cateringItem);

				} else if(splitedValues[3].equals("E")) {
					CateringItem cateringItem = new Entree(splitedValues[1], Double.parseDouble(splitedValues[2]));	
					CateringItemMap.put(splitedValues[0], cateringItem);
				}

				
			}
			
		}
		return CateringItemMap;
		
		
	}

}

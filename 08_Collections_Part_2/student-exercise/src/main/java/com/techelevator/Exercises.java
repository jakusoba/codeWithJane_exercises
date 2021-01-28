package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String, String>animalGroup = new HashMap<String, String>();
		animalGroup.put("Rhino", "Crash");
		animalGroup.put("Giraffe", "Tower");
		animalGroup.put("Crow", "Murder");
		animalGroup.put("Elephant", "Herd");
		animalGroup.put("Lion", "Pride");
		animalGroup.put("Pigeon", "Kit");
		animalGroup.put("Flamingo", "Pat");
		animalGroup.put("Deer", "Herd");
		animalGroup.put("Dog", "Pack");
		animalGroup.put("Crocodile", "Float");
;		if(!(animalGroup.containsKey(animalName.toUpperCase()))) {
			return "unknown";
        }	

	
		return animalGroup.get(animalName.toUpperCase());
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		itemNumber = itemNumber.toUpperCase();
		
		Map<String, Double> discountMap = new HashMap<String, Double>();
		itemNumber = itemNumber.toLowerCase();
		discountMap.put("bedroom3434", 0.60);
		discountMap.put("GARAGE1070", 0.15);
		discountMap.put("KITCHEN4001", 0.20);
		discountMap.put("LIVINGROOM", 0.10);
		discountMap.put("BATH0073", 0.15);
		discountMap.put("KITCHEN6073", 0.40);
		
		if (discountMap.containsKey(itemNumber))
			return discountMap.get(itemNumber);
		return 0.00;

		
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		if (peterMoney > 0 && paulMoney < 1000){

			paulMoney += (peterMoney / 2);
			peterMoney = (peterMoney / 2) + (peterMoney % 2);
			peterPaul.put("Paul", paulMoney);
			peterPaul.put("Peter", peterMoney);
		}
		return peterPaul;
		
		
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		int peterMoney = peterPaul.get("Peter");
		int paulMoney = peterPaul.get("Paul");
		if (peterMoney >= 5000 && paulMoney >= 10000) {
			peterPaul.put("PeterPaulPartnership", (peterMoney/4) + (paulMoney/4) );
			peterPaul.put("Peter", peterMoney - (peterMoney/4));
			peterPaul.put("Paul", paulMoney - (paulMoney/4));
		}
		return peterPaul;
		
		
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> newMap = new HashMap<String, String>();
		for (int i= 0; i < words.length; i++) {
			String word = words[i];
			newMap.put(word.substring(0, 1), word.substring(word.length() - 1, word.length()));
		}
		return newMap;
		
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> newMap = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if (newMap.containsKey(words[i])) {
				newMap.put(words[i], newMap.get(words[i]) + 1);
			} else {
				newMap.put(words[i], 1);
			}
			
		}
		return newMap;
		
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> newMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < ints.length; i++) {
			if (newMap.containsKey(ints[i])) {
				newMap.put(ints[i], newMap.get(ints[i]) + 1);
			} else {
				newMap.put(ints[i], 1);
			}
			
		}
		return newMap;
		
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> newMap = new HashMap<String, Boolean>();
		for (String word : words) {
			if (newMap.containsKey(word)) {
				newMap.put(word, true);
			} else {
				newMap.put(word, false);
			}
		}
		return newMap;
		
		
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		
		//Create the new map
		//Take each key in map 1 and compare it to each key in map 2
		//If the key matches, add the int value of map 2 to map 1
		//If unmatched, simply add the key and value to Map 1.
		//Create two sets to loop through each Maps.
		
		Map<String, Integer> superHouse = new HashMap<String, Integer>();
	
		superHouse.putAll(mainWarehouse);
		for (String key : remoteWarehouse.keySet()) {
			if (superHouse.containsKey(key)) {
				superHouse.put(key, superHouse.get(key) + remoteWarehouse.get(key));
			} else {
				superHouse.put(key, remoteWarehouse.get(key));
			}
		   
		}
		
		return superHouse;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "x x xx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hi xx hi": 1, "xa xx ax ax x": 1, "ax xx aa xx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> twoChar = new HashMap<String, Integer>();
	
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int count = -1;
			String last2 = word.substring(word.length()-2);
			
			for (int j = 1; j < word.length(); j++) {
				if (word.subSequence(j - 1 , j + 1).equals(last2)) {
					count += 1;
				
			}
			twoChar.put(word, count);
			}
			
		}
		return twoChar;
	}

}
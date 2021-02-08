package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTrackerRefactored {

	public static void main(String[] args) {
		
		StudentTrackerRefactored app = new StudentTrackerRefactored();
		
		//Ask the user to enter a series of names separated by commas
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter a series of names separated by a comma");
		String answer = myScanner.nextLine();
		
		String[] names = answer.split(",");
		
		
		
		
		//process the entrys into an arrayList
		
		List<String> instructors = app.convertArrayToList(names);

		
		//ask the user if they want to search for a name in the list
		System.out.println("Enter a name to search for: ");
		String searchString = myScanner.nextLine();
		
		
		if (instructors.contains(searchString)) {
			System.out.println("\n We found: " + searchString);
		}
		
	

	}
	
	
	private List<String> convertArrayToList(String[] names) {
		
		List<String> instructors = new ArrayList<String> ();
		for (String name : names) {
			instructors.add(name);
			System.out.print(name + " ");
		}
		
		return instructors;
		
		
	}

}

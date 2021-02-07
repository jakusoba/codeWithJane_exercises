package com.techelevator.homes;

import java.util.List;

public class HomeApp {

	public static void main(String[] args) {
		
	   
		Menu menu = new Menu();
		Inventory homeInventory = new Inventory();
		
		
		
		
		String choice = menu.printMainMenu();
		System.out.println("You chose: " + choice);

		if (choice.equals("1")) {
			// call home inventory list all homes method 
			System.out.println(" Fetching a list of homes ...");
			
			//call the inventory class
			List<Home> homes = homeInventory.retrieveListOfHomes();
			
			//send list to menu class to print
			menu.printListOfHomes(homes);
			
		}
		else if (choice.equals("2")) {
			//call home inventory search
			System.out.println(" searching for a homes ...");
			
			//call the menu to ask for a MLS Number..
			
			//take that MLS number and pass to inventory.
			Home home = homeInventory.findHomeByMLSNumber("value form user");
			
			
			//pass the home to the menu to print.
			
			
		}
		else if (choice.equals("3")) {
			// add a new home
			System.out.println(" Adding a new home ...");
		}
		else if (choice.equals("4")) {
			//exit the program
			System.out.println("Exiting the program.... Goodbye!");
			System.exit(1);
		}
		else {
			System.out.println("Nice try but not a valid options!");
		}
		
		
		
		
		// do fun stuff!
		

	}

}

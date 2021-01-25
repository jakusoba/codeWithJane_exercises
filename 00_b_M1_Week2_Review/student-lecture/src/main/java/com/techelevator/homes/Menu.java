package com.techelevator.homes;

import java.util.List;
import java.util.Scanner;


/**
 * The Menu class is responsible for printing a simple menu for our application 
 * and capturing user input.  This acts as the User Interface for our app.  
 * 
 * @author Java Green Rock Stars
 *
 */

public class Menu {

	private Scanner scanner;
	
	public Menu() {
		scanner = new Scanner(System.in);
	}
	
	/**
	 * This method prints the main menu to the console
	 * @return - User selected input (1, 2 or 3)
	 */
	
	public String printMainMenu()  {
		
		System.out.println("***************************");
		System.out.println("Java Green Realtor App 3000");
		System.out.println("***************************\n");
		
		System.out.println("1. List all homes");
		System.out.println("2. Search for a home by MLS Number");
		System.out.println("3. Add a new listing");
		System.out.println("4. Exit\n");
		
		System.out.println("Please select your choice (number only)");
		
		return scanner.nextLine();
		
		
	}
	
	
	/**
	 * This method prompts the user to enter a valid MLS Numbe and returns the user's input
	 * 
	 * @return String
	 */
	public String getMLSNumberFromUser() {
		
		System.out.println("\nPlease Enter A Valid MLS Number");
		return scanner.nextLine();
		
	}
	
	
	//TODO:  Write a method that prompts the user for input to add new home info
	//  
	//  Discussion:  How could we approach this?  
	//
	//   1.  What would be our method signature?
	//   2.  How could we capture and return the data
	
	
	
	public void printListOfHomes(List<Home> homesToPrint) {
		
		
		for (Home home : homesToPrint) {
			System.out.println("MLS Number: " + home.getMlsNumber() + " Price: $" + home.getPrice() + home.getAddress().getStreetName());
		}
		
		
	}
	
	
	
	
}

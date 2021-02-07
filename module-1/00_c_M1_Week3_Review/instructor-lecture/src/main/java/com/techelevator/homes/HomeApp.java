package com.techelevator.homes;

import java.util.List;

public class HomeApp {
	

	
	//TODO:  Add constants for user choices 

	
	// The main() should just create an instance of the class, and delegate to another method. In this case the run()
	public static void main(String[] args) {
		
         HomeApp app = new HomeApp();
         app.run();
	}
	
	
	// The run method is private. It provides the highest level of orchestration/control. 
	// In this case, It uses the Menu class to do UI stuff like print menu and user prompts and 
	// it uses the homeInventory class to handle the data side of things. 
	
	// The main method acts as a controller to 'control' the overall flow of the program.
    private void run() {	
    	
    	//we only want ONE instance of these.
    	Menu menu = new Menu();
    	Inventory homeInventory = new Inventory();
    	
    	//this is a boolean value to keep the program running unless user enters exit.
    	boolean running = true;
    	
        while (running) {
        	
        	
        	String choice = menu.printMainMenu();   //this method calls the menu class to print menu and get response

    		if (choice.equals("1")) {
    			
    			//call the inventory class
    			List<Home> homes = homeInventory.retrieveListOfHomes();
    			
    			//send list to menu class to print
    			menu.printListOfHomes(homes);
    			
    		}
    		else if (choice.equals("2")) {
    			
    			//call the menu to ask the user for a MLS Number..
    			String mls = menu.getMLSNumberFromUser();
    			
    			//take that MLS number and pass to home inventory class.
    			Home home = homeInventory.findHomeByMLSNumber(mls);
    			
    			//pass the home to the menu to print.
    			menu.printHome(home);
    			
    		}
    		else if (choice.equals("3")) {

    			//call the menu class to prompt user to enter home information
    			Home homeToAdd = menu.getHomeInfo();
    			
    			if (homeInventory.findHomeByMLSNumber(homeToAdd.getMlsNumber()) == null) {
    				//we did not find in inventory, so lets add it
    				
    				homeInventory.addNewListing(homeToAdd);
    				
    				
    			}
    			else {
    				//print home already added...
    				menu.printError("Home already exists in inventory");
    			}
    			

    		}
    		else if (choice.equals("4")) {
    			running = false;  // this allows us to exit the loop
    		}
    		else {
    			System.out.println("Nice try but not a valid options!");
    		}

        }  // end of main while loop
		
		//exit the program
		System.out.println("Exiting the program.... Goodbye!");
    	
    	
    }
	

}

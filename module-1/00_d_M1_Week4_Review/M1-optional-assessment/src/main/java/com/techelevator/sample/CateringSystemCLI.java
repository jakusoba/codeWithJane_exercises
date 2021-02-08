package com.techelevator.sample;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.techelevator.view.UserInterface;

public class CateringSystemCLI {

	private UserInterface UI = new UserInterface();
	private static final String Display_Catering_Items = "1";
	private static final String Order = "2";
	private static final String Quit = "3";
	
 

	public CateringSystemCLI(UserInterface ui) {
		this.UI= ui;
	}
	Scanner scanner = new Scanner(System.in);
	
	
	/**The main() should just create an instance of the class, and delegate to the run method
	 * @throws FileNotFoundException */
	public static void main(String[] args) throws FileNotFoundException {
		Inventory inventory = new Inventory();
		UserInterface menu = new UserInterface();
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	}	

	
	/**The main method acts as a controller to 'control' the overall flow of the program.*/
	private void run() throws FileNotFoundException {
		Inventory inventory = new Inventory();
		
		
		/**This is a boolean value to keep the program running unless user enters exit.*/
    	boolean isRunning = true;
    	
        while (isRunning) {
        	
        	/**This method calls the menu class to print menu and get response.*/
        	String userChoice = UI.printMainMenu();  
        	if(userChoice.equals(Display_Catering_Items )) {
        		/**Call the inventory class and get list of Catering items.*/
        		List<CateringItem>cateringItems = inventory.retrieveListOfCateringItem();
        		//send list to menu class to print
    			UI.printListOfCateringItems(cateringItems);
    			
        		
        	}
        	
        	else if(userChoice.equals(Order )) {
        		/**Calls the subMenu.*/
        		subMenu();
        		
    			
        		
        	}
        	
        	else if(userChoice.equals(Quit )) {
        		/**Close the program.*/
        		isRunning = false;
        		System.out.println("Exiting program....");	
        		System.exit(0);
        		
    			
        		
        	}
        
		
			else {
				System.out.println("Please select a valid option!");
			}    		
	
        }
        
	} 
	
	 private void subMenu() throws FileNotFoundException {
		 Inventory inventory = new Inventory();
		 Account account = new Account();
	    	
	    	
			boolean Looping = true;
			
	    	while (Looping) {
	    				
	    		String subMenuOption = UI.printPurchasingsubMenu();
	    				
	    		if (subMenuOption.equalsIgnoreCase("1")) {
	    				System.out.println("You chose add money, please enter the amount you will like to add.");	
	    				Double credit = Double.parseDouble(scanner.nextLine());
	    				account.addMoney(credit);
	    				
	    		}
	    		else if (subMenuOption.equalsIgnoreCase("2")) {
	    			System.out.println("You chose select products");
	    			
	    			while (scanner.hasNextLine()) {
	    				List<CateringItem>cateringItems = inventory.retrieveListOfCateringItem();
	    				UI.printListOfCateringItems(cateringItems);
	    				System.out.println("Please enter the item you will like to purchase separated by a comma if purchasing multiple items.");
	    				String line = scanner.nextLine();
	    				String[] itemsToPurchase = line.split(Pattern.quote(","));
	    				//Cart.purchase(itemsToPurchase);
	    		
	    			}
	    		}
	    		else if (subMenuOption.equalsIgnoreCase("3")){
	    			System.out.println("Complete transaction");	
	    			
	    		}
	    		else {
	    			System.out.println("Returning to main menu.");	
	    			Looping = false;
	    		}
	    				
	    } 	
	    	
	    	
 	
 }
 
	     
	
	



}

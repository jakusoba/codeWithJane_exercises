package com.techelevator;

import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		
		//create a new Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		boolean notThere = true;
		
		while (notThere) {
			//we have not arrived yet
			
			System.out.print("Are We There Yet? Enter (Y)es or (N)o\n");
			String answer = scanner.nextLine();
			
			
			// If they answer yes, set notThere to false
			if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("y")) {
				notThere = false;
				System.out.println("Cowabunga!");
			}
			else {
				System.out.println("Eat My Shorts!");
			}
			

			
		}
		
		
		System.out.println("Exit");
		
		
		

		
		
	

	}

}

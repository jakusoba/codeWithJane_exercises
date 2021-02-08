package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/*The Fibonacci numbers are the integers in the following sequence:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.

Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

Please enter the Fibonacci number: 25

0, 1, 1, 2, 3, 5, 8, 13, 21**/
		
			
			Scanner scanner = new Scanner(System.in); 
			
			String input;
			int stopNumber;
			
			System.out.println("Please enter the Fibonacci number: ");
			input = scanner.nextLine();
			stopNumber = Integer.parseInt(input);
			
			int fibonacci;
			int firstNum = 0;
			int secondNum = 1;
			
		
			
				for (int i = 0; i <= stopNumber; i++) { 
					if(stopNumber <= firstNum) {						
						break;
					}
					System.out.print(firstNum + " ");  
					fibonacci = firstNum + secondNum;
					firstNum = secondNum;  
					secondNum = fibonacci; 
				}
				

	}

}

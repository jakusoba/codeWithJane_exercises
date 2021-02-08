package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		/*The Fahrenheit to Celsius conversion formula is:

			Tc = (Tf - 32) / 1.8
			where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit.

			The Celsius to Fahrenheit conversion formula is:

			Tf = Tc * 1.8 + 32 **/
		Scanner scanner = new Scanner(System.in);
		
		Double initialTemp;
		Double convertedTemp;
		
		String userInput;
		String degreesIn;
		
		System.out.println("Hey there! Please enter the temperature: ");
		userInput = scanner.nextLine();
		initialTemp = Double.parseDouble(userInput);
		
		System.out.println("What degrees is the temperature in? [C]elsius or [F]ahrenheit");
		degreesIn = scanner.nextLine();
		
		if(degreesIn.equalsIgnoreCase("c")) {
				convertedTemp = initialTemp * 1.8 + 32;
				System.out.printf("%.1f C is %.1f F", initialTemp, convertedTemp);
		}	
		else {
			convertedTemp = (initialTemp - 32) /1.8;
			System.out.printf("%.1f F is %.1f C", initialTemp, convertedTemp);
		}
		
		

	}

}

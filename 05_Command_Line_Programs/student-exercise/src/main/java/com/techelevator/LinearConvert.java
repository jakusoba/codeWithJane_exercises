package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		/*The foot to meter conversion formula is:

			m = f * 0.3048
			The meter to foot conversion formula is:

			f = m * 3.2808399**/
		
		Scanner scanner = new Scanner(System.in);
		String userInput;
		double length;
		double convertedLength;
		System.out.println("Hey there! Please enter length: ");
		userInput = scanner.nextLine();
		length = Double.parseDouble(userInput);
		
		
		String unitOfLength;
		
		System.out.println("Is the measurement in (m)eter, or (f)eet? ");
		unitOfLength = scanner.nextLine();
		
		if(unitOfLength.equalsIgnoreCase("m")) {
			convertedLength = length * 3.2808399;
			System.out.printf("%.2f m is %.2f ft", length, convertedLength);
		}
		else {
			convertedLength = length * 0.3048;
			System.out.printf("%.2f ft is %.2f m", length, convertedLength);
		}
		
		


	}

}

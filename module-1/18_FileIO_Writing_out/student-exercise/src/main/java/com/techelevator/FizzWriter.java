package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {


	public static void main(String[] args) throws IOException {

		String result = "";
		for(int i = 1; i <= 300; i++) {
			result += fizzWriter(i) + " ";
		}
		System.out.println(result);  
		
		File newFile = new File("FizzBuzz.txt"); //Create file object.
		
		newFile.createNewFile(); //Create file
		
		try ( PrintWriter writer = new PrintWriter(newFile)){
			writer.println(result);
			
		} catch (FileNotFoundException ex) {
			
			ex.printStackTrace();
		}
		
		
		System.out.println("Written results to file.");
		
		
		
		
	}
	
	public static String fizzWriter(int number) {
		
		
		//String numToString = new Integer(number).toString();
		String numToString  = String.valueOf(number);
		
		if(number >= 1 && number <= 300) {
			if(number % 3 == 0 && number % 5 == 0) {
				return "FizzBuzz";
			}
			else {
				if(numToString.contains("3")) {
					if(numToString.contains("5")) {
						return "FizzBuzz";
				}
				
				return "Fizz";
		
			}
			 if(numToString.contains("5")) {
				 if(numToString.contains("3")) {
					 return "FizzBuzz";
				 }
				 return "Buzz";
			
			}
			else {
						if(number % 3 == 0)  {
							return "Fizz";
						}
						if(number % 5 == 0) {
							return "Buzz";
					
						}
					
					return numToString;
					}
			
			}
		}
	
			
		return "";
		
		
	}
	


	
	
	

} 

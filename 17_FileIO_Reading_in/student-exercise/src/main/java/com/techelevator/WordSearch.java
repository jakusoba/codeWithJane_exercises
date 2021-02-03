package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	
	
	

	public static void main(String[] args) {
		File searchFile = getUserFile();
		int lineNum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the search string.");
		String searchString = scanner.nextLine();
		System.out.println("Should the search be case sensitive? (Y\\N).");
		String caseChoice = scanner.nextLine();
		
		try {
			
			Scanner myScanner = new Scanner(searchFile);
			
			while(myScanner.hasNextLine()) {
				String line = myScanner.nextLine();
				String lineWithoutPunc = line.replaceAll("\\p{P}", "");
				String [] wordsInFile = line.split(" ");
				lineNum++;
				for(String word: wordsInFile) {
					if(caseChoice.contains("y")) {
						if(word.equals(searchString)) {
							System.out.println(lineNum + " : " + line  );
						}
						
					}
					else if(word.equalsIgnoreCase(searchString)){
						System.out.println(lineNum + " : " + line  );
						
						
					}
				}
			}		
				
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}	
		

	}
	private static File getUserFile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter filePath");
		String userFilePath = scanner.nextLine();
		File userFile = new File(userFilePath);
		if (!(userFile.exists())) {
			System.out.println("The file does not exist.");
			System.exit(1);
		}
		else if(!(userFile.isFile())) {
				System.out.println("Please enter a valid file");
				System.exit(1);
		}
		return userFile;
		
			
		}
			
		
		
	


}

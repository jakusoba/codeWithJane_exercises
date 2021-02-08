package com.techelevator.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionExample example = new ExceptionExample();
		

			try {
				// Ask the user to enter a file name 
				Scanner in = new Scanner(System.in);
				
				System.out.println("Enter the name of your student file: ");
				String fileName = in.nextLine();
				
				
				File file = new File(fileName);
				
	
				List<Student> names = example.getListOfStudents(file);
				
				//print out names list
				
//				for (String name : names) {
//					System.out.println(name);
//				}
				
				
			} 
			catch (FileNotFoundException ex)  {
				ex.printStackTrace();
			}
	

		
		System.out.println("I'm done.");
		

	}
	
	/**
	 * Create a method that gets a file name from a user and reads through it and populates a List
	 * @param studentFile
	 * @return
	 * @throws FileNotFoundException
	 */
	private List<Student> getListOfStudents(File studentFile) throws FileNotFoundException  {
		
		List<Student> studentList = new ArrayList<Student>();
		
		try (Scanner fileScanner = new Scanner(studentFile)) {
			//pull data from file and stick in studentList arrayList
			while (fileScanner.hasNextLine()) {
				
				String record = fileScanner.nextLine();
				String[] fields = record.split(",");
				
				Student student = new Student();
				student.setId(Integer.parseInt(fields[0]));
				
				student.setFirst(fields[1]);
				student.setSection(fields[2]);
				student.setAnimal(fields[3]);
				
				studentList.add(student);
				
			}
			
			
		}
		catch (Exception e) {
		    e.printStackTrace();	
		}
		

		
		return studentList;
		
	}

}

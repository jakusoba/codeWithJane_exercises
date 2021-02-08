package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class StudentTracker {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		
		List<String> students = new ArrayList<String> ();
		
		System.out.println(students.size());
		students.add("Zainab");
		students.add("Vic");
		students.add("Jon");
		students.add("Kelsey");
		students.add("Kelsey");
		students.add("Vic");
		
		//System.out.println(students);
		System.out.println(students.size());
		
		//convert an ArrayList to a normal array
		String[] names = students.toArray(new String[students.size()]);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println(students.get(2));
		
		students.remove(2);
	
		//System.out.println(students);
		
		
		//traditional for loop
		for (int i = 0; i < students.size(); i++ ) {
			System.out.println(students.get(i));
		}
		
		// for-each loop (enhanced for loop)
		// for each student in students
		for (String student : students) {
			
			if (student.equals("Vic")) {
				System.out.println("We found Vic!");
				break;
			}
			System.out.println(student);
		}
		
		
		
		
		if (students.contains("Vic")) {
			System.out.println("We found Vic!");
		}
		
	  int indexOfZainab = students.indexOf("Zainab");

	}

}

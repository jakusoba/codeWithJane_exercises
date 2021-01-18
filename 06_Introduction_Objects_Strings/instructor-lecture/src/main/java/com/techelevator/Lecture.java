package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		String greeting = "Hello, World!"; // creates a new instance of String using a literal
		
		System.out.println(greeting.length());
		
			
		
		System.out.println("greeting : " + greeting);

		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		/* Below are examples of calling various String methods */

		System.out.println("***** charAt *****");

		String name = null;
		
		
		if (name == null) {
			
			name = "Brian";
			char first = name.charAt(0); // 'B'
			char fourth = name.charAt(3); // 'a'
			char middle = name.charAt(name.length() - 2);
			
			System.out.println(name);
			System.out.println(first);
			System.out.println(fourth);			
		}

		


		System.out.println("***** contains *****");
		String hello = "Hello World!";
		System.out.println("hello : " + hello);
		
	
		
		//boolean containsHello = hello.contains("Hello");
		
		String newHello = hello.toLowerCase();
		
		if (newHello.contains("world") || newHello.contains("hello")) {
			
		   System.out.println("World or Hello was found!");	
		}
		else {
			 System.out.println("Not found!");	
		}
		
		
	
		
		System.out.println("containsHello : " + newHello);
		boolean containsBogus = hello.contains("bogus");
		System.out.println("containsBogus : " + containsBogus);

		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */
		
		
		// if (name.compareTo(anotherString) == 0);  -> They have the same value
		
		if (name.endsWith("ian")) {
			//do something
		}
		
		if (name.startsWith("Br")) {
			
		}
		
		if (name.isEmpty()) {
		   // go ask user for their name	
		}
		//Brian
		
		int foundIndex = name.indexOf("ia");
		
		
	    name =  name.replace("i", "y");     // *******
	    
	    String course = "Advanced Chemistry";
	    
	    String chemistry = course.substring(9);  // beginning index to end of string
	    System.out.println(chemistry);
	    
	    String firstThree = course.substring(0, 3);  // beginning index, ending index -1
	    System.out.println(firstThree);
	    char[] newCharArray = name.toCharArray();
	    
	 

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */

		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}

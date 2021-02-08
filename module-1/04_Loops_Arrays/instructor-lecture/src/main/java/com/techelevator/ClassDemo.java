package com.techelevator;

public class ClassDemo {

	public static void main(String[] args) {
		
		
		int numberOfStudents = 200;
	
		
		//Know how to declare and array
		//Know how to instantiate and array
		
		String[] names = new String[10];
		int[] scores = new int[] {2, 5, 6, 7, 8, 10, 12, 15};
		long[] averages = new long[20];
		byte[] bytes = new byte[25];
		String[] courses = new String[100];
        String[] studentNames = new String[numberOfStudents];

		
		
		//know how to put things into and array
		names[0] = "Steve";
		names[1] = "Traci";
		names[2] = "Kanye";
		names[3] = "Kevin";
		names[4] = "The other Kevin";
		names[7] = "Hambone";
		names[8] = "Ham Radio";
		
		
		//know how to get access to things inside the array
		
		String kanye = names[2];
		
		String hamBone = names[7];
		
		String firstElement = names[0];
		
		
		//know how to get the length of an array
		System.out.println(names[2]);
		System.out.println(names.length);
		
		
		String lastElement = names[8];   // if I know size = 10  (because of zero based indexing)
	
		String lastElement2 = studentNames[numberOfStudents - 1];  //option 1
		System.out.println(lastElement);
		String lastElement3 = studentNames[studentNames.length - 1];  // option 2
		
		
		names[7] = "Hamburgers";
		names[names.length - 1] = names[7];
		
		
		
		//nfl teams
		
		String[] nflTeams = new String[50];
		
		nflTeams[7] = "Bengals";
		nflTeams[22] = "Steelers";
		
		String steelers =  nflTeams[22];
        System.out.println(steelers);
	
		nflTeams[22] = null;
		
		
		
		//increment operators
		
		int i = 5;
		System.out.println(i);
		
		System.out.println(++i);
		
		System.out.println(i++);
		
		
		if (i < 5) {
			System.out.println(i);
			int x = 1;
			if (x == 1) {
				int y = 6;
			}
			
		}
		
		System.out.println(i);
		
		
		int counter = 100;
		
		while (counter > 0) {
			
			
			if (counter % 2 == 0) {
				System.out.println("Number is even: " + counter);
			}
			
			
//			if (counter == 50) {
//				break;
//			}
			counter--;
			
		}
		
		
		
		// for loop looping 100 times forward from beginning
		
		for (int j = 0; j<100; j++) {
			System.out.println(j);
		}
		
		for (int j = 0; j< names.length; j++) {
			
			if (names[j] != null) {
				System.out.println(names[j]);
			}
			
		}
		
		
		// {2, 5, 6, 7, 8, 10, 12, 15};
		for (int j = 0; j < scores.length; j++) {
			
			//test to see if scores is divisible by 5
            if (scores[j] % 5 == 0) {
            	System.out.println(scores[j]);
            }
            else {
            	System.out.println("not divisible by 5");
            }
			
			
		}
		
		// {2, 5, 6, 7,, 1 8, 12, 15};
		for (int j = scores.length - 1; j >= 0; j-- ) {
			System.out.println(scores[j]);
		}
		


	}

}

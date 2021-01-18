package com.techelevator;

public class Quiz {

	public static void main(String[] args) {
		

		// #2 - What value is displayed by this program?
		

       int answer = 0;
       for(int i = 0; i < 10; i++) {
           if(i % 2 == 0) {
               answer = answer + i;
           }
       }

       System.out.println(answer);

       
       // #3 - What value does the preceding fragment display?

       int sum = 0;

       for(int i = 5; i > 0; i --) {

           sum += i;

       }

       System.out.println(sum);

       
       // #5  What is the printed output of the preceding code?
       
       for(int i = 0; i < 5; i++) {

           int sum1 = 0;

           sum1 += i;

           System.out.print(sum1 + " ");

      }

      //  #6  What is the value of the result after this code executes:  
       
       int[] numbers = new int[5];

       for(int ix = 0; ix < numbers.length; ix++) {

           numbers[ix] = ix * 2;

       }

       int result = numbers[3];       
		
		
		
		
	}

}

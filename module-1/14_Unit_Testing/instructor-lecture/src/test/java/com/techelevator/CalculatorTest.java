package com.techelevator;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class CalculatorTest {
	
	Calculator calc;
	
	
	@Before
	public void setup() {
		calc = new Calculator();
		
		System.out.println("Before");
	}
	
	
	@Test
	public void simpleTestOfNothing() {
		
		Assert.assertEquals(true, true);
		Assert.assertEquals("The total amount should be: ", 12.0, 12.0, 1);
		
		
	}
	
	/*
	 	//add b and a together 
		public int add (int a, int b) {
			return a + b;
		}
	 */
	@Test
	public void test_adding_two_positive_ints() {
		
		//Act  and Assert
		Assert.assertEquals("Comparing two int values: ", 2, calc.add(1, 1));
		Assert.assertEquals("Comparing two int values: ", 0, calc.add(0, 0));

	}
	
	@Test
	public void test_adding_two_negative_ints() {
		
		//Act  and Assert
		Assert.assertEquals("Comparing two int values: ", -3, calc.add(-2, -1));

	}
	
	@Test
	public void test_adding_one_negative_one_positive_ints() {
		
		//Act  and Assert
		Assert.assertEquals("Comparing two int values: ", -1, calc.add(-2, 1));

	}
	
	
	@Test 
	public void test_even_divisible() {
		//Act and Assert
		
		
		Assert.assertEquals("checking mod of (main / div ): ", 0, calc.mod(2, 2));
		Assert.assertEquals("checking mod of (main / div ): ", 1, calc.mod(3, 2));
		Assert.assertEquals("checking mod of (main / div ): ", 0, calc.mod(0, 2));
		
	}
	
	@Test 
	public void test_not_even_divisible() {
		//Act and Assert
		

		Assert.assertEquals("checking mod of (main / div ): ", 1, calc.mod(3, 2));
		Assert.assertEquals("checking mod of (main / div ): ", 2, calc.mod(5, 3));

		
	}
	
	@Test
	public void testWrappedObject() {
		
		//Arrange
		WrappedNumbers wn1 = new WrappedNumbers(1,2);
		WrappedNumbers wn2 = new WrappedNumbers(2,4);
		
		//Act
		Result rs = calc.add(wn1);
		
		
		//Assert
		Assert.assertEquals("checking wrapped number addition: ", 3, rs.getResult());
		Assert.assertEquals("checking wrapped number addition: ", 6, calc.add(wn2).getResult());
		
	}
	
	@Test
	public void testCalculatorForNull() {
		
		Assert.assertNull("Testing for null response", calc.returnNull());
		boolean isInitialized = true;
		
		if (isInitialized) {
			//do my asserts
		}
		else {
			Assert.fail();
		}
		
	}
	

}

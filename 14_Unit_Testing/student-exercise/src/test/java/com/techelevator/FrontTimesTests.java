package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrontTimesTests {
	FrontTimes frontTimes = new FrontTimes();
	
	@Test
	public void frontTimesTest() {
		assertEquals("InputParameter: frontTimes(Jo, 2)", "JoJo", frontTimes.generateString("Jo", 2));
		assertEquals("InputParameter: frontTimes(Jon, 3)", "JonJonJon", frontTimes.generateString("Jon", 3));
		assertEquals("InputParameter: frontTimes(Jennifer, 1)", "Jen", frontTimes.generateString("Jennifer", 1));
		assertEquals("InputParameter: frontTimes(J, 2)", "JJ", frontTimes.generateString("J", 2));
		assertEquals("InputParameter: frontTimes(John, 0)", "", frontTimes.generateString("John", 0));
		assertEquals("InputParameter: frontTimes(Jay, 6)", "JayJayJayJayJayJay", frontTimes.generateString("Jay", 6));
		
		
		
		
		
	}
	
	

}

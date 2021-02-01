package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Less20Tests {
	Less20 less20 = new Less20();
	
	@Test
	public void less20Test() {
		assertEquals("InputParameter: less20(18)", true, less20.isLessThanMultipleOf20(18));
		assertEquals("InputParameter: less20(20)", false, less20.isLessThanMultipleOf20(20));
		assertEquals("InputParameter: less20(38)", true, less20.isLessThanMultipleOf20(38));
		assertEquals("InputParameter:less20(59)", true, less20.isLessThanMultipleOf20(59));
		assertEquals("InputParameter: less20(40)", false, less20.isLessThanMultipleOf20(40));
		assertEquals("InputParameter: less20(39)", true, less20.isLessThanMultipleOf20(39));
		assertEquals("InputParameter: less20(60)", false, less20.isLessThanMultipleOf20(60));
		
		
	}

}

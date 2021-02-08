package com.techelevator;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SameFirstLastTests {
	SameFirstLast sameFirstLast = new SameFirstLast();
	
	@Test
	public void sameFirstLast() {
		assertEquals("InputParameters: isItTheSame(new int[]{1, 2, 3})", false,
				sameFirstLast.isItTheSame(new int[] { 1, 2, 3 }));
		assertEquals("InputParameters: isItTheSame(new int[]{1})", true,
				sameFirstLast.isItTheSame(new int[] { 1 }));
		assertEquals("InputParameters: isItTheSame(new int[]{1, 2, 1})", true,
				sameFirstLast.isItTheSame(new int[] { 1, 2, 1 }));
		assertEquals("InputParameters: isItTheSame(new int[]{3, 3, 3})", true,
				sameFirstLast.isItTheSame(new int[] { 3, 3, 3 }));
		assertEquals("InputParameters: isItTheSame(new int[]{-11, 2, -11})", true,
				sameFirstLast.isItTheSame(new int[] { -11, 2, -11 }));
		
	}
	
	

}

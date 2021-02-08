package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lucky13Tests {
	Lucky13 lucky13 = new Lucky13();
	
	@Test
	public void lucky13() {
		assertEquals("InputParameters: getLucky(new int[] { 0, 2, 4 })", true, lucky13.getLucky(new int[] { 0, 2, 4 }));
		assertEquals("InputParameters: getLucky(new int[] { 0, 0, 0 })", true, lucky13.getLucky(new int[] { 0, 0, 0 }));
		assertEquals("InputParameters: getLucky(new int[] { 1, 0, 1 })", false, lucky13.getLucky(new int[] { 1, 0, 1 }));
		assertEquals("InputParameters: getLucky(new int[] { 1, 3, 3 })", false, lucky13.getLucky(new int[] { 1, 3, 3 }));
		assertEquals("InputParameters: getLucky(new int[] { 6, 9, 0 })", true, lucky13.getLucky(new int[] { 6, 9, 0 }));
		assertEquals("InputParameters: getLucky(new int[] { 1, 9, 0 })", false, lucky13.getLucky(new int[] { 1, 9, 0 }));
	
	}
		
}

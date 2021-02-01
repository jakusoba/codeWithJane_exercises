package com.techelevator;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MaxEnd3Tests {
	MaxEnd3 maxEnd3 = new MaxEnd3();
	
	@Test
	public void maxEnd3() {
		assertArrayEquals("InputParameters: maxEnd3(new int[]{1, 2, 3})", new int[] { 3, 3, 3 },
				maxEnd3.makeArray(new int[] { 1, 2, 3 }));
		assertArrayEquals("InputParameters: maxEnd3(new int[]{11, 0, 23})", new int[] { 23, 23, 23 },
				maxEnd3.makeArray(new int[] { 23, 23, 23 }));
		assertArrayEquals("InputParameters: maxEnd3(new int[]{-1, 0, -3})", new int[] { -1, -1, -1 },
				maxEnd3.makeArray(new int[] { -1, 0, -3 }));
		
	}

}

package com.techelevator;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NonStartTests {
	NonStart nonStart = new NonStart();
	
	@Test
	public void nonStart() {
		assertEquals("InputParameters: getPartialString(Tiffany, Hu)", "iffanyu", nonStart.getPartialString("Tiffany", "Hu"));
		assertEquals("InputParameters: getPartialString(Jay, T)", "ay", nonStart.getPartialString("Jay", "T"));
		assertEquals("InputParameters: getPartialString(J, T)", "", nonStart.getPartialString("J", "T"));
		assertEquals("InputParameters: getPartialString(Paul, Xin)", "aulin", nonStart.getPartialString("Paul", "Xin"));
		assertEquals("InputParameters: getPartialString(mCollen, Tim)", "Collenim", nonStart.getPartialString("mCollen", "Tim"));
	}
	

}

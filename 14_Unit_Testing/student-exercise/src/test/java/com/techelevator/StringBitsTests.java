package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBitsTests {
	StringBits stringBits = new StringBits();
	
	@Test
	public void stringBits() {
		assertEquals("InputParameters: stringBits(James)", "Jms", stringBits.getBits("James"));
		assertEquals("InputParameters: stringBits(Hey)", "Hy", stringBits.getBits("Hey"));
		assertEquals("InputParameters: stringBits(Pa)", "P", stringBits.getBits("Pa"));
		assertEquals("InputParameters: stringBits(P)", "P", stringBits.getBits("P"));
		assertEquals("InputParameters: stringBits(Website)", "Wbie", stringBits.getBits("Website"));
		
	}
	
	
	

}

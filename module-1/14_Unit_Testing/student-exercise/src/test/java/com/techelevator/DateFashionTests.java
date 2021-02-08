package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateFashionTests {
	DateFashion dateFashion = new DateFashion();
	
	@Test
	public void dateFashionTests() {
		assertEquals("InputParameter: dateFashion(5, 10)", 2, dateFashion.getATable(5, 10));
		assertEquals("InputParameter: dateFashion(2, 5)", 0, dateFashion.getATable(2, 5));
		assertEquals("InputParameter: dateFashion(8, 7)", 2, dateFashion.getATable(8, 7));
		assertEquals("InputParameter: dateFashion(1, 10)", 0, dateFashion.getATable(1, 10));
		assertEquals("InputParameter: dateFashion(5, 5)", 1, dateFashion.getATable(5, 5));
		assertEquals("InputParameter: dateFashion(1, 1)", 0, dateFashion.getATable(1, 1));
		assertEquals("InputParameter: dateFashion(10, 10)", 2, dateFashion.getATable(10, 10));
		
		
	}
	

}

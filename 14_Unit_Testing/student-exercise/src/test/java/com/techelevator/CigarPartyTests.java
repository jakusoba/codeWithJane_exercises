package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CigarPartyTests {
	CigarParty cigarParty = new CigarParty();
	
	@Test
	public void cigarPartyTests() {
		assertEquals("InputParameters: cigarParty(20, false)", false, cigarParty.haveParty(20, false));
		assertEquals("InputParameters: cigarParty(50, false)", true, cigarParty.haveParty(50, false));
		assertEquals("InputParameters: cigarParty(80, true)", true, cigarParty.haveParty(80, true));
		assertEquals("InputParameters: cigarParty(80, true)", true, cigarParty.haveParty(80, true));
		assertEquals("InputParameters: cigarParty(40, true)", true, cigarParty.haveParty(40, true));
		assertEquals("InputParameters: cigarParty(50, true)", true, cigarParty.haveParty(50, true));
		assertEquals("InputParameters: cigarParty(50, false)", true, cigarParty.haveParty(50, false));
		assertEquals("InputParameters: cigarParty(60, false)", true, cigarParty.haveParty(60, false));
		
		
	}
	

}

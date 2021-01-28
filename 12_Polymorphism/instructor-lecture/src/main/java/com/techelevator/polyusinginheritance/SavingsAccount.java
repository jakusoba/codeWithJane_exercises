package com.techelevator.polyusinginheritance;

public class SavingsAccount extends Account {
	
	
	public int deposit(int depositAmount) {

		 int updatedAmount = depositAmount + 10;
		 
	     return super.deposit(updatedAmount);
	
	}

	
	
}

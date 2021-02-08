package com.techelevator.polyusinginterfaces;

public interface IAccount {
	
	int deposit(int depositAmount);
	int withdraw(int withdrawAmount);
	boolean transfer(int amount, String toAccount, String fromAccount);
	
	

}

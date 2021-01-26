package com.techelevator.polyusinginheritance;

public class Account {
	
	private String accountNumber;
	private int balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public int deposit(int depositAmount) {
		this.balance += depositAmount;
		return this.balance;
	}

	public int getBalance() {
		return balance;
	}
	
	

}

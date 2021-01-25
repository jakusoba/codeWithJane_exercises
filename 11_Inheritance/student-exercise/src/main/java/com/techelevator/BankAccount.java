package com.techelevator;

public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public int getBalance() {
		return balance;
	}

	public int deposit(int amountToDeposit) {
		balance += amountToDeposit;
		return balance;
		//Adds `amountToDeposit` to the current balance, and returns the new balance of the bank account.         |
	}
	
	public int withdraw(int amountToWithdraw) {
		//Subtracts `amountToWithdraw` from the current balance, and returns the new balance of the bank account. |
		balance -= amountToWithdraw;
		return balance;

	}
	
	
	
	

}

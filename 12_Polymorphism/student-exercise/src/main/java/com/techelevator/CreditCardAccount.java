package com.techelevator;

public class CreditCardAccount implements Accountable {
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	public CreditCardAccount(String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		
		
	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method 
		return 0;
	}

	public String getAccountHolder() {
		return accountHolder;
	}
	
	public int getdebt() {
		return 0;
	}
	

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int pay(int amountToPay) {
		return debt -= amountToPay;
	}
	
	public int charge(int amountToCharge) {
		return debt += amountToCharge;
	}

	
	
	

}

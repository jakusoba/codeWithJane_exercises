package com.techelevator.homes;

import java.math.BigDecimal;

public class BankAccount {
	
	/*
	 * These are member variables. They are private so we can protect them 
	 * from others outside this class.  The only wway we want these changed is 
	 * through a setter/constructor.  The business problem we are trying to solve
	 * will dictate when/if we change them
	 * 
	 */
	private String accountType;
	private String accountNumber;
	private double balance;
	private String ownerFirstName;
	private String lastName;

	
	
	
	
	
	
	
	/**
	 * This is a method that will update the balance and return the new, updated
	 * updated balance.
	 * @param depositAmount
	 * @return - Updated balanmce
	 */
	public double depositMoney(double depositAmount) {
		
		
		this.balance = this.balance + depositAmount;
		
		return this.balance;
		
	}
	
	/**
	 * This is a method that will update the balance and return the new, updated 
	 * balance. This method has the same name and return type as the previous depositMoney
	 * method therefore this is an overloaded method. (Example of Overloading)
	 * @param depositAmount
	 * @param date
	 * @return
	 */
	public double depositMoney(BigDecimal depositAmount, String date) {
		return 0.0;
	}
	
	
	
	
   /*
    * The getFullName is a DERIVED method. This means we do not need
    * and instance (member) variable. We can 'derive' the value using
    * other member variables.
    */

	public String getFullName() {
		return ownerFirstName + " " + lastName;
	}

	
	
	/*
	 * The rest of these methods are getters and setters. If we do not want
	 * another class to update data, we remove a setter. If we do not want
	 * another class to see data, we remove the setter.
	 */

	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public String getOwnerFirstName() {
		return ownerFirstName;
	}


	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	
	
	
	

	
	

	
	

	
	
	
	
	
	

}

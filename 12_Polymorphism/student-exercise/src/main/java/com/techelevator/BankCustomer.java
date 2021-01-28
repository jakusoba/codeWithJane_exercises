package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
	private String name;
	private String phoneNumber;
	private String address;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	
	
	
	
	
	@Override
	public int getBalance() {
		// TODO Auto-generated method 
		return 0;
	}
	
	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Accountable> getaccounts() {
		return accounts;
	}
	
	

}

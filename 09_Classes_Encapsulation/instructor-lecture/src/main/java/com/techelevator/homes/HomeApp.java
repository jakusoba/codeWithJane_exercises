package com.techelevator.homes;

public class HomeApp {

	public static void main(String[] args) {
	
		
		Home home = new Home();   // turning a Home class into an object
		
		//using some of our setters to set values on the home object
		home.setAcreage(10);

		home.setGarageSize(2.5);
		home.setHasBasement(true);
		home.setNeighborhoodName("Villages At Alum CReek");
		
		System.out.println("Home 1: " + home.getAcreage());

		home.setPrice(30000.00);
		
		//creating a new home object and setting values
		Home home2 = new Home();  // creating another instance
		home2.setAcreage(5);
		home2.setActiveListing(true);
		home2.setNumberOfBathrooms(11.5);
		
		System.out.println("Home 2: " + home2.getAcreage());
		
		// creating new home objects using the other constructor
		Home home3 = new Home("DEF123", 120000);
		Home home4 = new Home("JHGHKJGH", 123333);
		
		
		
		// creating a random bank account
		BankAccount account = new BankAccount();
		
		System.out.println(account.getBalance());
		double newBalance = account.depositMoney(100);
		
		System.out.println(newBalance);

		System.out.println(account.getBalance());
	}

}

package com.techelevator.homes;

public class HomeApp {

	public static void main(String[] args) {
	
		
		//create a single family home
		Home singleFamilyHome = new SingleFamilyHome(2, 1000, 100000.00, 6);    // has two car garage
		
		// create a multi-family home
		Home multiFamiliyHome = new MultiFamilyHome(3, 3000, 12.59, 10);     // has 3 units


		
		System.out.println(singleFamilyHome);
		
		System.out.println(multiFamiliyHome);
		
		
		String specs = singleFamilyHome.listSpecs();
		
		
		
		
	}

}

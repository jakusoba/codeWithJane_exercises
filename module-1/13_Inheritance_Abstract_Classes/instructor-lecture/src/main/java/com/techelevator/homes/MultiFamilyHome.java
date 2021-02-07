package com.techelevator.homes;

public class MultiFamilyHome extends Home {
	

	private int numberOfUnits;
	

	public MultiFamilyHome(int numberOfBedrooms, int squareFootage, double price, int numberOfUnits) {
		super(numberOfBedrooms, squareFootage, price);
		this.numberOfUnits = numberOfUnits;
		
	}
	
	

	

	public int getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}
	
	
	
	public String toString() {
		
		
		return super.toString() + " Number Of Units: " + this.numberOfUnits;
	
	}

}

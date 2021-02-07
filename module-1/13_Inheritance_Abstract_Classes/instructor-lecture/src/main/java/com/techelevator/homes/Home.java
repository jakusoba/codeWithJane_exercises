package com.techelevator.homes;

public class Home implements Sellable {
	
	
	private int numberOfBedrooms;
	private int squareFootage;
	private double price;
	
	public Home (int numberOfBedrooms, int squareFootage, double price) {
		this.numberOfBedrooms = numberOfBedrooms;
		this.squareFootage = squareFootage;
		this.price = price;
	}
	

	@Override
	public String listSpecs() {		
		return toString();
	}


	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public String toString() {
		

		return "NumberOfBedrooms: " + this.numberOfBedrooms 
				 + "Square Feet: " + this.squareFootage
		         + "Price: $" + this.price;
		
	}


	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}


	public int getSquareFootage() {
		return squareFootage;
	}
	
	
	

}

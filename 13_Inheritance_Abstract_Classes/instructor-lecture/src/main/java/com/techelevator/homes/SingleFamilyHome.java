package com.techelevator.homes;

public class SingleFamilyHome extends Home{
	


	private int garageSize;
	
	
	public SingleFamilyHome(int numberOfBedrooms, int squareFootage, double price, int garageSize) {
		super(numberOfBedrooms, squareFootage, price);
		this.garageSize = garageSize;
	}


	public int getGarageSize() {
		return garageSize;
	}


	public void setGarageSize(int garageSize) {
		this.garageSize = garageSize;
	}
	

	public String toString() {
		
		return super.toString() + " Garage Size: " + this.garageSize;
	
	}	
	

}

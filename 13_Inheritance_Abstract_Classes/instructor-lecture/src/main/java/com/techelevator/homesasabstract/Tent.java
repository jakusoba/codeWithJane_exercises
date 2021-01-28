package com.techelevator.homesasabstract;

public class Tent extends Home {

	public Tent(int numberOfBedrooms, int squareFootage, double price) {
		super(numberOfBedrooms, squareFootage, price);

	}

	@Override
	public double calculateTax(int period) {
		// TODO Auto-generated method stub
		return 0;
	}

}

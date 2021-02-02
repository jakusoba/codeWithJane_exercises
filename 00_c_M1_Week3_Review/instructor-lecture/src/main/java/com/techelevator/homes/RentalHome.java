package com.techelevator.homes;

public class RentalHome extends Home {
	
	private int rentalTermInMonths;

	public RentalHome(Address address, String mlsNumber, int rentalTermInMonths) {
		super(address, mlsNumber);
		this.rentalTermInMonths = rentalTermInMonths;

	}

	public int getRentalTermInMonths() {
		return rentalTermInMonths;
	}

	public void setRentalTermInMonths(int rentalTermInMonths) {
		this.rentalTermInMonths = rentalTermInMonths;
	}

	@Override
	public void calculateTax(int num) {
		// TODO Auto-generated method stub
		
	}
	
	

}

package com.techelevator.homesasabstract;

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

    public double calculateTax(int period, double taxRate) {
    	return 0.0;
    }


	@Override
	public double calculateTax(int period) {
		// TODO Auto-generated method stub
		return 0;
	}

}

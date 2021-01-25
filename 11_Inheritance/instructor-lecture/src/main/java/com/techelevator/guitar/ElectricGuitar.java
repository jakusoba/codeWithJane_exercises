package com.techelevator.guitar;

public class ElectricGuitar extends Guitar {
	
	private int numberOfPickups;

	public ElectricGuitar(int numberOfStrings, String material, String brand) {
		super(numberOfStrings, material, brand);

	}

	public int getNumberOfPickups() {
		return numberOfPickups;
	}

	public void setNumberOfPickups(int numberOfPickups) {
		this.numberOfPickups = numberOfPickups;
	}
	
	
	public void shred() {
		//plays really fast
	}
	
	

}

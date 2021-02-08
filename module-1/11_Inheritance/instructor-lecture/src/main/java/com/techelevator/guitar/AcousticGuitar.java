package com.techelevator.guitar;

public class AcousticGuitar extends Guitar {
	
	public AcousticGuitar(int numberOfStrings, String material, String brand) {
		super(numberOfStrings, material, brand);
		// TODO Auto-generated constructor stub
	}

	public void strum() {
		System.out.println("Strumming my acoustic");
	}

}

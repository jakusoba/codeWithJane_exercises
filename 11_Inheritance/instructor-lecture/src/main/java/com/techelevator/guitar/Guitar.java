package com.techelevator.guitar;

public class Guitar {
	
	private int numberOfStrings;
	private String material;
	private String brand;
//	
//	public Guitar() {
//		
//	}
	
	public Guitar(int numberOfStrings, String material, String brand) {
		this.brand = brand;
		this.numberOfStrings = numberOfStrings;
		this.material = material;
	}
	
	
	public int getNumberOfStrings() {
		return numberOfStrings;
	}
	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public void play() {
	
		System.out.println("Make music");
		
	}
	
	
	
	
	
	
	
	

}

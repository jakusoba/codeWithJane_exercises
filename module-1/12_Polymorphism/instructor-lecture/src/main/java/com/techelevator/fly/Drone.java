package com.techelevator.fly;

public class Drone implements Flyable {

	private String brand;
	private String model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public void fly() {
		
		System.out.println("Buzzzzzzzz");
		
	}
	@Override
	public void crash() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

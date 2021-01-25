package com.techelevator.homes;

public class Home {

	/**
	 * These are member variables. Each home instance in memory will have it's own
	 * copy of data
	 */

	private String mlsNumber;
	private Address address;
	private double numberOfBedrooms;
	private double numberOfBathrooms;
	private double price;
	private String shortDescription;
	
	
	
	public String getMlsNumber() {
		return mlsNumber;
	}
	public void setMlsNumber(String mlsNumber) {
		this.mlsNumber = mlsNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public void setNumberOfBedrooms(double numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	public double getNumberOfBathrooms() {
		return numberOfBathrooms;
	}
	public void setNumberOfBathrooms(double numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	

}

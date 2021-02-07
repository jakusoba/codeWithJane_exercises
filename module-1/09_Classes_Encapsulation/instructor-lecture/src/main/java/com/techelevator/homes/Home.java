package com.techelevator.homes;

public class Home {
	
	// Instance(Member) variables --> data that each object holds
	
	private String mlsNumber;
	private double numberOfBedrooms;
	private int squareFeet;
	private int acreage;
	private double numberOfBathrooms;
	private String neighborhoodName;
	private boolean hasBasement; 
	private double garageSize;
	private double price;
	
	private boolean isSold;
	private boolean isActiveListing;
	

	
	//constructor(s) --> Initialize variables
	public Home () {
		
		this.isActiveListing = true;
	}
	
	//overloaded constructor - This allows us to create a home with
	//these default values
  	
	public Home(String mlsNumber, double price) {
	    this.mlsNumber = mlsNumber;
	    this.price = price;
	}
	
	
	
	//methods (public or private)
	public void listHomeForSale(String mlsNumber,double price) {
		
		this.isActiveListing = true;
        this.mlsNumber = mlsNumber;		
		this.price = price;
		
	}


	// Getters and Setters ...

	public String getMlsNumber() {
		return mlsNumber;
	}



	public double getNumberOfBedrooms() {
		return numberOfBedrooms;
	}



	public void setNumberOfBedrooms(double numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}



	public int getSquareFeet() {
		return squareFeet;
	}



	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}



	public int getAcreage() {
		return acreage;
	}



	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}



	public double getNumberOfBathrooms() {
		return numberOfBathrooms;
	}



	public void setNumberOfBathrooms(double numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}



	public String getNeighborhoodName() {
		return neighborhoodName;
	}



	public void setNeighborhoodName(String neighborhoodName) {
		this.neighborhoodName = neighborhoodName;
	}



	public boolean isHasBasement() {
		return hasBasement;
	}



	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}



	public double getGarageSize() {
		return garageSize;
	}



	public void setGarageSize(double garageSize) {
		this.garageSize = garageSize;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public boolean isSold() {
		return isSold;
	}



	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}



	public boolean isActiveListing() {
		return isActiveListing;
	}



	public void setActiveListing(boolean isActiveListing) {
		this.isActiveListing = isActiveListing;
	}
	
	
	
	
	
	//getters/setter methods
	
	
	
	
	
	
	

}

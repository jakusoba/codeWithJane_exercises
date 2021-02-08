package com.techelevator;

public class FlowerShopOrder {
	private String bouquetType;
	private int numOfRoses;
	private double subtotal;
	
	public FlowerShopOrder(String bouquetType, int numOfRoses) {
	
		this.bouquetType = bouquetType;
		this.numOfRoses = numOfRoses;
	
	}

	public String getBouquetType() {
		return bouquetType;
	}

	public int getNumOfRoses() {
		return numOfRoses;
	}


	public double getSubtotal() {
		//String standard;
		//numOfRoses = 0;
		//if(bouquetType == standard)
			return subtotal + 19.99 + (2.99 * numOfRoses);
	}
	
	public double deliveryTotal(boolean isSameDayDelivery, String zipCode) {
		double deliveryFee = 0.0;
		int inum =Integer.parseInt(zipCode);
		if(inum >= 20000 && inum <= 29999 && isSameDayDelivery == false) {
			return deliveryFee += 3.99;
		}
		else if(inum >= 20000 && inum <= 29999 && isSameDayDelivery == true) {
			return deliveryFee += (3.99 + 5.99);
		}
		else if(inum >= 30000 && inum <= 39999 && isSameDayDelivery == false) {
			return deliveryFee += 6.99;
		}
		else if(inum >= 30000 && inum <= 39999 && isSameDayDelivery == true) {
			return deliveryFee += (6.99 + 5.99);
		}
		else if(inum >= 10000 && inum <= 19999) {
			return deliveryFee;
		}
		else {
			System.out.println("same-day delivery is not avaliable");
			return deliveryFee += 19.99;
			
		}
		
	}

	@Override
	public String toString() {
		return "Order -[ " + getBouquetType() + ", " + getNumOfRoses()
				+ ", " + getSubtotal() + "]";
	}
	
	
	//Override the `toString()` method in your *Flower Shop Order* class and 
	//have it RETURN `"ORDER - {bouquet type} - {number of roses} roses - {subtotal}"` 
	//where `{bouquet type}`, `{number of roses}`, and `{subtotal}` are placeholders for the actual values. 
	//The values from the object should be shown in the string where `{variable-name}` is indicated.

	
	
	
	

	
	
	
	
	
	
}


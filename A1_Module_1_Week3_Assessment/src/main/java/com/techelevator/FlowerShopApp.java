package com.techelevator;

public class FlowerShopApp {

	public static void main(String[] args) {
		FlowerShopOrder fso = new FlowerShopOrder("Standard", 2 );
		double dt = fso.deliveryTotal(true, "20000");

		System.out.println(dt);

	}

}

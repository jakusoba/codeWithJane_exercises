package com.techelevator.sample;


	public abstract class CateringItem {
		private String name;
		private double price;
		private int numOfItems = 50;
		private String productCode;
		
		
		public CateringItem(String name, double price) {
			this.name = name;
			this.price = price;
			
		}
		

		public String getProductCode() {
			return productCode;
		}




		public String getName() {
			return name;
		}

//		public void setName(String name) {
//			this.name = name;
//		}

		public double getPrice() {
			return price;
		}

//		public void setPrice(double price) {
//			this.price = price;
//		}
		
		
			
	
		
		public int getNumOfItems() {
			return numOfItems;
		}
//		public void setNumberOfItems() {
//			this.numberOfItems = 5;
//		}

		public boolean isAvailableToPurchase() {
			if(this.numOfItems >= 1) {
				return true;
			}
			return false;
		}
		
		public void purchaseItem() {
			numOfItems -= 1;
			
		}

		
		
		


}

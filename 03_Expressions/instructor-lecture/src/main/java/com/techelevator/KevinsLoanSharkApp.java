package com.techelevator;

public class KevinsLoanSharkApp {

	public static void main(String[] args) {
		
		//  to get a loan a applicant must be > 18
		//  must have $50 in bank account

		// if approved, tell user is approved AND print out their total loan plus $200 in interest
		
		//if not approved, tell user to go away
		
		
		int jonsAge = 29;
		double jonsBalance = 100.00;
		
		int emAge = 30;
		double emBalance = 150.00;
		
		KevinsLoanSharkApp app = new KevinsLoanSharkApp();
		
		
		String status = app.getLoanApprovalStatus(jonsAge, jonsBalance);
		
        System.out.println("Jons: " + status);
        
		status = app.getLoanApprovalStatus(emAge, emBalance);
		
		
		if (status.equals("Approved")) {    // s1 == s2
			System.out.println("Yippee!");
			emBalance = emBalance + 200;
		}
		
        System.out.println("Em's: " + status);
        
        
        System.out.println("\n******************************\n");
        
        boolean result = app.isApproved(emAge, emBalance);
        System.out.println(result);
        if (result) {
        	System.out.println("Approved");
        }
        else {
        	System.out.println("Go Away!");
        }
        
        
     
        
	}
	
	
	public String getLoanApprovalStatus(int age, double balance) {
		
		if (age > 18 && balance > 50) {
			return "Approved";
		}
		
	    return "Go Away!";

	}
	
	
	public boolean isApproved(int age, double balance) {
		
		if (age > 18 && balance > 50) {
			return true;
		}
		
	    return false;

		
	}
	
	
	

}

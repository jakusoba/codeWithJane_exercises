package com.techelevator.services;


import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;


public class AuctionService {

    public static final String BASE_URL = "http://localhost:3000/auctions";
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();


    public Auction[] listAllAuctions() {
     
    	return restTemplate.getForObject(BASE_URL, Auction[].class );
    			 
        
    }

    public Auction listDetailsForAuction(int id) {
    
        return restTemplate.getForObject(BASE_URL + "/" + id, Auction.class) ;
    }
    
	//http://localhost:3000/auctions?title_like=Bell
    public Auction[] findAuctionsSearchTitle(String title) {
       
    	Auction initialAuction[] = restTemplate.getForObject(BASE_URL + "?title_like=" + title, Auction[].class);
    	//if(initialAuction.length > 0) {
    		return initialAuction;
    	//}
    	//else {
    		//return null;
    	
    	//}
    }

    //http://localhost:3000/auctions?currentBid_lte<=377.44
    public Auction[] findAuctionsSearchPrice(double price) {
    	Auction initialAuction[] = restTemplate.getForObject(BASE_URL + "?currentBid_lte=" + price, Auction[].class);
    	//if(initialAuction.length >= 0) {
    		return initialAuction;
    	//}
    	//else{
    		//return null;
    		
    	//}
    		
    	
    	
    }

}

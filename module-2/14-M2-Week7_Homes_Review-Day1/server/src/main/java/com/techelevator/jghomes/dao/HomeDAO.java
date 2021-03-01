package com.techelevator.jghomes.dao;

import java.util.List;

import com.techelevator.jghomes.model.Home;


public interface HomeDAO {
	
    List<Home> retrieveHomesForSale();
    void addHome(Home home);
    Home retrieveHomeByMLSId(String mlsId);
    boolean deleteHome(String mlsId);
	
}

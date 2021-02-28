package com.techelevator.jghomes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.jghomes.dao.HomeDAO;
import com.techelevator.jghomes.model.Home;

/*   
     DAO methods for reference:
 
    	List<Home> retrieveHomesForSale();
    	void addHome(Home home);
    	Home retrieveHomeByMLSId(String mlsId);
    	boolean deleteHome(String mlsId);

 */


public class HomeController {
	
    /**
     * Return all homes
     *
     * @return List<Home>  -  a list of all homes in the system
     */
	//TODO:  Class exercise #1 - Implement a controller method to return all homes for sale
	//       You are done when you are able to successfully test using postman	
	
	
    /**
     * Return a specific home
     *
     * @return Home - a specific home by MLS Id, or 404 Not Found
     */
	//TODO:  Class exercise #2 - Implement a controller method to return a specific home by id
	//       You are done when you are able to successfully test using postman	
	
    /**
     * Add a new home
     *
     * @return 201 Created if successful
     */	
	//TODO:  Class exercise #3 - Implement a controller method to add a specific home
	//       You are done when you are able to successfully test using postman		
	
    /**
     * Delete a home
     *
     * @return 204 - No Content if successful, 404 if not found
     */		
	//TODO:  Class exercise #4 - Implement a controller method to delete a specific home
	//       You are done when you are able to successfully test using postman
	
	
	
	
	//TODO:  Class exercise #5 - Add the following permissions
	//   1.  Give public access to retrieving homes
	//   2.  Delete Home and Add Home requires login.  (Use the following:
	//  {
	//        "username": "jghomes",
	//        "password": "jghomes"
	//   }	
	//   3.   System.out.println the logged in user who made the change...

	
	
}

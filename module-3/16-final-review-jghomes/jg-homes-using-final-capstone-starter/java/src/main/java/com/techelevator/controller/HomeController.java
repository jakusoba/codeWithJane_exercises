package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.HomeDAO;
import com.techelevator.model.Home;

/*   
     DAO methods for reference:
 
    	List<Home> retrieveHomesForSale();
    	void addHome(Home home);
    	Home retrieveHomeByMLSId(String mlsId);
    	boolean deleteHome(String mlsId);

 */

@RestController
@CrossOrigin
public class HomeController {
	
	private HomeDAO homeDAO;
	
    public HomeController(HomeDAO homeDAO) {

        this.homeDAO = homeDAO;
    }		
	
    /**
     * Return all homes
     *
     * @return List<Home>  -  a list of all homes in the system
     */
	@RequestMapping(path = "/homes", method = RequestMethod.GET)
	public List<Home> getHomes() {
		return homeDAO.retrieveHomesForSale();
	}    
	

	
	
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
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/homes", method = RequestMethod.POST)
    public void addHome(@RequestBody Home home) {
        homeDAO.addHome(home);
    }
	
	
	
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

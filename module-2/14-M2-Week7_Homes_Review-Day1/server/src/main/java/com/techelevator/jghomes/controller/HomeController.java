package com.techelevator.jghomes.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.jghomes.dao.HomeDAO;
import com.techelevator.jghomes.exception.HomeNotFoundException;
import com.techelevator.jghomes.model.Home;


/*   
     DAO methods for reference:
 
    	List<Home> retrieveHomesForSale();
    	void addHome(Home home);
    	Home retrieveHomeByMLSId(String mlsId);
    	boolean deleteHome(String mlsId);
 */

@PreAuthorize("isAuthenticated()")
@RestController
public class HomeController {
	private HomeDAO homeDAO;
	public HomeController(HomeDAO homeDAO) {
		this.homeDAO = homeDAO;
	}
	
	@PreAuthorize("permitAll")
	@RequestMapping(path = "/homes", method = RequestMethod.GET)
     public List<Home>list() {
		return homeDAO.retrieveHomesForSale();
	}
	
	@RequestMapping(path = "/homes/{mlsId}", method = RequestMethod.GET)
	public Home retrieveById(@PathVariable String mlsId) throws HomeNotFoundException {
		Home home = homeDAO.retrieveHomeByMLSId(mlsId);
		if(home == null) {
			throw new HomeNotFoundException();
		}	
		return home;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
    @RequestMapping( path = "/homes", method = RequestMethod.POST)
    public void addHome(@Valid @RequestBody Home home, Principal principal) throws HomeNotFoundException {
        homeDAO.addHome(home);
        auditLog("add", principal.getName());
    }
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@RequestMapping(path = "/homes/{mlsId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String mlsId,Principal principal) throws HomeNotFoundException {
		
        if( !homeDAO.deleteHome(mlsId)) {
        	throw new HomeNotFoundException();
        	
        }
        auditLog("delete", principal.getName());
    }
	
	private void auditLog(String operation, String username) {
        System.out.println("User: " + username + " performed the operation: " + operation );
    }

	
	
     
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

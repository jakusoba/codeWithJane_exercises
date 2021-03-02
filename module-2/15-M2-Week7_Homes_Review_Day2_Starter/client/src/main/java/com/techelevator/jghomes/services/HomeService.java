package com.techelevator.jghomes.services;


import org.springframework.http.HttpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import com.techelevator.jghomes.models.Home;

public class HomeService {
	
	private final String BASE_SERVICE_URL;
	public String AUTH_TOKEN = "";
	private RestTemplate restTemplate = new RestTemplate();
	
	public HomeService(String baseUrl) {
		this.BASE_SERVICE_URL = baseUrl;
	}	
	
	/*public Home[] retrieveListOfHomes() {
		
	    Home[] homes = null;
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN

	    
	    //build and entity object so the header gets added
		
		
	    //call the web service using the exchange method 
		
		
		return homes;
		
	}**/
	
	public Home[] retrieveListOfHomes() {
	    Home[] homes = null;
	    try {
	      homes = restTemplate.exchange(BASE_SERVICE_URL + "/homes", HttpMethod.GET, makeAuthEntity(), Home[].class).getBody();
	     
	    } catch (RestClientResponseException ex) {
	      
	    } catch (ResourceAccessException ex) {
	    	
	    }
	    
	    return homes;
	  }
	
	
	public Home retrieveHomesByMLSID(String mlsId) {
		Home home = null;
		
	    try {
			home = restTemplate.exchange(BASE_SERVICE_URL + "homes/" + mlsId, HttpMethod.GET, makeAuthEntity(), Home.class).getBody();
			
	    }	
	    catch (RestClientResponseException ex) {
		      
		} 
		catch (ResourceAccessException ex) {
		      
		}
	    return home;
		
		
	}	
	
	public void addHome(Home home) {
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
		HttpEntity<Home> entity = makeHomeEntity(home);
		try {
			ResponseEntity<String> response = restTemplate.exchange(BASE_SERVICE_URL + "/homes/", HttpMethod.POST, entity, String.class);
		}	
		catch (RestClientResponseException ex) {
		      
		} 
		catch (ResourceAccessException ex) {
		      
		}
	    
	    //build and entity object so the header gets added

	    //call the web service using the exchange method 
		
	}	
	
	public void deleteHome(String mlsId) {
		
		   Home home = null;
		    
		    	
		    try {
				home = restTemplate.exchange(BASE_SERVICE_URL + "homes/" + mlsId, HttpMethod.DELETE, makeAuthEntity(), Home.class).getBody();
			} 
			catch (RestClientResponseException ex) {
			    
			} 
			catch (ResourceAccessException ex) {
			      
			}
	}		
	
	
	
	/**
	 * This gets set by the client once authentication occurs
	 * @param aUTH_TOKEN
	 */
	public void setAUTH_TOKEN(String aUTH_TOKEN) {
		AUTH_TOKEN = aUTH_TOKEN;
	}	
	
	private HttpEntity<Home> makeHomeEntity(Home home) {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);
	    HttpEntity<Home> entity = new HttpEntity<>(home, headers);
	    return entity;
	  }
	
	private HttpEntity makeAuthEntity() {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setBearerAuth(AUTH_TOKEN);
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    HttpEntity entity = new HttpEntity<>(headers);
	    return entity;
	  }
	

}
	

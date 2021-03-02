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

public class Solution_Dont_Look_At_Me {
	
	private final String BASE_SERVICE_URL;
	public String AUTH_TOKEN = "";
	private RestTemplate restTemplate = new RestTemplate();
	
	public Solution_Dont_Look_At_Me(String baseUrl) {
		this.BASE_SERVICE_URL = baseUrl;
	}	
	
	public Home[] retrieveListOfHomes() {
		
	    Home[] homes = null;
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);
	    
	    //build and entity object so the header gets added
	    HttpEntity<Home[]> entity = new HttpEntity<>(headers);		
		
	    //call the web service using the exchange method 
		homes = restTemplate.exchange(BASE_SERVICE_URL + "/homes", HttpMethod.GET, entity, Home[].class).getBody();
		
		return homes;
		
	}
	
	public Home retrieveHomesByMLSID(String mlsId) {
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);
	    
	    //build and entity object so the header gets added
	    HttpEntity<Home> entity = new HttpEntity<>(headers);		
		
	  //call the web service using the exchange method 
		ResponseEntity<Home> response;
		try {
			response = restTemplate.exchange(BASE_SERVICE_URL + "/homes/" + mlsId, HttpMethod.GET, entity, Home.class);
			return response.getBody();
		} 
		catch (RestClientResponseException ex) {
		      // handles exceptions thrown by rest template and contains status codes
		      System.out.println(ex.getRawStatusCode() + " : " + ex.getStatusText());
		      return null;
		} 
		catch (ResourceAccessException ex) {
		      // i/o error, ex: the server isn't running
			System.out.println(ex.getMessage());
		}

		return null;
		
	}	
	
	public void addHome(Home home) {
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);	
	    
	  //build and entity object so the header gets added
	    HttpEntity<Home> entity = new HttpEntity<>(home, headers);	
	    
	    try {
	    	//call the web service using the exchange method 
			ResponseEntity<String> response = restTemplate.exchange(BASE_SERVICE_URL + "/homes/", HttpMethod.POST, entity, String.class);
		} 
		catch (RestClientResponseException ex) {
		      // handles exceptions thrown by rest template and contains status codes
		      System.out.println(ex.getRawStatusCode() + " : " + ex.getStatusText());
		} 
		catch (ResourceAccessException ex) {
		      // i/o error, ex: the server isn't running
			System.out.println(ex.getMessage());
		}
	
	}	
	
	public void deleteHome(String mlsId) {
		
	  
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);
	    
	    //build and entity object so the header gets added
	    HttpEntity<Home> entity = new HttpEntity<>(headers);		
		
	    //call the web service on the server-side to retrieve an array of students...
		ResponseEntity<String> response;
		try {
			response = restTemplate.exchange(BASE_SERVICE_URL + "/homes/" + mlsId, HttpMethod.DELETE, entity, String.class);
		} 
		catch (RestClientResponseException ex) {
		      // handles exceptions thrown by rest template and contains status codes
		      System.out.println(ex.getRawStatusCode() + " : " + ex.getStatusText());
		} 
		catch (ResourceAccessException ex) {
		      // i/o error, ex: the server isn't running
			System.out.println(ex.getMessage());
		}

	}		
	
	
	
	/**
	 * This gets set by the client once authentication occurs
	 * @param aUTH_TOKEN
	 */
	public void setAUTH_TOKEN(String aUTH_TOKEN) {
		AUTH_TOKEN = aUTH_TOKEN;
	}	
	

}
	

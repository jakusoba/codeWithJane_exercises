package com.techelevator.reservations.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.cities.dao.CityDao;
import com.techelevator.cities.model.City;
import com.techelevator.reservations.dao.ReservationDAO;

@RestController
public class CityController {

	@Autowired
	private CityDao cityDao;
	
	@Autowired
	private ReservationDAO resDao;
	
	
	@RequestMapping(path="/city", method=RequestMethod.GET)
	public List<City> getListOfCities() {
		return cityDao.list();
		
	}
	
	
}

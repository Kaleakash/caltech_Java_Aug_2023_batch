package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.CabFare;
import com.service.CabFareService;

@RestController
@RequestMapping("cabfare")
public class CabFareController {

	@Autowired
	CabFareService cabFareService;
	// http://localhost:8282/cabfare/findAllCabs
	// method get 
	
	@GetMapping(value = "findAllCabs",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CabFare> findAllCabFareInfo() {
		return cabFareService.findAllCabDetails();
	}
	// http://localhost:8282/cabfare/storeCabFare 
	// method : post 
	// data in json format {"tolocation":"A","fromlocation":"B","typeofcab":"Cab1","numberofseats":7,"amount":1200}
	@PostMapping(value = "storeCabFare",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCabFareInfo(@RequestBody CabFare cabfare) {
		return cabFareService.storeCarFare(cabfare);
	}
	// http://localhost:8282/cabfare/findCabFare/A/B/Cab1/7
	
	@GetMapping(value = "findCabFare/{tolocation}/{fromlocation}/{typeofcab}/{numberofseats}")
	public float findCabFare(@PathVariable("tolocation") String tolocation, @PathVariable("fromlocation") String fromlocation,
			@PathVariable("typeofcab") String typeofcab,@PathVariable("numberofseats") int numberofseats) {
		return cabFareService.findCabFare(tolocation, fromlocation, typeofcab, numberofseats);		
	}
}



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
	
	@GetMapping(value = "cabfare",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CabFare> findAllCabFareInfo() {
		return cabFareService.findAllCabDetails();
	}
	
	@PostMapping(value = "storeCabFare",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeCabFareInfo(@RequestBody CabFare cabfare) {
		return cabFareService.storeCarFare(cabfare);
	}
	
	@GetMapping(value = "findcabfare/{to}/{from}/{typeofcab}/{numberofseats}")
	public float findCabFare(@PathVariable("to") String to, @PathVariable("from") String from,
			@PathVariable("typeofcab") String typeofcab,@PathVariable("numberofseats") int numberofseats) {
		return cabFareService.findCabFare(to, from, typeofcab, numberofseats);
		
	}
}

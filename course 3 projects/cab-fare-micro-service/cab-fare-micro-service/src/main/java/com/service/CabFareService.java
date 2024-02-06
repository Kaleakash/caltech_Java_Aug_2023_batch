package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.CabFare;
import com.repository.CabFareRepository;

@Service
public class CabFareService {

	@Autowired
	CabFareRepository cabFareRepository;
	
	public String storeCarFare(CabFare cb) {
		cabFareRepository.save(cb);
		return "Cab Details stored";
	}
	
	public List<CabFare> findAllCabDetails() {
		return cabFareRepository.findAll();
	}
	
	public float findCabFare(String tolocation, String fromlocation, String typeofcab, int numberofseats) {
		try {
		return cabFareRepository.findCabFare(tolocation, fromlocation, typeofcab, numberofseats);	
		} catch (Exception e) {
			return -1;
		}
	}
	
}

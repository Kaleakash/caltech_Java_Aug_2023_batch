package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Integer>{

	
	@Query("select cf.amount from CabFare cf where cf.to = :to and cf.from = :from and "
			+ "cf.typeofcab=:typeofcab and cf.numberofseats=:numberofseats")
	public float findCabFare(@Param("to") String to,
	@Param("from") String from, 
	@Param("typeofcab") String typeofcab, 
	@Param("numberofseats") int numberofseats);
	
}

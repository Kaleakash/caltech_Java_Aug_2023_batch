package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bean.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	// JPQL 
	@Query("select acc.amount from Account acc where acc.emailid=:emailid")
	public float findAccountByEmailId(@Param("emailid") String emailid);
}

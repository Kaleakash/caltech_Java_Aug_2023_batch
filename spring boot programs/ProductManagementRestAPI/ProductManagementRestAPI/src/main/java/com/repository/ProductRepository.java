package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository					// 1st parameter class name, 2nd data type of primary key value 
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}

package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		productRepository.save(product);		// save is pre defined method
		return "Product details stored successfully";
	}
	
	public List<Product> findAllProductInfo() {
		return productRepository.findAll();
	}
}

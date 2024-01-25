package com.service;

import java.util.List;
import java.util.Optional;

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
	public String deleteProduct(int pid) {
		
//		productRepository.deleteById(pid);
//		return "Record deleted ";
		Optional<Product> op=productRepository.findById(pid);		// find record by id 
		if(op.isPresent()) {
//		Product p	= op.get();							// if present get that record 
//		productRepository.delete(p);					// delete that record 
			productRepository.deleteById(pid);		
		return "Product deleted successfully";
		}else {
			return "Product id not present";
		}
	}
	
	public String updateProduct(Product prodct) {
		Optional<Product> op=productRepository.findById(prodct.getPid());		// find record by id 
		if(op.isPresent()) {
		Product p	= op.get();							// if present get that record 
		p.setPrice(prodct.getPrice());    // p retrieve from database base upon id and set new price
			productRepository.saveAndFlush(p);	
		return "Product updated successfully";
		}else {
			return "Product id not present";
		}
	}

	public String findProduct(int pid) {
		Optional<Product> op=productRepository.findById(pid);		// find record by id 
		if(op.isPresent()) {
		Product p	= op.get();							// if present get that record 
		return p.toString();
		}else {
			return "Product id not present";
		}
	}
}

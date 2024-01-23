package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:8080/findProducts method is get by default get 
	
	@RequestMapping(value = "findProducts",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	public List<Product> findAllProduct() {
		return productService.findAllProductInfo();
	}
	
	// http://localhost:8080/storeProduct  ie URL 
	// method must post 
	// data through body part in json format {"pname":"TV","price":56000}
	@RequestMapping(value = "storeProduct",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeProduct(@RequestBody Product product) {
		System.out.println(product);
		return productService.storeProduct(product);
		//return "done";
	}
}

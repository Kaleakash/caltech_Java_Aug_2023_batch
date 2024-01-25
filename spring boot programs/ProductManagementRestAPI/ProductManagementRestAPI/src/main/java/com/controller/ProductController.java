package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	// http://localhost:8080/deleteProduct/1
	// http://localhost:8080/deleteProduct/100
	@RequestMapping(value = "deleteProduct/{pid}",method = RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("pid") int pid) {
		return productService.deleteProduct(pid);
	}
	
		// http://localhost:8080/updateProduct  ie URL 
		// method must put 
		// data through body part in json format {"pid":1,"price":56000}
		@RequestMapping(value = "updateProduct",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.PUT)
		public String updateProduct(@RequestBody Product product) {
			System.out.println(product);
			return productService.updateProduct(product);
		}
		// http://localhost:8080/findProduct/1
		//  http://localhost:8080/findProduct/100
		@RequestMapping(value = "findProduct/{pid}",method = RequestMethod.GET)
		public String findProduct(@PathVariable("pid") int pid) {
			return productService.findProduct(pid);
		}
}


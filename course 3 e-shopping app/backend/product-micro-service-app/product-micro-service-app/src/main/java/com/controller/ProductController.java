package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;

	// http://localhost:8282/product/findAll
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProduct(){
		return productService.findAllProduct();
	}
	// http://localhost:8282/product/store
	// {"pname":"TV","price":67000,"url":"","qty":10}
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	// http://localhost:8282/product/delete/1
	@DeleteMapping(value = "delete/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
		return productService.deleteProduct(pid);
	}
	
	// http://localhost:8282/product/update
	// {"pid":1,"price":67000,"qty":10}
	@PutMapping(value = "update",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
}

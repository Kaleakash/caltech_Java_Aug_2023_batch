package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bean.Product;

@ExtendWith(SpringExtension.class)
@SpringBootTest								// while testing for spring boot 
class ProductControllerTest {

	@Autowired
	ProductController productController;
	
	@Test
	@Disabled
	void testSayHello() {
		//fail("Not yet implemented");
		String result	= productController.sayHello();
		assertEquals("Welcome to Product Rest API", result);
	}

	@Test

	void testGetAllProducts() {
	List<Product> listOfProducts = productController.getAllProducts();
	assertEquals(3, listOfProducts.size());
	Product p = listOfProducts.get(0);
	assertEquals(1, p.getPid());
	assertEquals("Pen Drive", p.getPname());
	assertEquals(2000.0, p.getPrice());
	assertEquals(4, p.getQty());
	}

}




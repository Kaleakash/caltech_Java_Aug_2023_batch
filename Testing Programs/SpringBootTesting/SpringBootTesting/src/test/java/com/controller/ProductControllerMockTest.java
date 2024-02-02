package com.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.bean.Product;
import com.service.ProductService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ProductControllerMockTest {

	@Mock
	ProductService productService;
	
	@InjectMocks
	ProductController productController;
	
	@Test
	void testGetAllProducts() {
		//fail("Not yet implemented");
		
		// Fake Data 
		Product p1 = new Product();
		p1.setPid(1);
		p1.setPname("Bag");
		p1.setPrice(5000);
		p1.setQty(15);
		
		Product p2 = new Product();
		p2.setPid(2);
		p2.setPname("Mobile");
		p2.setPrice(55000);
		p2.setQty(10);
		List<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		
		// Fake information for service layer like proxy 
		Mockito.when(productService.findAllProduct()).thenReturn(listOfProduct);
		
		//Mockito.when(productService.findAllProduct()).thenCallRealMethod();		// it call actual service , dao and database method 
		
		// now we do testing 
		List<Product> listOfTestingProduct = productController.getAllProducts();
		assertEquals(2, listOfTestingProduct.size());
	}

}

package com.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dao.ProductDao;

@ExtendWith(MockitoExtension.class)  // if we want mock concept. 
class ProductServiceMockTest {

	
	@Mock
	ProductDao productDao;

	@InjectMocks
	ProductService productService;

	@Test
	void testGetProductInfo() {
		//fail("Not yet implemented");
		try {
		// Mocktio help to to provide mock data. 
			
		Mockito.when(productDao.getProductInfo()).thenReturn("Mock Product Details");
		//	Mockito.when(productDao.getProductInfo()).thenCallRealMethod();	
		} catch (Exception e) {
			// TODO: handle exception
		}
		String result = productService.getProductInfo();
		assertEquals("Mock Product Details", result);
	}

}

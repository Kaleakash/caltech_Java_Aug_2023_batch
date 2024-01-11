package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String storeProduct(Product product) {
		if(productDao.storeProduct(product)>0) {
			return "Product details stored";
		}else {
			return "Product details didn't store";
		}
	}
	
	public List<Product> findAllProduct(){
		return productDao.findAllProducts();
	}
}

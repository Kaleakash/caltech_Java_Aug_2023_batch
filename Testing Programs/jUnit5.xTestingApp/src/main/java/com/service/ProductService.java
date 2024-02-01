package com.service;

import com.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String getProductInfo() {
		System.out.println("I Came Here in service layer");
		return pd.getProductInfo();		// return null
	}
}

package com.pms.service;

import java.util.List;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {
	ProductDao pd = new ProductDao();
	public String storeProduct(Product product) {
		if(product.getPrice()<5000) {
			return "Price must be > 5000";
		}else {
			if(pd.storeProduct(product)>0) {
				return "Product detals stored successfully";
			}else {
				return "Product didn't store";
			}
		}
	}	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product details deleted successfully";
		}else {
			return "Product details not present with id as "+pid;
		}
	}
	public String updateProduct(Product product) {
		if(pd.updateProductPrice(product)>0) {
			return "Product details updated successfully";
		}else {
			return "Product details not present with id as "+product.getPid();
		}
	}
	public List<Product> findAllProduct() {
		// we can apply 10% or 20% or 30% discount. 
		return pd.findAllProduct();
	}
}


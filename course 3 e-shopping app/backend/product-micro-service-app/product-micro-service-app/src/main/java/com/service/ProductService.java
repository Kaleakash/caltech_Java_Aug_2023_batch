package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public String addProduct(Product product) {
		productRepository.save(product);
		return "Product stored successfully";
	}
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	public String deleteProduct(int pid) {
		if(productRepository.existsById(pid)) {
			productRepository.deleteById(pid);
			return "Product deleted successfully";
		}else {
			return "Product didn't delete";
		}
	}
	public String updateProduct(Product product) {
		Optional<Product> op = productRepository.findById(product.getPid());
		if(op.isPresent()) {
			Product p  = op.get();
			p.setQty(product.getQty());
			p.setPrice(product.getPrice());
			productRepository.saveAndFlush(p);
			return "Product updated successfully";
		}else {
			return "Product didn't update";
		}
	}
}

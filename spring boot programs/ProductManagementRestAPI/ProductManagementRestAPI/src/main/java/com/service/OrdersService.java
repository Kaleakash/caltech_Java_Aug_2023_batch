package com.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.bean.Product;
import com.repository.OrdersRepository;
import com.repository.ProductRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	public String placeOrder(Orders order) {	//pid, qty or pname and qty 
		
		int pid = order.getPid();
		Optional<Product> op = productRepository.findById(pid);
		if(op.isPresent()) {
			Product p = op.get();				// get that product base upon pid 
			int price = (int)p.getPrice();		// get that product price 
			int totalprice = price*order.getQty();	// total amount 
			// oid ---> auto increment 
			order.setLdt(LocalDateTime.now());		// set system time 
			order.setTotal(totalprice);				// set total price 
			// pid as pk we are passing and qty we are passing 
			ordersRepository.save(order);		// save order details in orders table. 
			
			p.setQty(p.getQty()-order.getQty());		// update qty 10-2 now 8 
			productRepository.saveAndFlush(p);
			
			return "Order placed successfully";
		}else {
			return "Your order not placed successfully because product not present";
		}
	}
	
	public List<Orders> findAllOrders() {
		return ordersRepository.findAll();
	}
	
	
}

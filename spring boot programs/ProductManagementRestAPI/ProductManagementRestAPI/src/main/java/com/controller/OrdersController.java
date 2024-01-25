package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Orders;
import com.service.OrdersService;

@RestController
public class OrdersController {

	@Autowired
	OrdersService ordersService;
	
	// http://localhost:8080/placeOrder 
	// method must be post 
	// data in json format {"pid":1,"qty":2}
	
	@RequestMapping(value = "placeOrder",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String placeOrder(@RequestBody Orders order) {
		return ordersService.placeOrder(order);
	}
	
	
	// http://localhost:8080/findOrders
	// method must be get 
	
	@RequestMapping(value = "findOrders",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Orders> findAllOrders() {
		return ordersService.findAllOrders();
	}
}

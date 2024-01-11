package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "storeProduct",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Product product) {
		
		String pname = req.getParameter("pname");
		float price = Float.parseFloat(req.getParameter("price"));
		
		product.setPname(pname);
		product.setPrice(price);
		
		String result = productService.storeProduct(product);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);			// req.setAttribute("msg",result);
		mav.setViewName("storeProduct.jsp");
		return mav;
		
	}
	
	@RequestMapping(value = "findAllProducts",method = RequestMethod.GET)
	public ModelAndView findAllProducts(HttpSession hs) {
		ModelAndView mav = new ModelAndView();
		List<Product> listOfProducts = productService.findAllProduct();
	System.out.println("Number of product "+listOfProducts.size());
		//mav.addObject("products", listOfProducts);
		hs.setAttribute("products", listOfProducts);
		mav.setViewName("displayProduct.jsp");
		return mav;
	}
}

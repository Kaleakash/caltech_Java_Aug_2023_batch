package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController			// Rest API 
public class MyController {
	
	//http://localhost:8080/
	
	@RequestMapping(value = "/")
	public String sayHello() {
		return "Welcome to Spring boot rest api";
	}
	
	//http://localhost:8080/plain 
	
	@RequestMapping(value = "plain",produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlainText() {
		return "<h2>Welcome to Spring boot</h2>";
	}
	
	//http://localhost:8080/html 
	@RequestMapping(value = "html",produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<h2>Welcome to Spring boot</h2>";
	}
	
	// //http://localhost:8080/xml
	@RequestMapping(value = "xml",produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<h2>Welcome to Spring boot</h2>";
	}
}

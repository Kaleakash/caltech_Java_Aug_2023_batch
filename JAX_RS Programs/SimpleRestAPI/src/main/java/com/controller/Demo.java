package com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@Path("hello")
public class Demo {
	
	// http://localhost:8080/SimpleRestAPI/rest/hello/say
	
	@GET
	@Path("say")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		System.out.println("I Came here");
		return "Welcome to Simple Rest API develop in JAX_RS";
	}
	
	// http://localhost:8080/SimpleRestAPI/rest/hello/plain
	@GET
	@Path("plain")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayMessageInPlainFormat() {
		System.out.println("I Came here");
		return "<h2>Welcome to Simple Rest API develop in JAX_RS</h2>";
	}
	
	// http://localhost:8080/SimpleRestAPI/rest/hello/html
	
	@GET
	@Path("html")
	@Produces(MediaType.TEXT_HTML)
	public String sayMessageInHtmlFormat() {
		System.out.println("I Came here");
		return "<h2>Welcome to Simple Rest API develop in JAX_RS</h2>";
	}
	
	// http://localhost:8080/SimpleRestAPI/rest/hello/xml
	@GET
	@Path("xml")
	@Produces(MediaType.TEXT_XML)
	public String sayMessageInXMLFormat() {
		System.out.println("I Came here");
		return "<h2>Welcome to Simple Rest API develop in JAX_RS</h2>";
	}
}

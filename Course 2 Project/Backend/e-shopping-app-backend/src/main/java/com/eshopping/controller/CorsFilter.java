package com.eshopping.controller;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CorsFilter implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		System.out.println("I came here");
		 responseContext.getHeaders().add(
		            "Access-Control-Allow-Origin", "*");
		 responseContext.getHeaders().add(
		            "Access-Control-Allow-Methods", 
		            "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		 responseContext.getHeaders().add(
		            "Access-Control-Allow-Headers", 
		            "Content-Type, Accept, X-Requested-With");
		 responseContext.getHeaders().add(
		            "Access-Control-Allow-Credentials", 
		            "true");
		 
	}
}

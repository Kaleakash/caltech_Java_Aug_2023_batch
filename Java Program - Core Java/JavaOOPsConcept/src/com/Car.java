package com;

public class Car {
	int wheel;
	float price;
	String colour;		// instance variable 

	Car() {
		System.out.println("Car class object created...emptry constructor called..");
		wheel = 4;
		price = 120000;
		colour= "black";
	}
//	Car(int wheel1, float price1, String colour1){
//		System.out.println("parameter constructor called..");
//		wheel = wheel1;
//		price = price1;
//		colour= colour1;
//	}
	Car(int wheel, float price, String colour){
		System.out.println("parameter constructor called..");
		this.wheel = wheel;		// both are parameter or local variable 
		this.price = price;		// this.price is instance and price is local variable. 
		this.colour= colour;
	}
	void start() {
		System.out.println("Car Started...");
	}
	void appliedGear(int gear) {
		System.out.println(gear+ " gear applied ");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car stop");
		//System.out.println(result);
	}
	void displayCarDetails(String carInfo) {
		boolean result=true;		// local variable. 
		System.out.println("----------------------");
		System.out.println(carInfo);
		System.out.println("Wheel "+wheel);
		System.out.println("Price "+price);
		System.out.println("Colour "+colour);
		System.out.println("Result "+result);
		System.out.println("----------------------");
	}
}

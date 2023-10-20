package com;

public class Car {
	int wheel;
	float price;
	String colour;		// instance variable 

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

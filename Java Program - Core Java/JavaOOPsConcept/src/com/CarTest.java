package com;

public class CarTest {

	public static void main(String[] args) {
//		System.out.println("Car Test");
//		//start();
//		Car innova = new Car();	
//		Car bmw = new Car();	
//		Car santro = new Car();	
////		innova.start();
////		innova.appliedGear(1);
////		innova.moving();
////		innova.appliedGear(2);
////		innova.appliedGear(3);
////		innova.moving();
////		innova.stop();
//		//innova.displayCarDetails();
//		innova.wheel=4;
//		innova.price=3500000;
//		innova.colour="Gray";
//		
//		bmw.wheel=4;
//		bmw.price=2000000;
//		bmw.colour="white";
//		
//		santro.wheel=4;
//		santro.price=800000;
//		santro.colour="Red";
//		
//		
//		innova.displayCarDetails("Innova car Details");
//		bmw.displayCarDetails("Bmw car Details");
//		santro.displayCarDetails("Santro car Details");
		Car santro = new Car();	// empty constructor 
		Car bmw = new Car();	// empty constructor 
		Car innova = new Car(4,2000000,"Gray"); // parameter constructor 
		santro.wheel=4;
		santro.price=800000;
		santro.colour="Red";
		santro.displayCarDetails("Santro Car");
		innova.displayCarDetails("Innova Car ");
		bmw.displayCarDetails("BMW Car");
		bmw.displayCarDetails("BMW Car");
		bmw.displayCarDetails("BMW Car");
	}

}

package com.polymorphism;

public class Bike6 {
	
	void run() {
		
		System.out.println("Bike is running.");
		
	}
	
	void display() {
		
		System.out.println("It is a bike. ");
	}
	

}

class Splendor extends Bike6 
{
	
	void run() {
		
		System.out.println("It can run upto 100km/h . ");
		
	}
	
	
//    void display() {
//		
//		System.out.println("It is a bike. ");
//	}
	

}

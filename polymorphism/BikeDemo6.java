package com.polymorphism;

public class BikeDemo6 {
	
	public static void main(String[] args) {
		
		
		// b reference variable only call itself method and overridded method.
		// it is not call display method of Splendor class.
		
		Bike6 b = new Splendor();
		b.run();
		b.display();
		
	}

}

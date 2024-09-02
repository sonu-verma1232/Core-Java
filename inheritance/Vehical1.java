package com.inheritance;

public class Vehical1 {
	
	String color;
	int price;
	
	void setVehical(String color, int price) {
		
		this.color = color;
		this.price = price;
		
	}
	
	void getVehicalDetails() {
		
		System.out.println("Vehical color is "+ color);
		System.out.println("Vehical price is "+ price);
		
	}

}

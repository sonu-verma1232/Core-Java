package com.polymorphism;

public class Car2_2 extends Vehicle2_1 
{
	
	void applyPaint() {
		
		System.out.println("Apply white color");
		
	}
	
	public static void main(String[] args) {
		
		Car2_2 c = new Car2_2();
		
		c.applyPaint();
	}

}

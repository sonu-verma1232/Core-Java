package com.basicprogram;


public class Circle {
	float radius = 5;
	float pi = 3.14f;
	
	
	void calculateArea () {
		float area = pi*radius*radius;
		System.out.println("Area of circle is : "+ area);
	}
	
	void calculateCircumpherence () {
		float circum = 2*pi*radius;
		System.out.println("Circumpherence of circle is : "+ circum);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateArea();
		c.calculateCircumpherence();
	}

}

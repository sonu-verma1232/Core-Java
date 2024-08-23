package com.basicprogram;

public class Ractangle {
	int length = 10 , breadth = 20; // instance variable
	
	void calculateArea() {
		int area = length * breadth;
		System.out.println("Area of a ractangle is : "+ area);
	}
	
	void calculatePerimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter of a rectangle is : "+ perimeter);
	}
	
	public static void main(String[] args) {
		Ractangle r = new Ractangle();
		r.calculateArea();
		r.calculatePerimeter();
		
	}

}

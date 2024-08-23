package com.basicprogram;

public class Circle1 {
	// instance variable
	int r;
	float p;
	
	void setDimension(int radius ,float pi) {
		r = radius;
		p = pi;
		
	}
	
	void calculateArea() {
		float area = p*r*r;
		System.out.println("Area of circle is : "+ area);
	}
	
	void calculatePerimeter() {
		float perimeter = 2*p*r;
		System.out.println("Perimeter of the circle is : "+perimeter);
	}
	
	public static void main(String[] args) {
		Circle1 c = new Circle1();
		c.setDimension(6,3.14f);
		c.calculateArea();
		c.calculatePerimeter();
	}

}

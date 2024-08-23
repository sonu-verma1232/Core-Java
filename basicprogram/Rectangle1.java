package com.basicprogram;

public class Rectangle1 {
	int l , b;
	
	void setDimension(int length, int breadth) {
		l = length;
		b = breadth;
	}
	
	void calculateArea()
	{
		int area = l*b;
		System.out.println("Area of rectangle is : "+ area);
	}
	
	void calculatePerimeter()
	{
		int perimeter = 2*(l+b);
		System.out.println("Perimeter of the rectangle is : "+ perimeter);
	}
	
	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1();
		r.setDimension(10,20);
		r.calculateArea();
		r.calculatePerimeter();
		
	}

}

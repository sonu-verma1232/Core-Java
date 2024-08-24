package com.constructor;

public class Rectangle {
	
	Rectangle(int length, int breadth) {
		int area = length*breadth;
		System.out.println("Area of the rectangle is  : "+ area);
	}
	
	Rectangle(float length,int breadth){
		float perimeter = 2*(length+breadth);
		System.out.println("Perimeter of the rectangle is : "+perimeter);
	}

}

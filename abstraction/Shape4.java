package com.abstraction;

public abstract class Shape4 {
	
	abstract void area();
	
	abstract void perimeter();
	
	abstract void volume();
	

}

class Circle extends Shape4
{
	int radius;
	
	void setDetails(int radius) {
		this.radius = radius;
	}
	

	@Override
	void area() {
		double area = 3.14f*radius*radius;
		System.out.println("Area of the circle is : "+ area);
		
	}

	@Override
	void perimeter() {
		
		
	}

	@Override
	void volume() {
		double volume = (4/3)*3.14*radius*radius*radius;
		System.out.println("Volume of the circle is : "+ volume);
		
	}
		
	
}

class Rectangle extends Shape4 
{
	int lenght,breadth;
	
	void setDimension(int length, int breadth) {
		this.lenght = length;
		this.breadth = breadth;
		
	}

	@Override
	void area() {
		float area = lenght*breadth;
		System.out.println("Area of rectangle is : "+ area);
		
	}

	@Override
	void perimeter() {
       float peri = 2*(lenght+breadth);
       System.out.println("Perimeter of rectangle is : "+ peri);
	}

	@Override
	void volume() {
		
		
	}
	
	
}

class Cube extends Shape4 
{
	int side;
	
	void setSide(int side) {
		this.side = side;
	}

	@Override
	void area() {
		double area = 6*side*side;
		System.out.println("Area of cube is : "+area);
		
	}

	@Override
	void perimeter() {
		double peri = 12*side;
		System.out.println("Perimeter of the cube is : "+peri);
		
	}

	@Override
	void volume() {
		double vlm = side*side*side;
		System.out.println("Volume of cube is : "+vlm);
		
	}
	
	
}

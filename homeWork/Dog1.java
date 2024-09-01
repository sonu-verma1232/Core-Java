package com.homeWork;

public class Dog1 extends Animal1
{
	
	String color = "brown";
	
	void display() {
		
		System.out.println("Color of dog is : "+ color);
		
		System.out.println("Color of dog is : "+ super.color);
		
	
	}
	
	public static void main(String[] args) {
		
		
		Dog1 d = new Dog1();
		
		d.display();
	}
	
	

}

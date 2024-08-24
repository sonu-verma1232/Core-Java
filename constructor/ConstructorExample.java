package com.constructor;

public class ConstructorExample {
	
	
	 //default constructor
	ConstructorExample(){
		
		System.out.println("It is a default constructor.");
		
	}
	
	
	//parameterized constructor
	ConstructorExample(int a, int b){
		
		System.out.println("Sum of a and b is : "+(a+b));
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorExample ce1 = new ConstructorExample(); // default constructor
		
		
		ConstructorExample ce = new ConstructorExample(10,20);   // parameterized constructor
		
		
		
	}

}

package com.constructor;

public class DefaultConstructor {
	
	int num1;
	String name;
	double salary;
	
	
	
	void display() {
		
		System.out.println("Number is : "+num1);
		System.out.println("String is : "+name);
		System.out.println("Salary is : "+salary);
		
		
	}
	
	public static void main(String[] args) {
		
		
		DefaultConstructor d = new DefaultConstructor();
		
		d.display();
		
		
	}

}

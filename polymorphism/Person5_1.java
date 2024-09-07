package com.polymorphism;

public class Person5_1 {
	
	String name;
	int age;
	public Person5_1(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	void display() {
		
		System.out.println("Name of the person is : "+ name);
		System.out.println("Age of the person is : "+ age);
		
	}
	
	
	
		

}

class Employee1 extends Person5_1
{
	
	int id ; 
	double salary;
	public Employee1(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	
	void display()
	{
		super.display();
		System.out.println("Employee ID is : "+ id);
		System.out.println("Employee salary is : "+ salary);
		
		
	}
	
	
	
	
	
}

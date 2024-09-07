package com.polymorphism;

public class Person4_1 {
	
	String name, phoneNumber;
	
	void setData(String name, String phoneNumber)
	{
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	
	void getData()
	{
		
		System.out.println("Name of the person is : "+ name);
		System.out.println("Phone number of the person is : "+ phoneNumber);
		
		
	}

}

package com.inheritance;

public class Person {
	
	String name, phoneNumber;
	
	void setData(String name, String phoneNumber) 
	{
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	
	void getData()
	{
		
		System.out.println("Name is : "+name);
		System.out.println("Phone number is : "+phoneNumber);
		
	}

}

package com.polymorphism;

public class Developer1 extends Person1
{
	
	String Id, companyName;
	float salary;
	
	void setDetails(String Id, String companyName, float salary)
	{
		
		this.Id = Id;
		this.companyName = companyName;
		this.salary = salary;
		
	}
	
	void getData()
	{
		
		System.out.println("Employee Id is : "+ Id);
		System.out.println("Company name is : "+ companyName);
		System.out.println("Employee salary is : "+ salary);
		
	}

}

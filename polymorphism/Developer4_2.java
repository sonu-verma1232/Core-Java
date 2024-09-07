package com.polymorphism;

public class Developer4_2 extends Person4_1
{
	
	String Id, companyName;
	float salary;
	
	void setDetails(String Id, String companyName, float salary)
	{
		
		this.Id = Id;
		this.companyName = companyName;
		this.salary = salary;
		
		
	}
	
	void getData() {
		
		super.getData();
		System.out.println("Employee ID is : "+ Id );
		System.out.println("Company name is : "+ companyName);
		System.out.println("Employee salary is : "+ salary);
		
		
	}

}

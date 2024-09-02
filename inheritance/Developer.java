package com.inheritance;

public class Developer extends Person

{
	
	String Id, companyName;
	float salary;
	
	void setDeveloperData(String Id, String companyName, float salary)
	{
		
		this.Id = Id;
		this.companyName = companyName;
		this.salary = salary;
		
	}
	
	void getDeveloperData()
	{
		
		System.out.println("ID name is : "+Id);
		System.out.println("Company name is : "+companyName);
		System.out.println("Salary is : "+ salary);
		
	}

}

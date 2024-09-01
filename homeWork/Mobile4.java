package com.homeWork;

public class Mobile4 {
	
	String companyName,model;
	double price;
	
	void setinfo(String companyName, String model, double price)
	{
		
		this.companyName = companyName;
		this.model = model;
		this.price = price;
		
	}
	
	void getMobileInfo()
	{
		
		System.out.println("Company name is : "+ companyName);
		System.out.println("Model name is : "+ model);
		System.out.println("Mobile price is : "+ price);
		
		
	}

}

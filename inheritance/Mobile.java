package com.inheritance;

public class Mobile {
	
	String companyName, model;
	float price;
	
	void setInfo(String companyName,float price, String model)
	{
		
		this.companyName = companyName;
		this.model = model;
		this.price = price;
		
	}
	
	void getMobileInfo()
	{
		
		System.out.println("Company name is : "+ companyName);
		System.out.println("Model type is  : "+ model);
		System.out.println("Price is : "+ price);
		
	}

}

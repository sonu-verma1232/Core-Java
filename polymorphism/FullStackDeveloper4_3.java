package com.polymorphism;

public class FullStackDeveloper4_3 extends Developer4_2
{
	
	String technologyUsed;
	
	void setInfo(String technologyUsed)
	{
		
		this.technologyUsed = technologyUsed;
		
	}
	
	void getData()
	{
		
		super.getData();
		System.out.println("Technology name is : "+ technologyUsed);
		
		
	}

}

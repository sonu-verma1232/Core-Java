package com.inheritance;

public class FullStackDeveloper extends Developer

{
	
	String technologyUsed;
	
	void setInfo(String technologyUsed)
	{
		
		this.technologyUsed = technologyUsed;
		
	}
	
	void getInfo()
	{
		
		System.out.println("Technology name is : "+technologyUsed);
	}

}

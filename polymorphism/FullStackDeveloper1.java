package com.polymorphism;

public class FullStackDeveloper1 extends Developer1
{
	
	String technologyUsed;
	
	void setInfo(String technologyUsed) {
		
		this.technologyUsed = technologyUsed;
		
	}
	
	void getData() {
		
		System.out.println("Technology is : "+technologyUsed);
		
	}

}

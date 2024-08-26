package com.enums;

// Create enum as a class


public enum Size {
	
	SMALL(38),MEDIUM(40),LARGE(42);   // invoking constructor
	
	int value ; // instance Variable
	
	private Size(int value) // constructor
	{
		
		System.out.println("In Constructor");
		this.value = value;
		
	}
	
	public int getValue()
	{
		
		return value;
		
	}

}



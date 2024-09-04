package com.Interface;

interface Banking {
	
	int getRateOfInterest();
}



public class RunTimePolymorphism1 implements Banking
{
	@Override
	public int getRateOfInterest() {
		
		return 9;
	}
	
	public static void main(String[] args) {
		
		Banking b = new RunTimePolymorphism1();
		
		System.out.println(b.getRateOfInterest());
		
	}

}

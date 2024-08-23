package com.basicprogram;


public class StaticMethod  {

     static void display () {
		
		System.out.println("It is a Static method");
		
	}
	
	void getInfo() {
		
		System.out.println("It is an instance method");
		
	}
	
	public static void main(String[] args) {
		
		
		
		StaticMethod.display();
		
		StaticMethod s = new StaticMethod();
		
		s.getInfo();
		
		
		
		
	}
}

package com.abstraction;

public abstract class Transport2 {
	
	abstract void move();
	
	String name;
	
	void setDetails(String name) {
		
		this.name = name;
		
	}
	
	void getDetails() {
		
		System.out.println("Transport name is "+ name);
		
	}

	
	
	
	Transport2 (){
		
		System.out.println("By transport");
		
	}
	
}

class AirTransport extends Transport2 {
	
	void move() {
		
		System.out.println("It flies on air");
		
	}
}

class LandTransport extends Transport2 
{
	
	void move() {
		
		System.out.println("It moves on land ");
		
	}
}




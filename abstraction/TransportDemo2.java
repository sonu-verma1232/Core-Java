package com.abstraction;

public class TransportDemo2 {
	
	public static void main(String[] args) {
		
		
		AirTransport a = new AirTransport();
		a.setDetails("Air Line");
		a.getDetails();
		a.move();
		
		
		System.out.println("----------------------------------------------------------");
		LandTransport l = new LandTransport();
		l.setDetails("Car");
		l.getDetails();
		l.move();
	}

}

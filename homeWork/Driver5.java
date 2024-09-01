package com.homeWork;

abstract public class Driver5 {
	
	abstract void drive();

}

class Pilot extends Driver5 {
	
	
	void drive() {
		
		System.out.println("It drive the plane. ");
		
	}
}


class LocoPilot extends Driver5 {
	
	void drive() {
		System.out.println("It drive the train.");
	}
}
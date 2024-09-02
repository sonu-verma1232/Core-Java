package com.inheritance;

public class TwoWheeler1 extends Vehical1
{
	
	String modelName;
	int noOfGear, speed;
	
	void setDetails(String modelName, int noOfGear, int speed) {
		this.modelName = modelName;
		this.noOfGear = noOfGear;
		this.speed = speed;
		
	}
	
	void display() {
		
		System.out.println("Model name is "+modelName);
		System.out.println("No. of Gear is "+ noOfGear);
		System.out.println("Speed is "+ speed);
	}

}

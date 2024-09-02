package com.inheritance;

public class FourWheeler1 extends Vehical1
{
	
	String modelName;
	int noOfSeat;
	
	void setDetails(String modelName , int noOfSeat) {
		
		this.modelName = modelName;
		this.noOfSeat = noOfSeat;
		
	}
	
	void display() {
		
		System.out.println("Model name is "+ modelName);
		System.out.println("No. of seat is "+ noOfSeat);
	}

}

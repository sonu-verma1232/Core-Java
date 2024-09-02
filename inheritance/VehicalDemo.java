package com.inheritance;


class Vehical
{
	String type, color;
	
	void setDetails(String type , String color)
	{
		this.type = type;
		this.color = color;
	}
	
	void getDetails()
	{
		System.out.println("Vehical type is "+ type);
		System.out.println("Vehical color is "+ color);
	}
}

class Car extends Vehical
{
	String modelName, carNumber;
	int noOfSheet;
	
	void putDetails(String modelName, String carNumber, int noOfSheet)
	{
		this.carNumber = carNumber;
		this.modelName = modelName;
		this.noOfSheet = noOfSheet;
	}
	
	void display()
	{
		System.out.println("Model name of the car "+ modelName);
		System.out.println("Car number is "+ carNumber);
		System.out.println("Number of sheet is "+noOfSheet);
	}
}


public class VehicalDemo {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.putDetails("Kia Carens", "2290", 7);
		c.setDetails("Four wheeler", "White");
		c.getDetails();
		c.display();
		
	}

}

package com.homeWork;

public class Lion2  extends Animal2
{
	
	void sound()
	{
		System.out.println("Lion roars");
		
	}
	
	void eat()
	{
		
		super.eat();
		
		System.out.println("Lion eat only meat");
		
	}
	
	
	public static void main(String[] args) {
		
		Lion2  l = new Lion2();
		
		l.sound();
		l.eat();
	}

}
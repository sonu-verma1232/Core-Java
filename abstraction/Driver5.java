package com.abstraction;

public abstract class Driver5 {
	// in abstract method we can use only default,protected and public access specifier.
	protected abstract void drive();

}

class Pilot extends Driver5
{
	// here we use same access specifier or greater visibility access specifier as parent class in child class.
	public void drive() {
		System.out.println("Pilot fly aeroplane");
	}
}

package com.abstraction;

public abstract  class Doctor1 {
	
	abstract void treat();

}

class Cardiologist extends Doctor1
{
	
	void treat()
	{
		System.out.println("It treats heart related problem");
		
	}
	
}

class Neurologist extends Doctor1
{
	
	void treat()
	{
		System.out.println("It treat brain or nervous system");
	}
}

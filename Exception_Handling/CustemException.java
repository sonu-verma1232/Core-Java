package com.Exception_Handling;

class UnderAgeException extends Exception 
{
	public UnderAgeException()
	{
		super("You can not vote.");
	}
	
	
}

public class CustemException {
	
	public static void main(String[] args) {
		
		int age = 12;
		
		try 
		{
		if(age<18) 
		{
			throw new UnderAgeException();
		}
		else
		{
			System.out.println("You eligible to vote.");
		}
		}
		catch (UnderAgeException u)
		{
			u.printStackTrace();
		}
	}

}

package com.Exception_Handling;

public class MultipleExceptionOneCatch {
	
	public static void main(String[] args) {
		
		
		String name = "Raj";
		
		try
		{
			System.out.println(name.charAt(6));
		} 
		catch (NullPointerException | StringIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		
	  System.out.println("Sonu");
	}

}

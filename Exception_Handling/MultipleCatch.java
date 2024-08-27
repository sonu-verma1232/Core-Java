package com.Exception_Handling;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		String name = "Sonu";
		
		try 
		{
			System.out.println(name.charAt(6));
		} 
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{                    // Exception is used at last block because exception is the parent class all exception
			e.printStackTrace();
		}
		
		System.out.println("Hello");
		
	}

}

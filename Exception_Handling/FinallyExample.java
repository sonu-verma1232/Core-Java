package com.Exception_Handling;

public class FinallyExample {
	
	public static void main(String[] args) {
		
		System.out.println("Raj");
		System.out.println("Scott");
		
		try {
		System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		finally {
			System.out.println("Always executed");
		}
		
		
		System.out.println("Sonu");
		System.out.println("Monu");
		
	}

}

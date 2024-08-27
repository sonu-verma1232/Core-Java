package com.Exception_Handling;

public class Example4 {
	public static void main(String[] args) {
		
		System.out.println("10");
		System.out.println("11");
		System.out.println("12");
		System.out.println("13");
		
		try {
			
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			
		    e.printStackTrace();
            			
		}
		
		System.out.println("14");
		System.out.println("15");
	}

}

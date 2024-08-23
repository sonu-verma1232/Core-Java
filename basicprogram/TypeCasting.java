package com.basicprogram;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		System.out.println("Implicit type casting");
		int a = 10;
		
		double d = a;    // Implicit type casting
		
		System.out.println(d);
		
		
		System.out.println("Explicit type casting");
		double b = 120.14;
		
		int c = (int)b; // Explicit type casting
		
		System.out.println(c);
		
		
	}

}

package com.constructor;



 class Calculation1 {
	
	Calculation1(int a, int b, int c){
		
		this(a,b);
		System.out.println("Sum of a, b and c is "+ (a+b+c));
		
	}
	
	Calculation1(int a, int b) {
		
		this(a);
		System.out.println("Sum of a and b is "+(a+b));
		
		
	}
	
	Calculation1(int a){
		
		System.out.println("Value of a is "+ a);
		
	}

}
 
 public class CalculationDemo1{
	 
	 public static void main(String[] args) {
		
		 
		 Calculation1 c = new Calculation1(2,5,8);
		 
		 
	}
 }

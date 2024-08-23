package com.basicprogram;

public class VAFactorial {
	
	int factorial(int...a) {
		
		int fact = 1;
		
		for(int i = 1; i<= a[0]; i++) {
			
			fact = fact * i;
		}
		
		return fact ;
	}
	
	public static void main(String[] args) {
		
		VAFactorial f = new VAFactorial();
		System.out.println(f.factorial(5));
	}

}

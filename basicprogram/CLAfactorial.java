package com.basicprogram;

public class CLAfactorial {
	
	public static void main(String[] args) {
		 
		int a = Integer.parseInt(args[0]);
		
		int factorial = 1;
		if (a<1) {
			factorial = 1;
		} else {
			
			for(int i = a; i>=1 ; i--) {
				factorial = factorial*i;
			}
		}
		
		System.out.println("Factorial of "+a+" is : "+ factorial);
	}

}

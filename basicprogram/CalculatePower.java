package com.basicprogram;

//import java.lang.Math;

public class CalculatePower {
	
	 void getPower(int a,int n) {
		
		double result = 1;
		for(int i = 1; i<= n; i++) {
			
			result = result*a;
			
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		 int a = 2; 
		 int n = 5;

		 CalculatePower c = new CalculatePower();
		 c.getPower(a, n);
		
		 
		 
	}

}

package com.constructor;


class Calculation {
	
	
	void summation(int a, int b, int c) {
		
		this.summation(a,b);
		System.out.println("Sum of a , b and c is "+ (a+b+c));
		
	}
	
	void summation(int a, int b) {
		
		this.summation(a);
		System.out.println("Sum of a and b is "+(a+b));
		
		
	}
	
	void summation(int a) {
		
		System.out.println("Value of a is "+ a);
		
	}
	
}

public class CalculationDemo {
	
	
	public static void main(String[] args) {
		
		
		Calculation c = new Calculation();
		
		c.summation(5, 2, 6);
	}

}

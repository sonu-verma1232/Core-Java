package com.basicprogram;

public class Product {
	
	
	void multiply (int a, int b) {
		int p = a*b;
		System.out.println("Product of a and b is : "+p);
	}
	
	
	void multiply (int a, int b, int c) {
		int p = a*b*c;
		System.out.println("Product of a, b and c is : "+p);
	}
	
	
	void multiply (double a, double b) {
		double p = a*b;
		System.out.println("Product of a and b is : "+p);
	}
	
	
	void multiply (int a, double b) {
		double p = a*b;
		System.out.println("Product of a and b is : "+p);
	}

}

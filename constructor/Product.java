package com.constructor;

public class Product {
	
	Product (int a , int b){
		int p = a*b;
		System.out.println("Product of the a and b is : "+p);
	}
	
	Product (int a , int b, int c){
		int p = a*b*c;
		System.out.println("Product of the a, b and b is : "+p);
	}
	
	
	Product (double a , double b){
		double p = a*b;
		System.out.println("Product of the a and b is : "+p);
	}
	
	
	Product (double a , int b){
		double p = a*b;
		System.out.println("Product of the a and b is : "+p);
	}

}

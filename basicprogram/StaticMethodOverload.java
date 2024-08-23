package com.basicprogram;

public class StaticMethodOverload {
	
	 static void sum (int a, int b) {
		int add = a+b;
		System.out.println("Sum is : "+ add);
	}
	
	static void sum(int a, int b, int c) {
		int add = a+b+c;
		System.out.println("Sum is : "+add);
	}
	
	public static void main(String[] args) {
		 // we can call static method both type if all method are  in same class
		sum(3,5);
		StaticMethodOverload.sum(3,8,5);
		
		
		
	}

}

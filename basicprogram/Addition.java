package com.basicprogram;

public class Addition {
	
	// Instance variables
	int a = 10;
	int b = 20;
	// static variables
	static int c = 30;
	static int d = 40;
	
	// Instance method
	void sum() {
		
		int s = a+b;
		System.out.println("Sum is : "+ s);
		
		
		
		int add = c+d;
		System.out.println("Add is : "+add);
		
	}
	
	// Static method
	static void add() {
		
//		int sum = a+b; // we can not access instance variable int static method
		
		int add = c+d;
		
		System.out.println("Add is : "+ add);
		
	}
	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		
		a.sum();
		
		Addition.add();
		
		System.out.println(c+d);
//		System.out.println(a+b);we can't access instance variable in main method because main is an static function
	}

}

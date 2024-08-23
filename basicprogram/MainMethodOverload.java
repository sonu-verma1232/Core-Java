package com.basicprogram;

public class MainMethodOverload {
	
	public static void main(String[] args) {
		
		System.out.println("It is an original main method");
		
		// MainMethodOverload.main();
		
		main();
		main(5,6);
	}
	
	public static void main() {
		
		System.out.println("It is an integer main method");
		
	}
	
	public static void main(int a, int b) {
		
		System.out.println(a*b);
		
		
	}
	
	

}

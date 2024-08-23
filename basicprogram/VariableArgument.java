package com.basicprogram;

public class VariableArgument {
	
	void multiply(int...a) {
		
		int product = 1;
		for(int i = 0; i <a.length; i++) {
			
			product = product*a[i];
			
		}
		
		System.out.println("Multiplication is : " + product);
		
	}
	
	public static void main(String[] args) {
		
		VariableArgument v = new VariableArgument();
		
		v.multiply(1,2,3,4,5);
		
	}

}

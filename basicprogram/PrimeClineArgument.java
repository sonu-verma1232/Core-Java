package com.basicprogram;

public class PrimeClineArgument {
	public static void main(String[] a) {
		 
		String num1 = a[0];
		
		int b = Integer.parseInt(num1);
		int flag = 0;
		for(int i = 1; i<=b; i++) {
			
			if(b%i==0) {
				flag++;
				
			}
		}
		
		if (flag == 2) {
			
			System.out.println(b+" is a prime number");
			
		} else {
			
			System.out.println(b+" is not a prime number");
		}
	}

	
}

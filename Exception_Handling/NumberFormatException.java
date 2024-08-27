package com.Exception_Handling;

public class NumberFormatException {
	
	public static void main(String[] args) {
		
		String mobileNo = "630";
		
		int num = Integer.parseInt(mobileNo);
		num += 5;
		
		System.out.println(num);
	
// 	NumberFormatException is a unchecked exception	
		
		String name = "scott";
		int n = Integer.parseInt(name);
		System.out.println(n);
		
		
	}

}

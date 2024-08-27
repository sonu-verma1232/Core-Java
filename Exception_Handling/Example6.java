package com.Exception_Handling;

public class Example6 {
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		
		
		try {
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
          // System.out.println(e.getMessage());     // it print message only
			System.out.println(e);                 // it print exception name and description
		}
		
		
	}

}

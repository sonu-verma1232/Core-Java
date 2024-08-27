package com.Exception_Handling;

public class Example5 {
	public static void main(String[] args) {
		
        String name = "Scott";
		
		System.out.println(name.toUpperCase());
		
		
		
		String name1 = null;
		
		try {
			System.out.println("Sonu");
			System.out.println(name1.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exception is handled");
		
	}

}

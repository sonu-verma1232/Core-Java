package com.basicprogram;

public class FinalKeyword {
	
	final String color1 = "Red";
	final String color2 = "White";
	final String color3 = "Green";
	int size ;
	
	void setSize(int size) {
		
		this.size = size;
		
	}
	
	void display() {
		
		System.out.println(color1+" , "+color2+" and "+color3+" color apply on flag.");
		System.out.println("Flag size is "+size);
		
	}
	
	public static void main(String[] args) {
		
		FinalKeyword f = new FinalKeyword();
		
		f.setSize(53);
		
//		f.color1 = "Pink "    we can not change variable value due to final keyword
		f.display();
		
	}

}

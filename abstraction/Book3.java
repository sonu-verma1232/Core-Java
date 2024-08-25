package com.abstraction;

public abstract class Book3 {
	
	String authorName;
	double price;
	
	void setDetails(String authorName, double price) {
		
		this.authorName = authorName;
		this.price = price;
		
	}
	
	void getDetails() {
		
		System.out.println("Name of author is "+authorName);
		System.out.println("Price of the book is "+price);
		
	}
	
	abstract void read();
	
	abstract void markText();
	

}

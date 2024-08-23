package com.basicprogram;

public class BookFair {
	String bookName , authorName ; float price;
	
	void setBookDetails(String bookName, String authorName, float price) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	
	void calculateDiscount() {
		float discount;
		if (price <= 1000) {
			 discount = price*0.02f;
//			System.out.println("Discount is : "+ discount);
			
			
		} else if (price > 1000 && price <= 3000) {
			 discount = price*0.1f;
//			System.out.println("Discount is : "+discount);
			
			
		} else {
		    discount = price*0.15f;
//			System.out.println("Discount is : "+ discount);
			
		}
		System.out.println("Discount is : "+discount);
		price = price - discount;
	}
	
	void display () {
		
		System.out.println("Book name is : "+bookName);
		System.out.println("Author name is : "+authorName);
		System.out.println("Price after discount is : "+price);
		
	}

}

package com.basicprogram;

import java.util.*;

public class Book {
	int price;
	String bookName, authorName;
	
	void setDetails(int price,String bookName,String authorName) {
		this.price = price;
		this.bookName = bookName;
		this.authorName = authorName;
		
	}
	
	void getDetails() {
		System.out.println("Book name is : "+bookName);
		System.out.println("Price of book is : "+price);
		System.out.println("Author name is : "+authorName);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the book : ");
		String bName = sc.nextLine();
		
		System.out.println("Enter the price of the book : ");
		int p = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name of the author of the book : ");
		String bAuthor = sc.nextLine();
		
		Book b = new Book();
		
		b.setDetails(p, bName, bAuthor);
		
		b.getDetails();
		
		sc.close();
	}

}

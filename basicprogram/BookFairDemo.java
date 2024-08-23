package com.basicprogram;

import java.util.Scanner;

public class BookFairDemo {
	
	public static void main(String[] args) {
		BookFair b = new BookFair();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the book :");
		String bName = sc.nextLine();
		
		System.out.println("Enter the price of the book :");
		float p = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Enter the author name of the book :");
		String bAuthor = sc.nextLine();
		
		b.setBookDetails(bName, bAuthor, p);
		
		b.calculateDiscount();
		
		b.display();
		
		
		
		sc.close();
	}
	
	
	
	
	
	

}

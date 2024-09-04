package com.Interface;

import java.util.Scanner;

public class BankingSystemDemo6 {
	
	public static void main(String[] args) {
		
		BankingSystem6.rules();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name ");
		String name = sc.nextLine();
		
		System.out.println("Enter your total amount ");
		int amount = sc.nextInt();
		
		
		BankingSystem6 b =  new Person6();  // RunTime polymorphism
		
		
//		b.setAmount(amount);  // we can not call this method by run time polymorphism , so we need to create object of child class.
//		
		System.out.println("Enter deposited amount ");
		int balance = sc.nextInt();
		b.deposit(balance);
		
		System.out.println("Hello! "+name);
//		b.getBalance();
		
		System.out.println("************ MOney Withdraw *************");
		
		System.out.println("Enter withraw amount ");
		amount = sc.nextInt();
		int availableBalance = b.withdraw(amount);
		
		System.out.println("Total balance after withraw amount "+ availableBalance);
		
		sc.close();
		
	}

}

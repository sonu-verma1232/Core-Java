package com.Interface;

import java.util.Scanner;

public class BankingSystemDemo5 {
	
	public static void main(String[] args) {
		
		BankingSystem5.rules();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name ");
		String name = sc.nextLine();
		
		System.out.println("Enter your total amount ");
		int amount = sc.nextInt();
		
		
		Person5 p = new Person5();
		
		p.setAmount(amount);
		
		System.out.println("Enter deposited amount ");
		int balance = sc.nextInt();
		p.deposit(balance);
		
		System.out.println("Hello! "+name);
		p.getBalance();
		
		System.out.println("************ MOney Withdraw *************");
		
		System.out.println("Enter withraw amount ");
		amount = sc.nextInt();
		int availableBalance = p.withdraw(amount);
		
		System.out.println("Total balance after withraw amount "+ availableBalance);
		
		sc.close();
		
	}

}

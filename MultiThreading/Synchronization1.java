package com.MultiThreading;

class Bank
{
	
	int total_balance = 7000;
	
	synchronized void withdraw(int amount) {
		if(total_balance >= amount) {
			System.out.println("Withdraw successfully !");
			total_balance -= amount;
			System.out.println("You available balance is "+total_balance);
		}
		else {
			System.out.println("Insufficient amount");
			System.out.println("Your current balance is "+ total_balance);
		}
	}
	
	
}

public class Synchronization1 extends Thread {
	
	static Bank b;
	int amount;
	
	public void run() {
		
	     b.withdraw(amount);
		
		
	}
	
	public static void main(String[] args) {
		
		b = new Bank();
		
		Synchronization1 sonu = new Synchronization1();
		sonu.amount = 6000;
		sonu.start();
		
		
		Synchronization1 ram = new Synchronization1();
		ram.amount = 7000;
		ram.start();
		
	}
	
	

}

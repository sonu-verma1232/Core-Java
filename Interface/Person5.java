package com.Interface;

public class Person5 implements BankingSystem5 
{
    
	int balance;
	
	void setAmount (int balance) 
	{
		this.balance = balance;
	}
	
	
	
	
	@Override
	public void deposit(int amount) {
		
		balance = balance + amount;
		
	}

	@Override
	public int withdraw(int amount) {
		
		balance = balance - amount;
		return balance;
	}
	
	void getBalance()
	{
		System.out.println("Your total balance is "+ balance);
	}
    
}

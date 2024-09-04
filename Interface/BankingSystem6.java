package com.Interface;

public interface BankingSystem6 {
	
	void deposit(int amount);
	int withdraw(int amount);
	
	default void loan()
	{
		
	}
	
	static void rules()
	{
		System.out.println("Must be citizen of India");
		System.out.println("ID and proof are mendatory");
	}

}

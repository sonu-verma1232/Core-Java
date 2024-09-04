package com.Interface;

interface Bank
{
	void getRateOfInerest();
}

class SBI implements Bank
{

	@Override
	public void getRateOfInerest() {
		System.out.println("SBI returns 9% interest.");
		
	}
}

class PNB implements Bank 
{

	@Override
	public void getRateOfInerest() {
		System.out.println("PNB returns 2% interest.");
	}
	
}

public class BankDemo1 {
	
	public static void main(String[] args) {
		
		SBI s = new SBI();
		s.getRateOfInerest();
		
		PNB p = new PNB();
		p.getRateOfInerest();
	}

}

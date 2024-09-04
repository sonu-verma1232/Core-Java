package com.Interface;

interface Bank1
{
	double getRateOfInerest();
}

class SBI1 implements Bank1
{

	@Override
	public double getRateOfInerest() {
		
		return 10;
	}
	
}

class PNB1 implements Bank1
{

	@Override
	public double getRateOfInerest() {
		
		return 4;
	}
	
}

public class BankDemo2 {
	
	public static void main(String[] args) {
		
		SBI1 s = new SBI1();
		double r1 = s.getRateOfInerest();
		System.out.println("SBI returns interest at the rate of "+ r1+"%");
		
		
		PNB1 p = new PNB1();
		double r2 = p.getRateOfInerest();
		System.out.println("PNB returns interest at the rate of "+ r2+"%");
		
	}

}

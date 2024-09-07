package com.polymorphism;

public class Tata3 extends Company3
{
	
	int companyId;
	
	void setId (int companyId) {
		
		this.companyId = companyId;
		
	}
	
	void display() {
		
		
		System.out.println("Company Name is : "+ companyName);
		System.out.println("Company ID is : "+companyId);
		
		
	}
	
	public static void main(String[] args) {
		
		
		Tata3 t = new Tata3();
		
		t.setDetails("TATA");
		t.setId(123);
		
		t.display();
	}

}

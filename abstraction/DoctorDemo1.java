package com.abstraction;

public class DoctorDemo1 {
	
	public static void main(String[] args) {
		
		
		Cardiologist c = new Cardiologist();
		
		c.treat();
		
		Neurologist n = new Neurologist();
		
		n.treat();
	}

}

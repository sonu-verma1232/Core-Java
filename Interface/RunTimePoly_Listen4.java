package com.Interface;

public class RunTimePoly_Listen4 {
	
	public static void main(String[] args) {
		// method 1 -> for run time polymorphism
		Listener4 l = null;
		
		l = new Crowd();
		l.listen();
		
		
		System.out.println("********* Second Class *************");
		
		// method 2 -> for run time polymorphism
		Audience a = new Audience();
		l = a;
		l.listen();
		
		
	}

}

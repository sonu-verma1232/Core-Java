package com.MultiThreading;

public class ThreadDemo1 {
	
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		
		String name = t.getName();
		System.out.println(name);
		
		int p = t.getPriority();
		System.out.println(p);
		
		//  or
		
		System.out.println(Thread.currentThread().getPriority());
	}

}

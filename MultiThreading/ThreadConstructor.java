package com.MultiThreading;

class ThreadCons implements Runnable{

	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}


public class ThreadConstructor {

	public static void main(String[] args) {
		
    	ThreadCons tc = new ThreadCons();
		Thread t  = new Thread(tc , "Child Thread");
		
		
		t.start();
	}
	
	
}

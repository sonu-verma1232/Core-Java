package com.MultiThreading;

public class ThreadByImplement implements Runnable 
{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()); 
		
        for(int i=1; i<=5; i++) {
        	System.out.println("Sonu Verma");
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
	}
	
	
	public static void main(String[] args) {
		
		ThreadByImplement th = new ThreadByImplement();
		
		Thread t = new Thread(th);
		
		t.start();
		t.setName("Thread name Vaish");
		System.out.println(t.getPriority());
		t.setPriority(9);            // it does not work in windows
		System.out.println("New priority "+t.getPriority());

		
		
		 for(int i=1; i<=5; i++) {
	        	System.out.println("Sonu");
	        	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		 System.out.println(Thread.currentThread().getName());
		
	}
	

}

package com.MultiThreading;


class Test1 extends Thread
{
	public void run() 
	{
		
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		System.out.println(t.isAlive());
		
		for (int i = 0; i <= 3; i++) {
			
			System.out.println("Thread name is "+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}



public class MultipleThread {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Name");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		
	}

}

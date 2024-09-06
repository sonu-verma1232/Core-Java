package com.MultiThreading;


class Test extends Thread
{                                                        // 1-> extends thread class
	public void run()                                    //  2-> override run method
	{                                                    //  3-> create thread object 
		for (int i = 1; i <= 5; i++) {                   //  4-> call start()
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Line number "+i);
		}
	}
}




public class ThreadingDemo {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.start();           // we call start method to create thread 
		
//		t.run();      // when we call it , it work as a normal program execution it means it does not create thread
		
		
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Line number in main method "+i);
		}
		
		
		
	}

}

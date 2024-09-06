package com.MultiThreading;

class DaemonDemo extends Thread{
	
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		System.out.println(t.getPriority());
		
		for(int i=1; i<=10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DaemonExample {
	
	public static void main(String[] args) {
		
		DaemonDemo d = new DaemonDemo();
		
		d.setDaemon(true);
		d.start();
	
//    	Thread t = Thread.currentThread();
//		t.setDaemon(true);
    	
    	
		
/*
  we can not set main method as daemon thread because main thread start via jvm
 */
		
		for(int i=1; i<=5; i++) {
			System.out.println("Parent thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}

package com.MultiThreading;

class Daemon extends Thread{
	
	public void run() {
		
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
		
		
		if(t.isDaemon()) {
			System.out.println("It is a Daemon thread");
		}
		
	}
	

	
	
}



public class DaemonThread {
	
	public static void main(String[] args) {
		
		Daemon d = new Daemon();
		
		
		d.setDaemon(true);   
		
		d.start();
		
		
//		System.out.println(Thread.currentThread().getName());
		
		/* if we comment the above line then it does not give any output because daemon thread 
		run in the background   because here there is no task assigne to main method or main thread
		
		hence daemon thread depends on main thread
		*/
		
		
		
		
	}

}

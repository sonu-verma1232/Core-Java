package com.homeWork;

public class PatternImpliment implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		PatternImpliment pi = new PatternImpliment();
		
		Thread t = new Thread(pi);
		
		t.start();
	}
	

}

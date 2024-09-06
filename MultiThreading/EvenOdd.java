package com.MultiThreading;

import java.util.Scanner;

class EvenOddDemo extends Thread {
	String  name;
	
	EvenOddDemo(String name){
		this.name = name;
		
	}
	
	public void run() {
		for(int i=1; i<=20; i++) {
			if(name.equals("even") && i%2 == 0) {
				System.out.println(name +" : "+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(name.equals("odd") && i%2 != 0) {
				System.out.println(name+" : "+ i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}

public class EvenOdd {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string name : ");
		String name = sc.nextLine();
		
		EvenOddDemo e1 = new EvenOddDemo(name);
		e1.start();
		
		try {
			e1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		EvenOddDemo e2 = new EvenOddDemo(name);
		e2.start();
		
		sc.close();
		
	}

}

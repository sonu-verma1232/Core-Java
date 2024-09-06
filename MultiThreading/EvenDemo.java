package com.MultiThreading;

import java.util.Scanner;

class Even extends Thread{
	int number;
	
	Even(int number){
		this.number = number;
	}
	public void run() {
		

		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
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

public class EvenDemo {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int number = sc.nextInt();
	    
	    Even e = new Even(number);
	    
	    e.start();
	    
	    
	    sc.close();
	}

}

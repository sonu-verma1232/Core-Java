package com.homeWork;

import java.util.Scanner;

class Pattern2 extends Thread{
	
      String name;
      
      Pattern2(String name){
    	  this.name = name;
      }
      
      public void run() {
    	  
    	  for(int i=0; i<name.length(); i++) {
    		  for(int j=0; j<=i; j++) {
    			  System.out.print(name.charAt(j)+" ");
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
	
}



public class PatternChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name: ");
		String name = sc.nextLine();
		
		Pattern2 p = new Pattern2(name);
		
		p.start();
		
		sc.close();
		
		
	}

}

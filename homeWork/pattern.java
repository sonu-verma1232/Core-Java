package com.homeWork;


class Pattern1 extends Thread
{
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
}


public class pattern {
	
	public static void main(String[] args) {
		
		Pattern1 p = new Pattern1();
		
		p.start();
		
	}

}

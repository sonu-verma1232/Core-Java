package com.Exception_Handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example2 {
	
	public static void main(String[] args) {
		
		try {
			
			
		PrintWriter p = new PrintWriter("e://obc.txt");
		
		
		}
		
		catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
			
			
    		}
	}

}

package com.Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Example 
{
	void display() throws FileNotFoundException
	{
		FileInputStream f = new FileInputStream("e://abc.text");
	}
}



public class ThrowsExample1 {
	
	public static void main(String[] args) {
		
		
		Example e = new Example();
		
		try {
			e.display();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Hello");
		
		}

}

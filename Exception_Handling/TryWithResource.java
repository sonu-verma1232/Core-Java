package com.Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
	
	public static void main(String[] args) {
		
// In this we close the resource explicitly by using finally block code.
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.println("Enter your name ");
//		try {
//			String name = br.readLine();
//			System.out.println("My name is "+name);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		finally {
//			if(br!=null)
//			{
//				try {
//					br.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		
		
		
		
		
//  Try with resource
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter your name ");
			String name = br.readLine();
			System.out.println("My name is "+name);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}

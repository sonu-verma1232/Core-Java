package com.Streaming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedClass {
	
	public static void main(String[] args) {
		
		

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:\\input.txt"))))   // we can also pass here reference of file.
		{
			
			
			System.out.println("Enter your name : ");
			String name = br.readLine();
			
			
			System.out.println("Enter your email : ");
			String email = br.readLine();
			
			System.out.println("Enter your phoneNumber : ");
			String number = br.readLine();
			
			
			// Write in file
			
			bw.write(name+"\t");
			
			bw.write(email+"\t");
			bw.write(number+"\t");
			
			
			System.out.println("Data written successfully ! ");
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		
		
	}
	

}

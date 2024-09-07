package com.Streaming;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	
	public static void main(String[] args) {
		
		File f = new File("E:\\ stream.txt");
		
		try {
			if(f.createNewFile())
			{
				System.out.println("File created successfully.");
			}
			else {
				
				System.out.println("File already exist.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

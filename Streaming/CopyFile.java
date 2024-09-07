package com.Streaming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fi = new FileInputStream("E:\\Original.txt");
		
		FileOutputStream fo = new FileOutputStream("E:\\Copy.txt");
		
		
		int d = 0;
		try {
			while  ((d=fi.read()) != -1)
			{
				
				fo.write(d);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("File copied successfully.");
		
	}
	
	

}

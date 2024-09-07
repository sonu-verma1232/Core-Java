package com.Streaming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos = new FileOutputStream("E:\\stream.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student1 st = new Student1("Sonu Verma", "sv@gmail.com", "4152634565");
		
		oos.writeObject(st);      // serialization
		
		
		System.out.println("Object has been written ");
		
		
	}

	
}

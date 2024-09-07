package com.Streaming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream  fis = new FileInputStream("E:\\stream.txt");
		
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Student1 s = (Student1) ois.readObject();   
			
			System.out.println(s.getName());
			System.out.println(s.getNumber());
			System.out.println(s.getEmail());
		}
		
		
	}
	

}

package com.abstraction;

public class BookDemo3 {
	
	public static void main(String[] args) {
		
//		JavaBook3 j = new JavaBook3();
//		j.setDetails("DevDatpatnik ", 1250);
//		j.getDetails();
//		j.read();
//		j.markText();
//		
//		
//		System.out.println("----------------------Second class------------------------------");
//		
//		Novel3 n = new Novel3();
//		
//		n.setDetails("Ravindra Nath Tagore", 1550);
//		n.getDetails();
//		n.read();
//		n.markText();
//		
		
		
		// BY using Run time polymorphism
		
		
		Book3 b = null;
		
		b = new JavaBook3();
		b.setDetails("DevDatpatnik ", 1250);
		b.getDetails();
		b.read();
		b.markText();
		
		System.out.println("********** Second Class **********");
		
		
		b = new Novel3();
		b.setDetails("Ravindra Nath Tagore", 1550);
		b.getDetails();
		b.read();
		b.markText();
		
		
	}

}

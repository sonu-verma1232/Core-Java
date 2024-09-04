package com.Interface;

public class Student7 implements  Writer7 ,Reader7
{

	@Override
	public void read() {
		String n = Reader7.COUNTRY_NAME;
		System.out.println("Student read about your country "+ n);
	}
    
	@Override
	public void write() {
		String n = Writer7.STATE_NAME;
		System.out.println("Student start writing essay on your state "+n);
	}

	@Override
	public void editText() {
		System.out.println("Student edit your essay due to spelling mistake");
	}

	public static void main(String[] args) {
		
		Student7 s = new Student7();
		
		s.read();
		s.write();
		s.editText();
	}
}

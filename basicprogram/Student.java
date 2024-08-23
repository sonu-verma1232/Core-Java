package com.basicprogram;

public class Student {
	String name,email,city;
	int rollno ;
	
	void setDetails(String name,String email,String city,int rollno) {
		this.name = name;
		this.email = email;
		this.city = city;
		this.rollno = rollno;
	}
	
	void display() {
		System.out.println("Student name is "+ name);
		System.out.println("Student email is "+ email);
		System.out.println("Student city is "+ city);
		System.out.println("Student rollno is "+ rollno);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setDetails("Sonu Verma","sv@gmail.com","Lmp",65);
		s.display();
	}

}

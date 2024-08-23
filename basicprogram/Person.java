package com.basicprogram;
import java.util.*;

public class Person {
	String name, email,phoneNo,address;
	
	void setDetails(String name,String email,String phoneNo,String address) {
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void display () {
		System.out.println("Person name is : "+name);
		System.out.println("Person's email id is : "+email);
		System.out.println("Person's phone number is : " + phoneNo);
		System.out.println("Person's address is : "+ address);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the person : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the email of the person : ");
		String email = sc.nextLine();
		
		System.out.println("Enter the phone number of the person : ");
		String phoneNo = sc.nextLine();
		
		System.out.println("Enter the address of the person : ");
		String address = sc.nextLine();
		
		Person p = new Person();
		
		p.setDetails(name, email, phoneNo, address);
		
		p.display();
		
		sc.close();
	}

}

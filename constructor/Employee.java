package com.constructor;

public class Employee {
	
	String name , city , email , phone , eid;
	double salary;
	
	Employee(String name, String city, String email, String phone, String eid, double salary){
		this.name = name;
		this.city = city;
		this.email = email;
		this.phone = phone;
		this.eid = eid;
		this.salary = salary;
		
	}
	
	void getInfo() {
		
		System.out.println("Employee name is : "+name);
		System.out.println("Employee city is : "+city);
		System.out.println("Employee phone is : "+phone);
		System.out.println("Employee email is : "+email);
		System.out.println("Employee id is : "+eid);
		System.out.println("Employee salary is : "+salary);
		
	}

}

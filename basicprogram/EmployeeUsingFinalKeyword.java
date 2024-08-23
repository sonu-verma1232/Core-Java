package com.basicprogram;

public class EmployeeUsingFinalKeyword {
	
	String name , e_id , number;
	final static String COMPANYNAME = "HCL";
	
	public EmployeeUsingFinalKeyword(String name, String e_id , String number) {
		
		this.name = name;
		this.e_id = e_id;
		this.number = number;
		
	}
	
	void display() {
		
		System.out.println("Name of Employee is : "+name);
		System.out.println("E_id of Employee is : "+e_id);
		System.out.println("Number of Employee is : "+number);
		System.out.println("Company Name of Employee is : "+COMPANYNAME);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Raj", "raj123", "1425364152");
		
		Employee e2 = new Employee("Sonu", "sonu123", "1425475869");
		
		Employee e3 = new Employee("Monu", "monu123", "4561264152");
		
		System.out.println("-------e1--------");
		e1.display();
		
		System.out.println("-------e2--------");
		e2.display();
		
		System.out.println("-------e3--------");
		e3.display();
          
//		Employee.companyName = "BBD";   It is a final variable that's why we can't change the value
 }
}
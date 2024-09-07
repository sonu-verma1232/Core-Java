package com.Streaming;

import java.io.Serializable;

public class Employee implements Serializable  // it is a marker interface
{
	
	
	private String name, department;
	private float salary;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	

}

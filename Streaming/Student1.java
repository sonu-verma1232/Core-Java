package com.Streaming;

import java.io.Serializable;

public class Student1  implements Serializable {
	
	private String name, email;
	transient String number;

	public Student1(String name, String email, String number) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getNumber() {
		return number;
	}
	
	
	
	

}

package com.inheritance;

public class DeveloperDemo {
	
	public static void main(String[] args) {
		
		
		FullStackDeveloper f = new FullStackDeveloper();
		f.setData("Sohan", "1425366545");
		f.setDeveloperData("sohan123","Google" , 250000);
		f.setInfo("MERN");
		
		f.getData();
		f.getDeveloperData();
		f.getInfo();
	}

}

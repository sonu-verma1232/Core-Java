package com.basicprogram;


class abc {
	
	static void display () {
		
		System.out.println("It is a parent class static method");
		
	}
}



public class StaticDot extends abc {
	
	// we can not override static method
//	
//	@Override
//    static void display () {
//		
//		System.out.println("It is a child class static method");
//		
//	}
	
    void getInfo() {
		
		System.out.println("It is an instance method");
		
	}
	
	 public static void main(String[] args) {
		
		
		
		
		StaticDot s = new StaticDot();
		
		s.getInfo();
		
		
		StaticDot.display();
		
		
		
		
	}

}

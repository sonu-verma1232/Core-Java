package com.lambda;

interface Singing
{
	
	public void sing();
	
}


interface Reading
{
	
	public void readBook(String name);
	
}

public class LambdaDemo {

	public static void main(String[] args) {
		
//		Singing s=()->{
//			// method body
//			System.out.println("Sing a song ");   
//			
//		};
//		
//		s.sing();
		
	
		// Optimize code
		
		Singing s=()-> System.out.println("Sing a  song ");  
		
		s.sing();
		
//		Reading r = (name) -> {
//			// do not need to use parameter dataType
//			System.out.println("Book name is "+name);
//			
//		};
//		
//		r.readBook("Wings Of Fire");
//		
		
		
		// Optimize code
		
		
		Reading r=name->System.out.println("Book name is "+name);
		r.readBook("Wings Of Fire");
		
	}
	
}

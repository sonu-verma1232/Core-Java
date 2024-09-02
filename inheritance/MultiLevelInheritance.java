package com.inheritance;


 class Animal1 
 {
	 
	 void eat() {
		 
	    System.out.println("Animal eats....");
		 
	 }
	 
 }
 
 class Lion extends Animal1
 {
	 
	 void roar() {
		 
		 System.out.println("Lion roars......");
		 
	 }
	 
 }

 
 class Cub extends Lion
 {
	 
	 void cry() {
		 
		 System.out.println("Cub cries..........");
		 
	 }
	 
 }
 
 
public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		
		Cub c = new Cub();
		c.eat();
		c.roar();
		c.cry();
	}

}

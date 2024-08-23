package com.basicprogram;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number :");
		int a = sc.nextInt();
		
		System.out.println("Enter your second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter your operator +,-,*,/ :");
		char op = sc.next().charAt(0);
		
		switch(op) {
		
		case '+':
			int sum = a+b;
			System.out.println("Sum is : "+sum);
			break;
			
		case '-':
			int sub = a-b;
			System.out.println("Subtraction is : "+sub);
			break;
		
		case '*':
			int mul = a*b;
			System.out.println("Multiplication is : "+mul);
			break;
			
		case '/':
			int division = a/b;
			System.out.println("Division is : "+division);
			break;
			
		default :
			System.out.println("Invalid operator ");
		
		}
		sc.close();
		
	}

}

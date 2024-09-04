package com.Interface;
import java.util.Scanner;

public class Scientist3 implements DeviceFinder3 , WeatherForeCaster3{
	
	String name,organization;

	public Scientist3(String name, String organization) {
		
		this.name = name;
		this.organization = organization;
	}
	
	void getDetails() {
		System.out.println("Name of the scientist is : "+name);
		System.out.println("Organization name is : "+ organization);
	}

	@Override
	public void checkWeather(int humidity) {
		if(humidity > 0 && humidity <= 30) {
			System.out.println("It is Winter season");
		} 
		else if(humidity > 30 && humidity <= 70) {
			System.out.println("It is Summer season");
		} 
		else if(humidity > 70 && humidity <= 100 ) {
			System.out.println("It is Rainy season");
		}
		else {
			System.out.println("Please enter humidity in range 0 to 100");
		}
		
	}

	@Override
	public void useDevice(int temp) {
         if( temp > 0 && temp <= 20) {
        	 System.out.println("Use blower/warmer");
         }
         else if (temp > 20 && temp <= 30) {
        	 System.out.println("Use fan/cooler");
         }
         else if ( temp > 30 && temp <= 60){
        	 System.out.println("Use AC");
         }
         else {
        	 System.out.println("Please enter temperature in range 0 to 60");
         }
       
		
	}
	
	
	public static void main(String[] args) {
		String name,org;
		int humidity,temp;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the name of the scientist ");
		name = sc.nextLine();
		System.out.println("Enter the name of the organization ");
		org = sc.nextLine();
		
		System.out.println("Enter the temperature ");
		temp = sc.nextInt();
		System.out.println("Enter the humidity ");
		humidity = sc.nextInt();
		
		Scientist3 s = new Scientist3(name, org);
		s.getDetails();
		s.useDevice(temp);
		s.checkWeather(humidity);
		
		sc.close();
		
	}
	

}

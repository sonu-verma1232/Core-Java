package com.basicprogram;

public class VolumeCalculation {    
	
	
	void volume(double radius) {
		
		double v = (4.0/3)*3.14*radius*radius*radius;
		System.out.println("Volume of the sphere is : "+v);
		
	}
	
	
	void volume(double height , double radius) {
		
		double v = 3.14*radius*radius*height;
		System.out.println("Volume of the cylinder is : "+ v);
		
	}
	
	
	void volume(double  length,double breadth, double height) {
		
		double v = length*breadth*height;
		System.out.println("Volume of the cuboid is : "+v);
		
	}

}

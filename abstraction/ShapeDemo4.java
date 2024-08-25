package com.abstraction;



public class ShapeDemo4 {
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setDetails(5);
		c.area();
		c.perimeter();
		c.volume();
		
		
		Rectangle r = new Rectangle();
		r.setDimension(2, 3);
		r.area();
		r.perimeter();
		r.volume();
		
		Cube s = new Cube();
		s.setSide(5);
		s.area();
		s.perimeter();
		s.volume();
		
	}

}

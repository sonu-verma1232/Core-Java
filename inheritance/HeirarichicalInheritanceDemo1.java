package com.inheritance;


public class HeirarichicalInheritanceDemo1 {
	
	public static void main(String[] args) {
		
		
		TwoWheeler1 t = new TwoWheeler1();
		
		t.setVehical("White", 85000);
		t.setDetails("Honda Shine", 5, 200);
		t.getVehicalDetails();
		t.display();
		
		System.out.println("----------------------------------------");
		
		FourWheeler1 f = new FourWheeler1();
		
		f.setDetails("Kia Carens", 7);
		f.setVehical("White", 1800000);
		f.getVehicalDetails();
		f.display();
		
	}

}

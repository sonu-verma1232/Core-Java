package com.inheritance;

public class MobileDemo {
	
	public static void main(String[] args) {
		
		SmartPhone s = new SmartPhone();
		
		s.setInfo("Samsung", 15000,"M-34" );
		s.setSmartPhoneInfo(" Android 14","50MP" );
		s.getMobileInfo();
		s.getSmartPhoneInfo();		
	}
	
	

}

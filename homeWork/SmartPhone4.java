package com.homeWork;

public class SmartPhone4 extends Mobile4


{
	
	String osName, cameraResolution;
	
	void setMobileInfo(String osName, String cameraResolution)
	
	{
		
		this.cameraResolution = cameraResolution;
		this.osName = osName;
		
	}
	
	void getMobileInfo()
	{
		
		super.getMobileInfo();
		System.out.println("OS name is : "+ osName);
		System.out.println("Camera resolution is : "+ cameraResolution);
	}
	
	

}

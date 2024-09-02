package com.inheritance;

public class SmartPhone extends Mobile
{
	
	String osName, cameraResolution;
	
	void setSmartPhoneInfo(String osName, String cameraResolution)
	{
		
		this.osName = osName;
		this.cameraResolution = cameraResolution;
		
	}
	
	
	void getSmartPhoneInfo()
	{
		
		System.out.println("OS name is : "+ osName);
		System.out.println("Camera resolution is : "+ cameraResolution);
		
	}

}

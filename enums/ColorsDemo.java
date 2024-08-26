package com.enums;

public class ColorsDemo {
	
	
	public static void main(String[] args) {
		
		TrafficSignal ts = new TrafficSignal(Colors.RED);
		ts.showMeaning();
		
	}
	

}

class TrafficSignal
{
	
	Colors color;
	public TrafficSignal(Colors color)
	{
		
		this.color = color;
		
	}
	
	public void showMeaning()
	{
		
		switch(color)
		{
		
		case RED:
			System.out.println("Stop");
			break;
		
		case GREEN:
			System.out.println("Go");
			break;
			
		case YELLOW:
			System.out.println("Ready to go");
			break;
			
		default:
			System.out.println("does not belong to traffic signal color");
		
		}
		
	}
	
}

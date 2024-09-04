package com.Interface;

public interface Listener4 {
	
	void listen();

}

class Crowd implements Listener4
{

	@Override
	public void listen() {
		System.out.println("It is a crowd voice.");
		
	}
	
}


class Audience implements Listener4
{

	@Override
	public void listen() {
		System.out.println("It is an audience voice.");
		
	}
	
}

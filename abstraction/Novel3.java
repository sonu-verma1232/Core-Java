package com.abstraction;

public class Novel3  extends Book3
{

	@Override
	void read() {
        
		System.out.println("Reading Gitanjali book----");
		
	}

	@Override
	void markText() {
      
		System.out.println("Marking first paragraph.");
	}

}

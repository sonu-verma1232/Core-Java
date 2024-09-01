package com.homeWork;

import java.util.ArrayList;

public class CollectionInterger {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new  ArrayList<>();
		
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(8);
		System.out.println(arr);
		
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		boolean b = arr.contains(4);
		System.out.println(b);
		
        System.out.println(arr.remove(1));  
        System.out.println(arr);
        
        arr.add(4);
        System.out.println(arr);
        
        System.out.println(arr.get(3));
        
        System.out.println(arr.set(0, 10));
        System.out.println(arr);
        
        arr.add(0, 2);
        System.out.println(arr);
        
        arr.remove(1);
        System.out.println(arr);
        
        arr.remove(new Integer(6));         // remove element using object
        System.out.println(arr);
        
       
	
		
	}

}

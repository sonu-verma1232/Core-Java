package com.homeWork;

import java.util.ArrayList;


class CollectionList {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Ayush");
		a.add("Sonu");
		a.add("Monu");
		a.add("Arun");
		a.add("Vibhu");
		a.add("Ayush");
		
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains("Sonu"));
		System.out.println(a.remove("Ayush"));
		System.out.println(a);
		a.add("Raj");
		a.add("Ayush");
		System.out.println(a);
		System.out.println(a.remove(6));
		System.out.println(a);
		
		// methods of ArrayList
		
		System.out.println(a.get(4));
		
		System.out.println(a.set(4,null ));
		System.out.println(a);
		
		a.add(2, "Vaish");
		System.out.println(a);
		
		a.remove(2);
		System.out.println(a);
		
		
		
		
	}
	
	
}

package com.learning.examples.java8;

import java.util.*;

public class IterableForEachEx {
	public static void main(String... args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Orange");
		//First way to iterate with lamda
		list.forEach(t->{System.out.println(t);});
		
		//Second way to iterate
		list.forEach(System.out::println);
		
		//For each with condition
		list.forEach(t->{if(t.startsWith("A")) System.out.println(t);});
		
		
		
	}

}

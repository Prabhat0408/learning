package com.learning.examples.java8;

import java.util.*;

public class MapForEachEx {
	public static void main(String args[]) {
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		/*  old Method
		 * for(Map.Entry<Integer, String> entry : map.entrySet()) { int key = (int)
		 * entry.getKey(); System.out.println("Key Is "+ key +
		 * " Value is "+entry.getValue()); }
		 */
		
		//  One Way for parathesis
		//map.forEach((k,v)->{ System.out.println("Key = " + k + ", Value = " + v);});
		
		map.forEach((k,v)->System.out.println("Key = " + k + ", Value = " + v));
		
		
		
		
	}
}

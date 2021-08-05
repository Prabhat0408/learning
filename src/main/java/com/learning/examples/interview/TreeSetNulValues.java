package com.learning.examples.interview;

import java.util.HashSet;

public class TreeSetNulValues {
	
	public static void main(String...strings) {
		/*
		 * TreeSet ts = new TreeSet(); ts.add(null); System.out.println(ts);
		 */
		
		HashSet ts = new HashSet(); 
		ts.add(null);
		ts.add("1");
		ts.add(null);
		System.out.println(ts);
		}

}

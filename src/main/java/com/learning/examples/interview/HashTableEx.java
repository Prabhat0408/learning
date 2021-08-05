package com.learning.examples.interview;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");

		/*
		 * for (Entry<Integer, String> entry : ht.entrySet()) { int key = (int)
		 * entry.getKey();
		 * 
		 * if (key == 1) { System.out.println(entry.getValue()); } }
		 */
		
		/*
		 * Iterator<Map.Entry<Integer, String>> itr = ht.entrySet().iterator();
		 * while(itr.hasNext()) { Map.Entry<Integer,String> entry = itr.next(); int key
		 * = (int) entry.getKey(); if (key == 1) { System.out.println(entry.getValue());
		 * } }
		 */		
		
		ht.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));

	}

}

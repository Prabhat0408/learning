package com.learning.examples.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {
	
	public static void main(String ...strings ) {
	 Map<Integer,String> map = new HashMap<Integer,String>();
	 map.put(1,"pk");
	 map.put(2,"pk");
	 map.put(3,"pk");
	 
		/*
		 * for(Map.Entry<Integer,String> entry: map.entrySet()) {
		 * System.out.println(entry.getKey()); }
		 */
	//Imporatnt method
	 map.containsKey("1");
	 map.putIfAbsent(1, "pk");
	
	 
	 Iterator<Entry<Integer,String>> itr =map.entrySet().iterator();
	 while(itr.hasNext()) {
		 Entry<Integer,String> entry= itr.next();
		 System.out.println(entry.getKey());
	 }	 
	}
	
	
	

}

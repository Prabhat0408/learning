package com.learning.examples.interview;


import java.util.*;

public class ListIteratorExmaple {
private static List<Integer> list= new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int len = (int)Math.floor(Math.random()*10+2);
		System.out.println(len);
		for(int i =0;i<len;i++) {
			int len1 = (int)Math.floor(Math.random()*10+1);
			list.add(len1);
		}
		
		/*
		 * for(int i: list) { System.out.println(i); }
		 */
		
		System.out.println(list);
		ListIterator<Integer> l = list.listIterator();
		while(l.hasNext()) {
			//Infinite loop situation
			/*
			 * System.out.print(" List Iterator Forward:"+(Integer)l.next());
			 * System.out.print(" List Iterator Forward:"+(Integer)l.previous());
			 */
			
			//iterator with index
			
			  System.out.println(" List Iterator Forward:"+(Integer)l.next());
			  System.out.println(" List Iterator next index:"+ l.nextIndex());
			 
			
			//iterator with illegal state exception
			/*
			 * System.out.print(" List Iterator Forward:"+(Integer)l.next()); l.set(100);
			 * l.remove(); l.set(101);
			 * 
			 * System.out.println(list);
			 */
		
			//System.out.print(" List Iterator Forward:"+(Integer)l.next());
			
		}
		
		  list.set(1, 100);
		  System.out.println(list);
		 
		  while(l.hasPrevious()) {
		 System.out.println(" List Iterator previous:"+(Integer)l.previous()); }
		 
	}

}

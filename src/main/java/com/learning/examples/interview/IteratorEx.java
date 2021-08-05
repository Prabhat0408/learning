package com.learning.examples.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {
	private static List<Integer> list= new ArrayList<Integer>();
	public static void main(String...strings) {
		int len = (int)Math.floor(Math.random()*10+2);
		System.out.println(len);
		for(int i =0;i<len;i++) {
			int len1 = (int)Math.floor(Math.random()*10+1);
			list.add(len1);
		}
		System.out.println(list);
		/*
		 * for(int i: list) { System.out.println(i); }
		 */
		
		//list.forEach(System.out::println);
		
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(itr.nextIndex());
		}
	}

}

package com.learning.examples.interview;


import java.util.*;

public class ConcurrentModiArrayList {
	private static List<Integer> list= new ArrayList<Integer>();
	
	public static void main(String[] args) {
		int len = (int)Math.floor(Math.random()*10+2);
		System.out.println(len);
		for(int i =0;i<len;i++) {
			int len1 = (int)Math.floor(Math.random()*10+1);
			list.add(len1);
		}
		
		for(int i: list) {
			System.out.println(i);
		}
		
		
		Iterator<Integer> itr = list.iterator();
		//concurrent modification exmaple
		/*
		 * while(itr.hasNext()) { int i =0; System.out.println("iterator"+itr.next());
		 * i=i+1; itr.remove(); //System.out.println(" After iterator"+itr.next());
		 * list.add(i);
		 * 
		 * }
		 */
		
		
		//Illegalstateexcpetion exmaple...remove method called first
		/*
		 * while(itr.hasNext()) {
		 * 
		 * itr.remove(); System.out.println("iterator"+itr.next());
		 * 
		 * }
		 */
		
		
		//No Such Element exmaple...after calling remove method, moving cursor to next element and then hasElement
		/*
		 * while(itr.hasNext()) {
		 * 
		 * 
		 * System.out.println("iterator"+itr.next()); itr.remove();
		 * System.out.println("iterator"+itr.next());
		 * 
		 * 
		 * }
		 */
		
		
while(itr.hasNext()) {
			
			
			System.out.println("iterator"+itr.next());
			
			System.out.println("iterator"+itr.next());
			
			
		}
		
		
		
		
	}
	

}

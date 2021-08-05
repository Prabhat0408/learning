package com.learning.examples.interview;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedPollPeekRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>(); 
		
		ll.add("prabhat");
		
		// If list is empty
		
		// wil throw execption
		//System.out.println(ll.removeFirst());
		
		
		//retruns null
		//System.out.println(ll.peekFirst());
		
		
		//retrun null
		//System.out.println(ll.pollFirst());
		
		
		//difference between poll ,peek remove
		/*
		 * System.out.println(ll.pollFirst());
		 *  System.out.println(ll.size());
		 */
		
		
		
		/*
		 * System.out.println(ll.peekFirst()); System.out.println(ll.size());
		 */
		  
		  System.out.println(ll.removeFirst());
		  System.out.println(ll.size());
	}

}

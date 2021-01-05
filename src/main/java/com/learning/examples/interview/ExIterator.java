package com.learning.examples.interview;


import java.util.*;

public class ExIterator {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        
        ArrayList<String> list1=new ArrayList<String>();//Creating arraylist  
        list1.add("Ravi");//Adding object in arraylist  
        list1.add("Vijay");  
        list1.add("Ravi");  
        list1.add("Ajay");  
        
         
        System.out.println("Traversing list through List Iterator:");  
        
        Iterator<String> itr = list.iterator();
		/*
		 * //Method 1 iterating in Java list list.forEach(str ->
		 * System.out.println(str));
		 */
        
        //Method 2 Iterating in java list
        list.forEach(System.out::println);
        
        System.out.println("Contains all methos  :: "+list.containsAll(list1));
        System.out.println("equal methods :: "+list.equals(list1));
        System.out.println("Binary search methods :: "+Collections.binarySearch(list1, "Vijay"));
        
        
	}

}

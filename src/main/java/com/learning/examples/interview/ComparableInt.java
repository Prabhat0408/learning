package com.learning.examples.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparableInt {
	
	public static void main(String ...strings ) {
		ArrayList<String> ArrLis = new ArrayList<String>();

		// Add elements
		ArrLis.add("Ram");
		ArrLis.add("Shyam");
		ArrLis.add("Sita");
		ArrLis.add("Gopal");
		Collections.sort(ArrLis);
		//ArrLis.forEach(System.out::println);
		
		
		TreeSet<String> set= new TreeSet<String>();
		set.add("Ram");
		set.add("Shyam");
		set.add("Sita");
		set.add("Gopal");
		
		
		set.forEach(System.out::println);
		
	}
	


}

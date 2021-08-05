package com.learning.examples.interview;

import java.util.stream.Stream;

public class JustFortest {
	
	public static void main(String...strings ) {
		String str = "0098,tm,ixh,000.98,cusip,mch";
		/*
		 * System.out.println(str.replace(",", "/")); str =str.replace(",", "/"); String
		 * [] arr = str.split("\\/");
		 */
		
		//str =str.replace(",", "$");
		str =str.replace(",", "^");
		//String[] arr = str.split("\\$");
		String[] arr = str.split("\\^");
		Stream<String> stream = Stream.of(arr);
		stream.forEach(t->System.out.println(t));
		
		
		System.out.println(1%10);
	}

}

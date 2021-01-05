package com.learning.examples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamBuilder {
	
	public static void main(String... args) {
		/*
		 * Stream of fixed number 
		 * Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7);
		 * 
		 * // with for each 
		 * stream.forEach(System.out::println);
		 * 
		 * //with lamda expression 
		 * stream.forEach(t->System.out.println(t));
		 */
		
		/*
		 * Steam of array Stream<Integer> stream = Stream.of(new Integer[] {1,2,3,4,5});
		 * stream.forEach(t->System.out.println(t));
		 */
		
		
		/*
		 * Streams of List List<Integer> list = new ArrayList<Integer>(); for(int i
		 * =0;i<6;i++) { list.add(i*2); }
		 * 
		 * Stream<Integer> stream = list.stream();
		 * stream.forEach(t->System.out.println(t));
		 */
		
		
		Stream<Integer> stream = Stream.generate(()->(new Random()).nextInt(100));
		
		//stream.forEach(t->System.out.println(t));
		
		stream.limit(20).forEach(System.out::println);
	}

}

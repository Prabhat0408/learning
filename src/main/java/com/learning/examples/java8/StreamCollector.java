package com.learning.examples.java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {
	public static void main(String ...strings ) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<11;i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		List<Integer> evenList = stream.filter(t -> t%2 == 0).collect(Collectors.toList());
		evenList.forEach(System.out :: print);
		
		
		//Collect Stream Element into Array
		
		Stream<Integer> stream1 = list.stream();
		Integer[] eveArr= stream1.filter(t -> t%4==0).toArray(Integer[]:: new);
		System.out.println(eveArr);
		Stream<Integer> streamArr = Stream.of(eveArr);
		streamArr.forEach(System.out:: print);
		
		
		List<String> listStr = new ArrayList<String>();
		listStr.add("RAM");
		listStr.add("Naveen");
		listStr.add("Arun");
		listStr.add("Anup");
		
		Stream<String> streamStr = listStr.stream();
		
		String[] arr= streamStr.filter((t) -> t.startsWith("A")).toArray(String[]:: new);
		for(String s: arr) {
			System.out.println(s);
		}
	
	}

}

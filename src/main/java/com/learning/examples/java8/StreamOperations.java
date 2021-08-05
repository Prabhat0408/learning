package com.learning.examples.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
public static void main(String ...strings ) {
	List<String> listStr = new ArrayList<String>();
	listStr.add("RAM");
	listStr.add("Naveen");
	listStr.add("Arun");
	listStr.add("Anup");
	
	Stream<String> streamStr = listStr.stream();
	
	/*//Filter Exmaple with array
	String[] arr= streamStr.filter((t) -> t.startsWith("A")).toArray(String[]:: new);
	for(String s: arr) {
		System.out.println(s);
	*/
	
	//Map Example 
	//streamStr.filter(t ->t.startsWith("A")).map(i ->i.toUpperCase()).forEach(System.out :: println);
	
	//Sorted Function
	streamStr.filter(t ->t.startsWith("A")).sorted().map(i ->i.toUpperCase()).forEach(System.out :: println);


}
}

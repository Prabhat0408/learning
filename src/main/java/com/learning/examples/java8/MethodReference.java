package com.learning.examples.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReference {
public static void main(String[] args) {
	List<Integer> integers = Arrays.asList(1,12,433,5);
    //sttaic refrence
	Optional<Integer> max = integers.stream().reduce( Math::max ); 
	//max.ifPresent(value -> System.out.println(value));
	//Object ref
	max.ifPresent(System.out::println);
	
	
	//Ref to cinstructor
	List<Integer> list = IntStream
            .range(1, 100)
            .boxed()
            .collect(Collectors.toCollection( ArrayList::new ));
	Optional<Integer> maxNumber = list.stream().reduce(Math::max); 	
	maxNumber.ifPresent(System.out::println); 

	
	
	List<String> strings = Arrays
	        .asList("how", "to", "do", "in", "java", "dot", "com");
	
	//without class ref
	/*List<String> sorted = strings
	        .stream()
	        .sorted((s1, s2) -> s1.compareTo(s2))
	        .collect(Collectors.toList());
	 sorted.forEach(System.out ::println);
	 */
	
	List<String> sorted = strings
	        .stream()
	        .sorted(String::compareTo)
	        .collect(Collectors.toList());
	 sorted.forEach(System.out ::print);
	
}
}

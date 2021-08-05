package com.learning.examples.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GetDuplucateJavaSteam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "aabrrcgahghaourslh";
		String arr[]=str.split("");
		List<String> list = Arrays.asList(arr);
		
		//Arrays.stream(arr).forEach(e->System.out.println(e));
		Set list2=list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		list2.stream().forEach(e -> System.out.print(e));
		;

	}

}

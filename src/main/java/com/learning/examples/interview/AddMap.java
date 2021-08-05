package com.learning.examples.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		Map<Integer,ArrayList<String>> map= new HashMap<Integer,ArrayList<String>>();
		ArrayList<String> list= new ArrayList<String>();
		
		while(i<10) {
			
			list.add("str"+ String.valueOf(i));
			if(i==2) {
				list.add("str"+ String.valueOf(i+2) );	
			}
			if(i==3) {
				list.add("str"+ String.valueOf(i+3) );	
			}
			
			map.put(i,list);
			i++;
		}
		System.out.println(map.get(10));
	}

}

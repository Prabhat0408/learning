package com.learning.examples.interview;

import java.util.ArrayList;

public class ExProgram1 {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();//Creating arraylist  
		list1.add(1);
		list1.add(2);
		list1.add(5);
		list1.add(9);
		list1.add(11);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();//Creating arraylist  
		list2.add(1);
		list2.add(2);
		list2.add(5);
		list2.add(9);
		list2.add(11);
		
		compareList(list1,list2);
	}
//Method to comare 2 array list	
public static void compareList(ArrayList list1,ArrayList list2) {
	int size1 = list1.size();
	int size2= list2.size();
	
	for(int i =0;i<size1;i++) {
		int var = (int) list1.get(i);
		if(!list2.contains(var)){
			System.out.println(var+" is present in list1 ");
		}else {
			System.out.println(var+" is present in both list1 & list2 ");
			int index = list2.indexOf(var);
			list2.remove(index);
			//list1.remove(i); if i remove size than index out of bound error will come
		}
	}
	
	if(list2.size()==0) {
		System.out.println("all items matched in both lit1 & list2");
	}else {
		System.out.println(list1.toString()+"present only in list2");
		System.out.println(list2.toString()+"present only in list2");
	}
	
	
}
		

}

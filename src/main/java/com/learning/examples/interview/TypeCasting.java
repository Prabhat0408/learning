package com.learning.examples.interview;

public class TypeCasting {
	
	public static void main(String[] args) {
		//Widening or automatic from smaller to longer
		byte a=0;
		int b = a;
		System.out.println(b);
		
		int x=1567;
		double y= x;
		System.out.println(y);
		
		
		//narrowing or manually casting  from larger to smaller
		char c ='a';
		byte bite = (byte) c;
		System.out.println(bite);
		
		
		
		
	}

}

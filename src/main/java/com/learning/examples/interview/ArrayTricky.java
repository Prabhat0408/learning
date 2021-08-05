package com.learning.examples.interview;

public class ArrayTricky 
	{
	    public static void main(String[] args)
	    {
	        int[] a = new int[10];
	         
	        int[] b = new int[100];
	         
	        a = b;      //Compiler checks only type, not the size
	        
	        System.out.println(a.length);
	    }
	

}

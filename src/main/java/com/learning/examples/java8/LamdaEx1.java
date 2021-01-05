package com.learning.examples.java8;

public class LamdaEx1 {
	public static void main(String[] args) {
		
		Functional1 obj = ()->System.out.println("My first example of Functional interface");
		
		
		obj.message();
		obj.aboutInterface();
	}
}




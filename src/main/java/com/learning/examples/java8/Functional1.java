package com.learning.examples.java8;

@FunctionalInterface
public interface Functional1 {
	
	 abstract void message();
	 default void aboutInterface() {
		 System.out.println("This is example of functional interface");
	 }
	

}

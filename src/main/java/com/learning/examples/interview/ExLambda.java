package com.learning.examples.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class ExLambda {
    public static void main( String[] args ) {
    
	 // create a list of strings 
	    List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
		/*
		 * //Anonymous class Predicate<String> p = new Predicate<String>() { public
		 * boolean test(String t) { if (t.startsWith("G")) { return true; }else {return
		 * false;} }
		 * 
		 * };
		 */
	    
	    	
	    //lamda function
	    	Predicate<String> p= (str)-> str.startsWith("G");
	    
	    for(String str: names) {
	    	System.out.println(p.test(str));
	    }
    }
}

package com.learning.examples.interview;

public class StringFinal {
	 String str1= "vara";
	 
	// final String str2= this.str1;
	final String str2;
	
	
	
	
	
	//final String str2;
	StringFinal(){
		
		this.str1= this.str1+"prasad";
		this.str2=this.str1;
		
	}
	
	public static void main(String...strings) {
		StringFinal sb = new StringFinal();
		
		
		System.out.println(sb.str2);
	}

}

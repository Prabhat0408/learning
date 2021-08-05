package com.learning.examples.interview;

public class HidingwithPrivate {
	
	public  void main(String...strings) {
		BaseHide b= new BaseHide();
		b.display("Case 1");
		
		BaseHide b2= new derivedHide();
		b2.display("Case 2");
		b2.print("base refrence and subclass method");
		System.out.println(b2.str1);
		
		derivedHide d = new derivedHide();
		System.out.println(d.str1);
		
	}

}

class BaseHide {
	String str;
	String str1= "base";
	final void display(String str) {
		System.out.println("Base string is "+str);
	}
	
	 void print(String str) {
			System.out.println("Base string is "+str);
		}
}

class derivedHide extends BaseHide {
	String str;
	String str1= "value";
	 void display(String str) {
		System.out.println("derviced string is "+str);
	}
	
	  void print(String str) {
		System.out.println("derviced string is "+str);
	}
	
	
}

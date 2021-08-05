package com.learning.examples.interview;
//Constrctor chaining with super
public class ConstructorChaining {
	public static void main(String...strings) {
		derived d = new derived("String1","String2");
		d.display();
		
	}
}

class Base1 {
	String str;
	Base1(){
		System.out.println("Default constructor");
	}
	Base1(String str){
		this();
		this.str= str;
		System.out.println("base constructor with string value "+str);
	}
}

class derived extends Base1{
	String str2;
	derived(String str1,String str2){
		super(str1);
		this.str2= str2;
	}
	public void display(){
		System.out.println(str+"   "+str2);
		
	}
}


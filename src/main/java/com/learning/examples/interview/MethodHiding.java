package com.learning.examples.interview;

public class MethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Child("abc");
		b.print();

	}
	

}

class Base{
	public String var ;
	public String var2="qroxh";
	public Base(String var) {
		this.var= var;
	}
	public void print() {
		System.out.println(var);
	}
}

class Child extends Base{
	public String var;
	Child(String variable){
		super(variable);
		this.var= variable;
	}
	
	public void print() {
		//System.out.println(super.var);
		System.out.println(var);
		System.out.println(var2);
	}
}


package com.learning.examples.interview;

public class HashcodeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashvodeimpl hash1 = new Hashvodeimpl(null);
		Hashvodeimpl hash2 = new Hashvodeimpl("ok");
		Hashvodeimpl hash3 = new Hashvodeimpl(null);
		System.out.println(hash1.hashCode());
		System.out.println(hash2.hashCode());
		System.out.println(hash3.hashCode());
		System.out.println(hash3.equals(hash1));
		System.out.println(hash3.equals(hash2));
	}
	

}

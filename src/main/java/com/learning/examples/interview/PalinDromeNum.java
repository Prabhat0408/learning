package com.learning.examples.interview;

public class PalinDromeNum {

	public static void main(String[] args) {
		
		System.out.println(palindromNum(1001));
		// TODO Auto-generated method stub

	}
	
	public static  int palindromNum(int num) {
		//  int temNum=0;
		  int reverseNum=0;
		  int mod=0;
		  if(num>0) {
			/*
			 * mod= num%10; num= num/10; reverseNum = palindromNum(num)*10+mod;
			 */
			  reverseNum= palindromNum(num/10)*10+num%10;
			  return reverseNum;
		  }else {
			  return reverseNum;
		  }
		
	}
	
	public static  int palindromNumIter(int num) {
		//  int temNum=0;
		  int reverseNum=0;
		  int mod=0;
		  while(num>0) {
			  mod= num%10;
			  reverseNum = reverseNum*10+mod;
			  num= num/10;
		  }  
			  return reverseNum;
		 }

}

package com.learning.questions;

public class PrimeNumber {
	
	public static void main(String...strings) {
		iterPrime(23);
		
		boolean flag = recuPrime(3,4);
		if(flag==false) {
			System.out.println("prime");
		}else {
			System.out.println(" not prime");
		}
		
	}
	
	public static void iterPrime(int num) {
		int temp;
		boolean flag = true;
		if(num>=0 && num<=3) {
			flag = true;
		}else {
			temp=num/2;
			for(int i=4;i<=temp;i++) {
				if(num%i==0) {
					flag= false;
					break;
					
				}
			}
		}
		if(flag == false) {
			System.out.println("given number "+num+" is  not prime");
		}else {
					
				System.out.println("given number "+num+" is prime");
			}
	}
	
	
	public static boolean recuPrime(int num ,int i) {
		boolean flag= false;
		
		
		if(num>=0 && num<=3) {
			flag= false;
		}else if(i<num) {
			if(num%i==0) {
				flag= true;
				return flag;
			}else {
				
				flag= recuPrime(num,i+1);
			}
	}
		return flag;
		
	}



}

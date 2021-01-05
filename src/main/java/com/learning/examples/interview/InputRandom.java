package com.learning.examples.interview;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InputRandom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		//Method 1
		Random rnd = new Random();		
		System.out.println(rnd.nextInt(10));	
		
		//method 2
		System.out.println(Math.random());
		int num2= (int)Math.floor(1+100*Math.random());
		System.out.println(num2);
		
		//Method 3
		int rand_int1 = ThreadLocalRandom.current().nextInt(); 
        int rand_int2 = ThreadLocalRandom.current().nextInt();
        
        System.out.println(Math.abs(rand_int1));
        System.out.println(Math.abs(rand_int2));
	}

}

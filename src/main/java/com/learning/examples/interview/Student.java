package com.learning.examples.interview;

import java.util.Arrays;

public class Student  implements Comparable<Student>{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	public int compareTo(Student st){  
		int result= compare(age,st.age);
		if(result!=0) {
			return result;
		}
		if(result ==0) {
			result= compare(rollno,st.rollno);
		}
		if(result!=0) {
			return result;
		}
		if(result ==0) {
			result = name.compareTo(st.name);
		}
		return result;
	}
		
	
	private int compare(int num1,int num2) {
		if(num1>num2) {
			return 1;
		}else if(num1<num2) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
	public static void main(String...strings)
	{
		Student[] arr= new Student[4];
		arr[0]= new Student(001,"rohit",12);
		arr[1]= new Student(002,"akash",12);
		arr[2]= new Student(001,"prakash",14);
		arr[3]= new Student(003,"pratyush",10);
		System.out.println(arr.toString());
		
		Arrays.sort(arr);
		for(Student st : arr) {
			System.out.println(st.rollno+" :: "+st.name+" :: "+st.age);
		}
	}
}

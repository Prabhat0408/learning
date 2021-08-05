package com.learning.examples.interview;

public class StringReverese {
	
	public static void main(String[] args) {
		String str= "AbcAbcABCDgkhatI";
	printDup("abbcddeeegiihh");
		
		String[] arr= str.split("");
		System.out.println(arr.length);
		boolean flag = true;
		String revStr="";
		String temp=null;
		
		for(int i = str.length()-1;i>=0;i--) {
			temp=new Character(str.charAt(i)).toString();
			
			if(temp== temp.toUpperCase() && i>0) {
				revStr= revStr+temp+"_";
			}else {
				revStr= revStr+temp;
			}
			
			
		}
		System.out.println(revStr);
		
		
	}
	
	public static void printDup(String str){

		String temp="";
		String var= null;
		for(int i=0;i<str.length();i++){
		var= new Character(str.charAt(i)).toString();
		if(!temp.contains(var)){
			temp = temp+ var;
		}
		}
		System.out.println(temp);
		}

	
}

package com.learning.examples.interview;

import java.io.IOException;

public class TryCatchException extends Parent {
	
	 
	
	void msg(){System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new TryCatchException();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
		  
		  
		  
		 
	    
	    } 


class Parent{  
	  void msg()throws IOException{System.out.println("parent");}  
	} 
	   
	
	        
		
		
		
	



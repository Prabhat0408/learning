package com.learning.examples.interview;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumeratorEX {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("One");
		v.addElement(1);
		v.add(1.01);
		
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Iterator<String> itr = v.iterator();
		
	}

}

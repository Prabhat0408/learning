package com.learning.examples.interview;

import java.util.Comparator;

public class TypeComparator implements Comparator {
	@Override
	public int compare(Object o1,Object o2) {
		Cars c1= (Cars) o1;
		Cars c2= (Cars) o2;
		return c1.type.compareTo(c2.type);
		
	}
	

}

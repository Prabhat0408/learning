package com.learning.examples.interview;

import java.util.Comparator;

public class NameComparator implements Comparator {
	  @Override
	    public int compare(Object o1, Object o2) {
	        // TODO Auto-generated method stub
	        Cars c2=(Cars)o2;
	        Cars c1=(Cars)o1;
	        return c1.name.compareTo(c2.name);
	    }

}

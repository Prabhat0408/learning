package com.learning.examples.interview;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesEx {
	
  public static  Set<String> getSysProperties() {
	  Set<String> set= new HashSet<String>();
	  Properties prop= System.getProperties();
	  for(Entry<Object, Object> entry: prop.entrySet()) {
		  set.add((String)entry.getKey());
	  }
	  
	  return set;
	  
  }
  
  public static void main(String...strings ) {
	  getSysProperties().forEach((s)-> System.out.println(s));
  }
}

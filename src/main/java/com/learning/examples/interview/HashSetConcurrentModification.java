package com.learning.examples.interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcurrentModification {
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();

		// add example
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");

		Iterator<String> iterator = fruits.iterator();

		while (iterator.hasNext()) {
			fruits.remove("Orange");
			String fruit = iterator.next();
			System.out.println("Processing " + fruit);

			// wrong way of removing from Set, can throw
			// java.util.ConcurrentModificationException
			/*
			 * if ("Orange".equals(fruit)) { fruits.remove("Orange"); }
			 */
		}
	}

}

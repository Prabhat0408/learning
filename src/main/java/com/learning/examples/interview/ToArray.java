package com.learning.examples.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArray {
	public static void main(String[] args) {

		// create object of ArrayList
		ArrayList<Integer> ArrLis = new ArrayList<Integer>();

		// Add elements
		ArrLis.add(32);
		ArrLis.add(67);
		ArrLis.add(98);
		ArrLis.add(100);

		// print ArrayList
		System.out.println("ArrayList: " + ArrLis);

		// Get the array of the elements
		// of the ArrayList
		// using toArray(T[]) method
		Integer arr[] = new Integer[ArrLis.size()];
		arr = ArrLis.toArray(arr);

		System.out.println("Elements of ArrayList" + " as Array: " + Arrays.toString(arr));
	}

}

package com.learning.examples.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Human {
	String name;
	int age;

	Human() {
		name = "NoName";
		age = 0;
	}

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Comparator<Human> ageComparator = new Comparator<Human>() {
		public int compare(Human h1, Human h2) {
			return h1.getAge() - h2.getAge();
		}
	};
	public static Comparator<Human> nameComparator = new Comparator<Human>() {
		public int compare(Human h1, Human h2) {
			return h1.getName().compareTo(h2.getName());
		}
	};

	public static void main(String[] args) {
		ArrayList<Human> humans = new ArrayList<>();
		humans.add(new Human("Shraman", 21));
		humans.add(new Human("Shubham", 23));
		humans.add(new Human("Pranav", 20));
		humans.add(new Human("Srijan", 19));
		humans.add(new Human("Gourav", 24));
		humans.add(new Human("Amit", 11));
		humans.add(new Human("Raju", 41));
		System.out.println("Before sorting");
		humans.forEach((n) -> System.out.print(n.name + " " + n.age + " \n"));
		System.out.println("\n After Sorting by age");
		Collections.sort(humans, ageComparator);
		humans.forEach((n) -> System.out.print(n.name + " " + n.age + " \n"));
		System.out.println("\n After sorting by Name");

		Collections.sort(humans, nameComparator);
		humans.forEach((n) -> System.out.print(n.name + " " + n.age + " \n"));
	}

}
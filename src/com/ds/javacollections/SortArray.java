package com.ds.javacollections;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		
		return this.age-o.age;
	}
	
	
}

public class SortArray {
	public static void main(String[] args) {
		ArrayList<Person> listOfNames = new ArrayList<Person>();
		listOfNames.add(new Person("Jena", 3));
		listOfNames.add(new Person("laya", 1));
		listOfNames.add(new Person("Hussien", 20));
		System.out.println("Print before sort");
		print(listOfNames);
		Collections.sort(listOfNames);
		System.out.println("Print after sort");
		print(listOfNames);
		
	}
	
	static void print(ArrayList<Person> persons) {
		for(Person person: persons) {
			System.out.println("name: " +person.name);
			System.out.println("age: " +person.age);

		}
	}
}

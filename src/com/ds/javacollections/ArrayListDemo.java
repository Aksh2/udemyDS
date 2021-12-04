package com.ds.javacollections;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String args[]) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("developer");
		ar.add("tester");
		ar.add("manager");
		
		for(String st: ar) {
			System.out.println(st);
		}
		
		ArrayList<Employee> emp = new ArrayList<ArrayListDemo.Employee>();
		emp.add(new Employee("laya", 21));
		emp.add(new Employee("hussian", 25));
		emp.add(new Employee("jena", 1));
		
		for(Employee st: emp) {
			System.out.println(st.name);
		}
	}
	
	static class Employee{
		int age;
		String name;
		Employee(String name, int age){
			this.name = name;
			this.age = age;
		}
	}
}

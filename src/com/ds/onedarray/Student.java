package com.ds.onedarray;

public class Student implements Comparable<Student>{
	public String name;
	public int age;
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Student o) {
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
		else
			return -1;
	}

}

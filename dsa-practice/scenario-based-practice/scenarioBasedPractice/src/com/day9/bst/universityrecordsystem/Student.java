package com.day9.bst.universityrecordsystem;

public class Student {   // node

	public int rollNo;
	public String name;
	Student left, right;
	
	public Student(int rollNo, String name) {
		this.name = name;
		this.rollNo = rollNo;
		left = right = null;
	}
}

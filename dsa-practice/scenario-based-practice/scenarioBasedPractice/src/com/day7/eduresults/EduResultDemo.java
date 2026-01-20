package com.day7.eduresults;

public class EduResultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] students = {new Student("Ritesh", 89), new Student("Ravi", 74), new Student("Swaraj", 93), new Student("Ashish", 53)};
		MergeSort.mergeSort(students, 0, students.length-1);
		
		for(Student student: students) {
			System.out.println(student.name + " - " + student.marks);
		}
	}

}

package com.objectmodelling.schoolandstudent;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Aggregation
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("Student ID: " + s.getStudentId() +
                               ", Name: " + s.getName());
        }
    }
}

package com.objectmodelling.schoolandstudent;

import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseName;
    private ArrayList<Student> students;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("Student ID: " + s.getStudentId() +
                               ", Name: " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

package com.objectmodelling.schoolandstudent;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String name;
    private ArrayList<Course> courses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Student Name: " + name);
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.getCourseName());
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

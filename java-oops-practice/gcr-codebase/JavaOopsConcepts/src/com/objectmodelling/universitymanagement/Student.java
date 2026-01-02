package com.objectmodelling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int studentId;
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Association: Student ↔ Course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}

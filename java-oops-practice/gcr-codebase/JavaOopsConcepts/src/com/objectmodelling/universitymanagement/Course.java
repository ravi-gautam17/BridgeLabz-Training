package com.objectmodelling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private int courseId;
    private String courseName;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }
}

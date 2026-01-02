package com.objectmodelling.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public static void main(String[] args) {

        University university = new University();

        Student s1 = new Student(1, "Ravi");
        Student s2 = new Student(2, "Anita");

        Professor p1 = new Professor(101, "Dr. Sharma");

        Course c1 = new Course(501, "Object Oriented Programming");

        university.addStudent(s1);
        university.addStudent(s2);
        university.addProfessor(p1);
        university.addCourse(c1);

        // Interactions
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        p1.assignProfessor(c1);
    }
}

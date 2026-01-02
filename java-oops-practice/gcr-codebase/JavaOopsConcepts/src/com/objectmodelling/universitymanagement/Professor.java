package com.objectmodelling.universitymanagement;


public class Professor {

    private int professorId;
    private String name;

    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
    }

    // Association: Professor ↔ Course
    public void assignProfessor(Course course) {
        course.setProfessor(this);
        System.out.println(name + " assigned to teach " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}

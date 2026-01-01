package com.objectmodelling.schoolandstudent;

public class SchoolDemo {
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(102, "Riya");

        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course(1, "Mathematics");
        Course c2 = new Course(2, "Science");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        System.out.println();
        s1.viewCourses();

        System.out.println();
        c1.showEnrolledStudents();
    }
}

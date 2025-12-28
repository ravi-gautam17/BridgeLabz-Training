package com.constructors.levelone;

public class Course {

    // Instance Variables
    private String courseName;
    private int duration;      // duration in months
    private double fee;

    // Class Variable (common for all objects)
    public static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : " + fee);
        System.out.println("-----------------------------");
    }

    // Class Method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python Data Science", 8, 60000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("XYZ Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

package com.constructors.levelone;

public class UniversityManagementSystem {

    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(
                101, "Ravi", 8.7, "Computer Science"
        );

        pg.displayPGStudentDetails();

        // Modify CGPA using public method
        pg.setCGPA(9.1);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

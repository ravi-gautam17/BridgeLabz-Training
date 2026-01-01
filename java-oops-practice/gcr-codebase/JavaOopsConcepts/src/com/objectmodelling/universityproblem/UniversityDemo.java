package com.objectmodelling.universityproblem;

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("Global Tech University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");
        
        Faculty f1 = new Faculty(101, "Dr. Sharma");
        Faculty f2 = new Faculty(102, "Dr. Mehta");

        uni.addFaculty(f1);
        uni.addFaculty(f2);
        
        uni.showUniversityDetails();

        System.out.println("\n--- Deleting University ---");
        uni.deleteUniversity();

        // Faculty still exists independently
        System.out.println("\nFaculty still exists:");
        f1.showFaculty();
        f2.showFaculty();
    }
}

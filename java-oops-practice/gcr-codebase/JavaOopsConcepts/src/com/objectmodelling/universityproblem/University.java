package com.objectmodelling.universityproblem;

import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: University owns departments
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculty exists independently
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("\nFaculty Members:");
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }

    // Simulate deletion of university
    public void deleteUniversity() {
        departments.clear();   // destroys departments
        System.out.println("\nUniversity deleted. All departments removed.");
    }
}

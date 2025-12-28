package com.constructors.levelone;

public class EmployeeRecords {

    public static void main(String[] args) {

        Manager mgr = new Manager(
                501, "IT", 85000.0, "Project Manager"
        );

        mgr.displayManagerDetails();

        // Modify salary using public method
        mgr.setSalary(95000.0);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}

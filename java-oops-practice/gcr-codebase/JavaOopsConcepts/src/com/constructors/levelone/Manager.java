package com.constructors.levelone;

public class Manager extends Employee {

    String role;

    // Constructor
    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    // Method demonstrating access modifiers
    void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : " + getSalary());  // private via getter
        System.out.println("Role        : " + role);
    }
}

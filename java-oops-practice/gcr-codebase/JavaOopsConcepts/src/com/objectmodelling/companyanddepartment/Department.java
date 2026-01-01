package com.objectmodelling.companyanddepartment;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    // Created only by Company → Composition
    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int empId, String empName) {
        employees.add(new Employee(empId, empName));
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    // Destroy employees
    public void removeAllEmployees() {
        employees.clear();
        System.out.println("All employees removed from " + deptName);
    }
}

package com.objectmodelling.companyanddepartment;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Company creates and owns departments
    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.showDepartment();
        }
    }

    // Simulate deletion of company
    public void deleteCompany() {
        for (Department dept : departments) {
            dept.removeAllEmployees();
        }
        departments.clear();
        System.out.println("Company deleted along with all departments and employees");
    }
}

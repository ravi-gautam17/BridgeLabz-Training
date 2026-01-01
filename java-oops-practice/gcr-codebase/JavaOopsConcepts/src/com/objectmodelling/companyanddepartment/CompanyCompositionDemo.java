package com.objectmodelling.companyanddepartment;

public class CompanyCompositionDemo {
    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        Department dev = company.addDepartment("Development");
        dev.addEmployee(101, "Amit");
        dev.addEmployee(102, "Riya");

        Department hr = company.addDepartment("HR");
        hr.addEmployee(201, "Suman");

        company.showCompanyDetails();

        System.out.println("\n--- Deleting Company ---");
        company.deleteCompany();
    }
}

package com.encapsulation.employeemanagement;

import java.util.*;

public class EmployeeManagement {
	public static void main(String[] args) {
		List<Employee> staff = new ArrayList<>();
		
		FullTimeEmployee ft = new FullTimeEmployee("101", "Himesh", 5000, 1200);
        ft.assignDepartment("Engineering");
        
        staff.add(ft);
        staff.add(new PartTimeEmployee("102", "Lucky", 40, 25.0));
        
        for (Employee e : staff) {
            e.displayDetails(); 
            if (e instanceof Department) {
                System.out.println(((Department) e).getDepartmentDetails());
            }
            System.out.println();
        }
	}
}

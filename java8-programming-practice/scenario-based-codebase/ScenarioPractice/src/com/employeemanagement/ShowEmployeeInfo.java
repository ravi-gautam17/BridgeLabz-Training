package com.employeemanagement;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShowEmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<Employee> employees = Arrays.asList(

            new Employee(1, "Amit", 28, "Male", "IT", 2016, 30000),
            new Employee(2, "Neha", 25, "Female", "HR", 2018, 25000),
            new Employee(3, "Rahul", 32, "Male", "Sales", 2012, 40000),
            new Employee(4, "Priya", 27, "Female", "IT", 2019, 28000),
            new Employee(5, "Suresh", 35, "Male", "Product Development", 2010, 50000),
            new Employee(6, "Anjali", 30, "Female", "Sales", 2014, 35000),
            new Employee(7, "Vikram", 29, "Male", "Product Development", 2017, 45000),
            new Employee(8, "Kavita", 24, "Female", "HR", 2020, 22000),
            new Employee(9, "Arjun", 31, "Male", "IT", 2013, 38000),
            new Employee(10, "Meera", 26, "Female", "Product Development", 2021, 32000)

        );
        
        // Question 1
        Map<String,Long> genderCount=employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(genderCount);
        
        // Question 2
        // Print all department names
        
        employees.stream().map(Employee::getName).forEach(System.out::println);
        
        // Question 3
        Map<String,Double> avgAgeByGender=employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        
        System.out.println(avgAgeByGender);
        
        // Highest paid employee
        
        Optional<Employee> highestPaid=employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        
        System.out.println(highestPaid.get());
        
        //Question 5
        
        List<String> namesEmpAfter2015=employees.stream().filter(e-> e.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(namesEmpAfter2015);	
        
        // Question 6
       
        Map<String,Long> countByDept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(countByDept);
        	
        // Question 7
        
	}

}

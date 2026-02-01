package collectors.employeecategorization;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeCategorization {
   public static void main(String[] args) {
	   List<Employee> employees = List.of(
			    new Employee("Alice", "HR", 50000),
			    new Employee("Bob", "IT", 70000),
			    new Employee("Charlie", "HR", 55000),
			    new Employee("David", "IT", 80000),
			    new Employee("Eve", "Finance", 60000)
			);
	   Map<String, Double> avgSalaryByDept = employees.stream()
			    .collect(Collectors.groupingBy(
			        Employee::getDepartment,          //  Grouping key: department
			        Collectors.averagingDouble(Employee::getSalary)  // Collector to calculate average salary
			    ));
	   avgSalaryByDept.forEach((dept, avgSalary) ->
	    System.out.println(dept + " : " + avgSalary)
	);


   }
}

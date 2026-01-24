package collections.mapinterface.groupobjects;
import java.util.*;

public class GroupByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> map = new HashMap<>();

        for(Employee emp:employees) {
        	map.computeIfAbsent(emp.department, k-> new ArrayList<>()).add(emp);
        }

        System.out.println(map);
    }
}

package collectors.studentresultgrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGroupingApp {

	public static void main(String[] args) {
		List<Student> students = List.of(
		        new Student("Rahul", "A"),
		        new Student("Anita", "B"),
		        new Student("Vikram", "A"),
		        new Student("Sneha", "C"),
		        new Student("Priya", "B")
		);	
		Map<String, List<String>> result =
		        students.stream()
		                .collect(Collectors.groupingBy(
		                        Student::getGrade,
		                        Collectors.mapping(Student::getName, Collectors.toList())
		                ));
		//  Display output
        result.forEach((grade, names) -> {
            System.out.println("Grade " + grade + ":");
            names.forEach(name -> System.out.println("  - " + name));
        });

	}

}

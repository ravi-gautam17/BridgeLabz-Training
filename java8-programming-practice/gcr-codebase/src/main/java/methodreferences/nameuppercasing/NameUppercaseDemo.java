package methodreferences.nameuppercasing;

import java.util.List;
import java.util.stream.Collectors;

public class NameUppercaseDemo {

    public static void main(String[] args) {

        List<String> employeeNames = List.of(
                "Amit",
                "Riya",
                "John",
                "Sara"
        );

        List<String> upperCaseNames = employeeNames.stream()
                .map(String::toUpperCase)   // method reference
                .collect(Collectors.toList());

        // Print result
        upperCaseNames.forEach(System.out::println);
    }
}

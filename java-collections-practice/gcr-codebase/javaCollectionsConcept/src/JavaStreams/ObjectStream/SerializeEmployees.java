package JavaStreams.ObjectStream;

import java.io.*;
import java.util.*;

public class SerializeEmployees {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 65000));
        employees.add(new Employee(103, "Carol", "Finance", 70000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employees.dat"))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

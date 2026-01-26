package JavaStreams.ObjectStream;

import java.io.*;
import java.util.*;

public class DeserializeEmployees {

    public static void main(String[] args) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("employees.dat"))) {

            List<Employee> employees = (List<Employee>) ois.readObject();

            System.out.println("Deserialized Employee List:");
            for (Employee e : employees) {
                System.out.println(e);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found!");
            e.printStackTrace();
        }
    }
}

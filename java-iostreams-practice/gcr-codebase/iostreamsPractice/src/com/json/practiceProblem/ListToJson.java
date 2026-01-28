package com.json.practiceProblem;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJson {
    public static void main(String[] args) throws Exception {

        List<Car> students = new ArrayList<>();
        students.add(new Car("Toyota", "Camry", 2023));
        students.add(new Car("Hundai", "i20", 2020));

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(students);

        System.out.println(jsonArray);
    }
}

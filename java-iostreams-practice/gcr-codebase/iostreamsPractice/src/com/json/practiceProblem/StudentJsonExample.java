package com.json.practiceProblem;

import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentJsonExample {

    public static void main(String[] args) throws Exception {

        Student student = new Student(
                "John",
                20,
                Arrays.asList("Math", "Science", "English")
        );

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(student);

        System.out.println(json);
    }
}

package com.json.practiceProblem;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FilterJson {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new File("students.json"));

        if (rootNode.isArray()) {
            for (JsonNode student : rootNode) {

                int age = student.path("age").asInt();

                if (age > 25) {
                    String name = student.path("name").asText();
                    String dept = student.path("department").asText();

                    System.out.println(
                        "Name: " + name + ", age: " + age + ", department: " + dept
                    );
                }
            }
        }
    }
}

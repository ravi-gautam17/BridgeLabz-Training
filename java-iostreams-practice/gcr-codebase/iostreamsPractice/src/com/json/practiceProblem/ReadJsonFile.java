package com.json.practiceProblem;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.*;

public class ReadJsonFile {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			JsonNode rootNode = mapper.readTree(new File("students.json"));
			
			if(rootNode.isArray()) {
				for (JsonNode student : rootNode) {

                    String name = student.path("name").asText("N/A");
                    int age = student.path("age").asInt(0);
                    String dept = student.path("department").asText("N/A");

                    System.out.println(
                        "Name: " + name + ", age: " + age + ", department: " + dept
                    );
                }
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

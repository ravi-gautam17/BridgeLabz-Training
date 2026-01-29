package com.json.practiceProblem2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        String json1 = "{ \"name\": \"Nageshwar\", \"age\": 22 }";
        String json2 = "{ \"department\": \"CS\", \"email\": \"nagesh@example.com\" }";

        ObjectNode node1 = (ObjectNode) mapper.readTree(json1);
        ObjectNode node2 = (ObjectNode) mapper.readTree(json2);

        node1.setAll(node2);

        System.out.println(
            mapper.writerWithDefaultPrettyPrinter().writeValueAsString(node1)
        );
    }
}

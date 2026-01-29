package com.json.practiceProblem2;

import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadKeyValue {
	public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new File("students.json"));

        printJson(rootNode, 0);
    }

    private static void printJson(JsonNode node, int indent) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                printIndent(indent);
                System.out.println(entry.getKey() + ":");
                printJson(entry.getValue(), indent + 1);
            }
        } else if (node.isArray()) {
            for (JsonNode item : node) {
                printJson(item, indent);
            }
        } else {
            printIndent(indent);
            System.out.println(node.asText());
        }
    }

    private static void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }
}

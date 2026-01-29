package com.json.practiceProblem2;


import com.fasterxml.jackson.databind.*;
import java.io.InputStream;

public class JsonToXmlConverter {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream is = JsonToXmlConverter.class
                .getClassLoader()
                .getResourceAsStream("students.json");

        if (is == null) {
            throw new RuntimeException("students.json not found");
        }

        JsonNode root = mapper.readTree(is);

        StringBuilder xml = new StringBuilder();
        xml.append("<students>");

        for (JsonNode student : root) {
            xml.append(convert("student", student));
        }

        xml.append("</students>");

        System.out.println(xml);
    }

    private static String convert(String key, JsonNode node) {

        StringBuilder sb = new StringBuilder();

        if (node.isObject()) {
            sb.append("<").append(key).append(">");
            node.fields().forEachRemaining(e ->
                sb.append(convert(e.getKey(), e.getValue()))
            );
            sb.append("</").append(key).append(">");
        }
        else if (node.isArray()) {
            for (JsonNode n : node) {
                sb.append(convert(key, n));
            }
        }
        else {
            sb.append("<").append(key).append(">")
              .append(node.asText())
              .append("</").append(key).append(">");
        }

        return sb.toString();
    }
}


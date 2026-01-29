
package com.json.practiceProblem2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.regex.Pattern;

public class JsonEmailValidator {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode validJson =
                mapper.readTree("{\"email\":\"test@example.com\"}");

        JsonNode invalidJson =
                mapper.readTree("{\"email\":\"wrong-email\"}");

        validate(validJson);
        validate(invalidJson);
    }

    private static void validate(JsonNode json) {

        JsonNode emailNode = json.get("email");

        if (emailNode == null) {
            System.out.println("❌ Email field missing");
            return;
        }

        boolean isValid = EMAIL_PATTERN
                .matcher(emailNode.asText())
                .matches();

        if (isValid) {
            System.out.println("✔ Valid email");
        } else {
            System.out.println("❌ Invalid email");
        }
    }
}

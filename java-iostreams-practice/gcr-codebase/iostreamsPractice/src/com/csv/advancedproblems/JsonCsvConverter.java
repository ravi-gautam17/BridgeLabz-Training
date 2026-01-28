package com.csv.advancedproblems;

import java.io.*;
import java.util.*;

public class JsonCsvConverter {

    public static void main(String[] args) {

        String jsonFile = "students.json";
        String csvFile = "students2.csv";
        String outputJsonFile = "students_output.json";

        jsonToCsv(jsonFile, csvFile);
        csvToJson(csvFile, outputJsonFile);
    }

    // ---------------- JSON → CSV ----------------
    public static void jsonToCsv(String jsonFile, String csvFile) {

        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            StringBuilder jsonContent = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }

            // Remove [ ] and split objects
            String json = jsonContent.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .trim();

            String[] records = json.split("\\},\\s*\\{");

            // Write CSV header
            bw.write("id,name,age,email");
            bw.newLine();

            for (String record : records) {

                record = record.replace("{", "").replace("}", "");
                String[] fields = record.split(",");

                Map<String, String> data = new HashMap<>();

                for (String field : fields) {
                    String[] keyValue = field.split(":");
                    String key = keyValue[0].replace("\"", "").trim();
                    String value = keyValue[1].replace("\"", "").trim();
                    data.put(key, value);
                }

                bw.write(
                        data.get("id") + "," +
                        data.get("name") + "," +
                        data.get("age") + "," +
                        data.get("email")
                );
                bw.newLine();
            }

            System.out.println("JSON successfully converted to CSV");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ---------------- CSV → JSON ----------------
    public static void csvToJson(String csvFile, String jsonFile) {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile))) {

            String headerLine = br.readLine();
            String[] headers = headerLine.split(",");

            bw.write("[\n");

            String line;
            boolean firstRecord = true;

            while ((line = br.readLine()) != null) {

                if (!firstRecord) {
                    bw.write(",\n");
                }
                firstRecord = false;

                String[] values = line.split(",");

                bw.write("  {\n");

                for (int i = 0; i < headers.length; i++) {
                    bw.write("    \"" + headers[i] + "\": ");

                    if (headers[i].equals("age") || headers[i].equals("id")) {
                        bw.write(values[i]);
                    } else {
                        bw.write("\"" + values[i] + "\"");
                    }

                    if (i < headers.length - 1) {
                        bw.write(",");
                    }
                    bw.newLine();
                }

                bw.write("  }");
            }

            bw.write("\n]");
            System.out.println("CSV successfully converted back to JSON");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


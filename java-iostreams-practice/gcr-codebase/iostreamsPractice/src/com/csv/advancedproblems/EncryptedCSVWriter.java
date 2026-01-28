package com.csv.advancedproblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Writes employee data to CSV
 * Encrypts Salary & Email fields
 */
public class EncryptedCSVWriter {

    public static void main(String[] args) {

        String file = "employees_encrypted.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            // Header
            bw.write("id,name,salary,email");
            bw.newLine();

            writeRow(bw, "1", "Alice", "75000", "alice@gmail.com");
            writeRow(bw, "2", "Bob", "85000", "bob@yahoo.com");

            System.out.println("Encrypted CSV written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeRow(BufferedWriter bw,
                                 String id,
                                 String name,
                                 String salary,
                                 String email) throws IOException {

        String encryptedSalary = CryptoUtils.encrypt(salary);
        String encryptedEmail = CryptoUtils.encrypt(email);

        bw.write(id + "," + name + "," +
                 encryptedSalary + "," + encryptedEmail);
        bw.newLine();
    }
}

package com.csv.advancedproblems;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Reads encrypted CSV
 * Decrypts Salary & Email fields
 */
public class EncryptedCSVReader {

    public static void main(String[] args) {

        String file = "employees_encrypted.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] cols = line.split(",");

                String id = cols[0];
                String name = cols[1];
                String salary = CryptoUtils.decrypt(cols[2]);
                String email = CryptoUtils.decrypt(cols[3]);

                System.out.println(
                        "ID: " + id +
                        ", Name: " + name +
                        ", Salary: " + salary +
                        ", Email: " + email
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

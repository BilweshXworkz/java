package com.xworkz.libapp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class textFileReader {
    public static void main(String[] args) {
        String filePath = "E:/Java/example.txt"; // Specify your file path here

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

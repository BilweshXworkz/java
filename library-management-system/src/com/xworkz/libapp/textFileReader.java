package com.xworkz.libapp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class textFileReader {
    public static void main(String[] args) {
       String inputFileName = "E:\\Java\\library-management-system\\src\\com\\xworkz\\libapp\\input.txt";
       String outputFileName = "E:\\Java\\library-management-system\\src\\com\\xworkz\\libapp\\output.txt";
       try{
           FileInputStream fis = new FileInputStream(inputFileName);
           FileOutputStream fos = new FileOutputStream(outputFileName);
           int data;
           while ((data = fis.read()) != -1){
               fos.write(data);
           }
           fis.close();
           fos.close();
           System.out.println("Data Has been written to "+outputFileName);
       }
       catch (FileNotFoundException e){
           System.out.println("File not Found : "+e.getMessage());
       }
       catch (IOException e){
           System.out.println("Error reading/writing file "+e.getMessage());
       }
    }
}
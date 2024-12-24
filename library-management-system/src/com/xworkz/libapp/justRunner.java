package com.xworkz.libapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class justRunner {
    public static void main(String[] args) throws Exception {
        {

            File file = new File("E:\\Java\\library-management-system\\src\\com\\xworkz\\libapp\\input.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        }

    }
}

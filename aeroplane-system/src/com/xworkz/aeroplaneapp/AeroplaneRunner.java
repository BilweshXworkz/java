package com.xworkz.aeroplaneapp;

import com.xworkz.aeroplaneapp.aeroplane.Aeroplane;

public class AeroplaneRunner {
    public static void main(String[] args) {
        Aeroplane aeroplan3 = new Aeroplane();
        System.out.println("=============================================");
        Aeroplane aeroplane = new Aeroplane("Air India", 180, 4500.75, "Delhi", "Mumbai");
        System.out.println("=============================================");
        Aeroplane aeroplane1 = new Aeroplane("Air India","Delhi", "Mumbai");
        System.out.println("=============================================");
        Aeroplane aeroplane2 = new Aeroplane("Air India",4500.75,"Delhi", "Mumbai");
        System.out.println("=============================================");
    }
}

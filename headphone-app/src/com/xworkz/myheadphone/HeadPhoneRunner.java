package com.xworkz.myheadphone;

import com.xworkz.myheadphone.headphone.HeadPhones;

import java.util.Scanner;

public class HeadPhoneRunner {
    public static void main(String[] headPhoneFeature) {
        HeadPhones ph = new HeadPhones();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scanner.nextInt();
        ph.setId(id);
        System.out.println("Enter the Brand");
        String brand = scanner.next();
        ph.setBrand(brand);
        System.out.println("Enter the color ");
        String color = scanner.next();
        ph.setColor(color);
        System.out.println("Enter Ear placement");
        String ear = scanner.next();
        ph.setEarPlacement(ear);
        System.out.println("Enter the impedance ");
        String imp = scanner.next();
        ph.setImpedance(imp);


//        System.out.println(ph.hashCode());

//        boolean isEqual = ph.equals(ph1);
//        System.out.println(isEqual);

//        String brand = ph.getBrand();
//        String color = ph.getColor();
//        String earPlacement = ph.getEarPlacement();
//        String impedance = ph.getImpedance();
//        System.out.println(ph);


//        System.out.println("The Brand Name : " + brand);
//        System.out.println("The Color : " + color);
//        System.out.println("The Ear Placement : " + earPlacement);
//        System.out.println("The Impedance : " + impedance);
        System.out.println("------------------------------------");
    }
}

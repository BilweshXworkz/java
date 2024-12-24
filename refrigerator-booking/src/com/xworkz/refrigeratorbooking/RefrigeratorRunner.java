package com.xworkz.refrigeratorbooking;

import com.xworkz.refrigeratorbooking.refrigerator.Refrigerator;

import java.util.Scanner;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator col = new Refrigerator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Dimension");
        String dim = scanner.next();
        col.setProductDimensions(dim);//("65D x 53.4W x 127.7H Centimeters");
        System.out.println("Enter the Brand");
        String brand = scanner.next();
        col.setBrand(brand);
        System.out.println("Enter the capacity");
        int capacity = scanner.nextInt();
        col.setCapacity(capacity);
        System.out.println("Enter the configuration");
        String config = scanner.next();
        col.setConfiguration(config);//("Freezer-on-Top");
        System.out.println("Enter the Energy Star");
        int energy = scanner.nextInt();
        col.setEnergyStar(energy);//(5);

        System.out.println("The Product Dimensions : "+col.getProductDimensions());
        System.out.println("The Brand : "+col.getBrand());
        System.out.println("The Product Capacity : "+col.getCapacity());
        System.out.println("The Configuration : "+col.getConfiguration());
        System.out.println("The Energy Star : "+col.getEnergyStar());
    }
}

package com.xworkz.ecomapp;

import com.xworkz.ecomapp.ecommerce.ECommerce;
import com.xworkz.ecomapp.management.Management;

import java.util.Scanner;

public class ManagementRunner {
    public static void main(String[] args) {
        ECommerce eCommerce = new ECommerce();
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        System.out.println("Enter the Product Id");
        int pId = scanner.nextInt();
        eCommerce.setProductID(pId);
        System.out.println("Enter the Dimensions");
        String dim = scanner.next();
        eCommerce.setProductDimensions(dim);
        System.out.println("Enter the Brand");
        String brand = scanner.next();
        eCommerce.setBrand(brand);
        System.out.println("Enter the capacity");
        int cap = scanner.nextInt();
        eCommerce.setCapacity(cap);
        System.out.println("Enter the configuration");
        String config = scanner.next();
        eCommerce.setConfiguration(config);
        System.out.println("Enter the energy ");
        int eng = scanner.nextInt();
        eCommerce.setEnergyStar(eng);
        System.out.println(eCommerce);
    }
}

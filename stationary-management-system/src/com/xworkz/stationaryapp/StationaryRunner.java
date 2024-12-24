package com.xworkz.stationaryapp;

import com.xworkz.stationaryapp.items.ProductName;
import com.xworkz.stationaryapp.stationary.StationaryItems;

import java.util.Scanner;

public class StationaryRunner {
    public static void main(String[] args) {
        ProductName productName = new ProductName();
        StationaryItems stationaryItems = new StationaryItems();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Product Name");
        String name = scanner.next();
        productName.setProductName(name);
        System.out.println("Enter the Brand");
        String brand = scanner.next();
        productName.setBrand(brand);
        System.out.println("Enter the color");
        String color = scanner.next();
        productName.setColor(color);
        System.out.println("Enter the type");
        String type = scanner.next();
        productName.setWriting(type);
        System.out.println("Enter the price");
        int price = scanner.nextInt();
        productName.setPrice(price);

        System.out.println(productName);

        stationaryItems.addProduct(productName);
        stationaryItems.getProduct();
    }
}

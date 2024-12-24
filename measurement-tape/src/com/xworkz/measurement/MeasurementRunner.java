package com.xworkz.measurement;

import com.xworkz.measurement.tape.Measurement;

import java.util.Scanner;

public class MeasurementRunner {
    public static void main(String[] args) {
        Measurement ms = new Measurement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Brand");
        String brand = scanner.next();
        ms.setBrand(brand);//("Fluke");
        System.out.println("Enter the Power Sources");
        String powerSources = scanner.next();
        ms.setPowerSources(powerSources);//("Battery Powered");
        System.out.println("Enter the style");
        String style = scanner.next();
        ms.setStyle(style);//("Digital");
        System.out.println("Enter the color");
        String color = scanner.next();
        ms.setColor(color);//("Multicolored");
        System.out.println("Enter th weight");
        int weight = scanner.nextInt();
        ms.setItemWeights(weight);//(455);

        System.out.println("Brand : "+ms.getBrand());
        System.out.println("Powered Sources : "+ms.getPowerSources());
        System.out.println("Style : "+ms.getStyle());
        System.out.println("Color : "+ms.getColor());
        System.out.println("Item weights : "+ms.getItemWeights());
    }
}

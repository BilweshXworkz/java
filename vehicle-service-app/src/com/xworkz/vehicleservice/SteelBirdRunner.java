package com.xworkz.vehicleservice;

import com.xworkz.vehicleservice.service.SteelBird;

import java.util.Scanner;

public class SteelBirdRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SteelBird sb = new SteelBird();
        System.out.println("Enter th color");
        String color = scanner.next();
        sb.setColor(color);
        System.out.println("Enter the brand");
        scanner.nextLine();
        String brand = scanner.nextLine();
        sb.setBrand(brand);
        System.out.println("Enter the Vehicle Service Type");
        String type = scanner.next();
        sb.setVehicleServiceType(type);
        System.out.println("Enter the weight ");
        double weight = scanner.nextDouble();
        sb.setItemWeight(weight);
        sb.setMaterial("High Impact Resistant Thermoplastic shell");

//        SteelBird sb1 = new SteelBird();
//        sb1.setColor("Glossy Black");
//        sb1.setBrand("Steel Bird");
//        sb1.setVehicleServiceType("Bike");
//        sb1.setItemWeight(0.9);
//        sb1.setMaterial("High Impact Resistant Thermoplastic shell");

//        boolean isEqualTo = sb.equals(sb1);
//        System.out.println(isEqualTo);

        System.out.println(sb);

//        System.out.println("The Colour : "+sb.getColor());
//        System.out.println("The Brand : "+sb.getBrand());
//        System.out.println("The Vehicle Service Type : "+sb.getVehicleServiceType());
//        System.out.println("The Item Weight : "+sb.getItemWeight()+"Kilogram");
//        System.out.println("The Material : "+sb.getMaterial());
    }
}

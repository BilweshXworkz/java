package com.xworkz.washingmachine;

import com.xworkz.washingmachine.booking.WashingMachine;

import java.util.Scanner;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the washing machine ID");
        int setId = scanner.nextInt();
        wm.setId(setId);

        System.out.println("Enter the Brand");
        String brand = scanner.next();
        wm.setBrand(brand);

        System.out.println("Enter the load ");
        String capacity = scanner.next();
        wm.setCapacity(capacity);


    }
}
//        wm.setId(1);
//        wm.setCapacity("7 Kilograms");
//        wm.setColor("Middle Black");
//        wm.setBrand("LG");
//        wm.setProductDimension("60D x 44W x 85H Centimeters");
//        wm.setSpecialFeature("Inverter, Child Lock, Auto Restart, Hygiene Steam, Inbuilt Heater");
//        wm.setCycleOperation("Active Steam, Tub Clean, Baby Wear, Cotton, Allergen");
//        wm.setVoltage(230);
//        wm.setMaximumRotationalSpeed(1200);
//        wm.setAccessLocation("Front Load");
//
//        System.out.println(wm);
//        System.out.println(wm.hashCode());
//
//        WashingMachine wm1 = new WashingMachine();
//        wm1.setId(2);
//        wm1.setCapacity("7 Kilograms");
//        wm1.setColor("Middle Black");
//        wm1.setBrand("LG");
//        wm1.setProductDimension("60D x 44W x 85H Centimeters");
//        wm1.setSpecialFeature("Inverter, Child Lock, Auto Restart, Hygiene Steam, Inbuilt Heater");
//        wm1.setCycleOperation("Active Steam, Tub Clean, Baby Wear, Cotton, Allergen");
//        wm1.setVoltage(230);
//        wm1.setMaximumRotationalSpeed(1200);
//        wm1.setAccessLocation("Front Load");
//
//        boolean isEqual = wm1.equals(wm);
//        System.out.println(isEqual);

//        System.out.println("The Capacity is : "+wm.getCapacity());
//        System.out.println("The Colour : "+wm.getColor());
//        System.out.println("The Brand : "+wm.getBrand());
//        System.out.println("The Dimension : "+wm.getProductDimension());
//        System.out.println("The Special Feature : "+wm.getSpecialFeature());
//        System.out.println("The CycleOperation : "+wm.getCycleOperation());
//        System.out.println("The Voltage : "+wm.getVoltage()+"Volts");
//        System.out.println("The Maximum Rotational Speed : "+wm.getMaximumRotationalSpeed()+"RPM");
//        System.out.println("The Access Location : "+wm.getAccessLocation());

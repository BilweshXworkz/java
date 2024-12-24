package com.xworkz.acbooking;

import com.xworkz.acbooking.daikinac.DaikinAC;

public class DaikinACRunner {
    public static void main(String[] args) {
        DaikinAC ac = new DaikinAC();
        ac.setBrand("Daikin");
        ac.setCapacity(0.8);
        ac.setCoolingPower(2.8);
        ac.setSpecialFeature("Inverter Compressor,Dry Mode,Self- Diagnosis,Air Purification Filter,Dehumidifier,");
        ac.setProductDimensions("22.9D x 80W x 29.8H Centimeters");

        System.out.println("The Brand : "+ac.getBrand());
        System.out.println("The Capacity : "+ac.getCapacity()+"Tons");
        System.out.println("The Cooling Power : "+ac.getCoolingPower()+"Kilowatts");
        System.out.println("The Special Feature : "+ac.getSpecialFeature());
        System.out.println("The Product Dimensions : "+ac.getProductDimensions());
    }
}

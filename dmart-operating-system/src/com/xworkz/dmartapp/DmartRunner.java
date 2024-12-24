package com.xworkz.dmartapp;

import com.xworkz.dmartapp.dmart.DmartSystem;
import com.xworkz.dmartapp.sales.DmartSales;

public class DmartRunner {
    public static void main(String[] args) {
        System.out.println("The Dmart Main Started");
        DmartSystem dmartSystem = new DmartSystem();
        DmartSales dmartSales = new DmartSales();
        System.out.println("The Sales is : Rs. "+dmartSystem.salesAmount(5000.0););
        System.out.println("The Amount Paid : Rs. "+dmartSales.getAmount());
        System.out.println("The Dmart Main Ended");
    }
}

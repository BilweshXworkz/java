package com.xworkz.generics.runner;

import java.util.LinkedList;

public class DoubleRunner {
    public static void main(String[] args) {
        LinkedList<Double> rate = new LinkedList<>();
        rate.add(99.00d);
        rate.add(299.70d);
        rate.add(149.80d);
        rate.add(39.30d);
        rate.add(79.00d);
        for (Object object: rate)
            System.out.println("Rate: " + object);
    }
}

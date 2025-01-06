package com.xworkz.generics.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FloatRunner {
    public static void main(String[] args) {
        List<Float> price =  new ArrayList<>();
        price.add(9.99f);
        price.add(190.89f);
        price.add(149.05f);
        price.add(189.50f);
        price.add(49.50f);

        for (Object object: price)
            System.out.println("Price: " + object);
    }
}

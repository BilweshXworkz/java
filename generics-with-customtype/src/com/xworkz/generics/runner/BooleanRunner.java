package com.xworkz.generics.runner;

import java.util.LinkedList;

public class BooleanRunner {
    public static void main(String[] args) {
        LinkedList<Boolean> booleans = new LinkedList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        for(Object obj : booleans)
            System.out.println(obj);
    }
}

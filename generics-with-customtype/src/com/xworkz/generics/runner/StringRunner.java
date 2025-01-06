package com.xworkz.generics.runner;

import java.util.ArrayList;
import java.util.Iterator;

public class StringRunner {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Hours");
        collection.add("Tiger");
        collection.add("Lion");
        for(Object ref : collection)
            System.out.println(ref);
    }
}

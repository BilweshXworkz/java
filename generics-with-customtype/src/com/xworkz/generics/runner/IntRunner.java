package com.xworkz.generics.runner;

import java.util.ArrayList;

public class IntRunner {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(34);
        arrayList.add(454);
        arrayList.add(78);
        arrayList.add(32);
        for (Object object : arrayList)
            System.out.println(object);
    }
}

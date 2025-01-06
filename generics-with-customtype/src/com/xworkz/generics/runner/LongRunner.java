package com.xworkz.generics.runner;

import java.util.LinkedList;

public class LongRunner {
    public static void main(String[] args) {
        LinkedList<Long> ph = new LinkedList<>();
        ph.add(2234567890L);
        ph.add(2345678989L);
        ph.add(1223456780L);
        for (Object o : ph)
            System.out.println(o);
    }
}

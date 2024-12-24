package com.xworkz.calenderapp;
import com.xworkz.calenderapp.event.Event;

import java.util.*;

public class SortRunner {
    public static void main(String[] args) {
        Event event1 = new Event();

        Object obj[] = new Object[5];
        obj[0] = 25;
        obj[1] = "Bilwesh";
        obj[2] = event1;

        System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
    }
}

//        Integer num[] = {87, 56, 870, 32, 23, 7};
//        for (Integer integer : num) {
//            if (integer % 2 == 0) {
//                System.out.println("Even number " + integer);
//            } else
//                System.out.println("Odd number " + integer);
//        }

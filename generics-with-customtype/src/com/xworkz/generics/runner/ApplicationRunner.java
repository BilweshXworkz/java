package com.xworkz.generics.runner;

import com.xworkz.generics.customtype.Application;
import com.xworkz.generics.customtype.MusicPlayer;

import java.util.Collections;
import java.util.LinkedList;

public class ApplicationRunner {
    public static void main(String[] args) {
        LinkedList<Application> apps = new LinkedList<>();
        apps.add(new Application("UrbanTransit", 3.8, "CityConnect"));
        apps.add(new Application("SwiftPay", 7.2, "Global Bank"));
        apps.add(new Application("Chirp", 1.5, "TechNest"));
        for (Object obj : apps)
            System.out.println(obj);

        System.out.println("=======================");

        Collections.sort(apps);

        for (Object o : apps)
            System.out.println(o);
    }
}

package com.xworkz.kerosenesalesapp;

import com.xworkz.kerosenesalesapp.kerosene.Kerosene;

public class KeroseneRunner {
    public static void main(String[] args) {
        Kerosene kerosene = new Kerosene();
        Kerosene kerosene1 = new Kerosene(70.2);
        System.out.println("===============================");
        Kerosene kerosene2 = new Kerosene(true);
        System.out.println("===============================");
        Kerosene kerosene3 = new Kerosene(70.25, 1,true);
    }
}

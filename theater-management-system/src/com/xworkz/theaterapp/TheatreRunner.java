package com.xworkz.theaterapp;

import com.xworkz.theaterapp.pvr.PvrApp;
import com.xworkz.theaterapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("The main for Theatre start");
        Theatre theatre = new PvrApp();
        System.out.println("The main ended");
    }
}

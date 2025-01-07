package com.xworkz.java8feature.runner;

public class RedBusRunner {
    public static void main(String[] args) {
        RedBus srl = () ->{
            return 15;
        };
        RedBus vlr = () -> {
            return 20;
        };

        System.out.println(srl.seatBooking());
        System.out.println(vlr.seatBooking());
    }
}

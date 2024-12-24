package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.radisson.Radisson;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("The main start");
        Hotel hotel = new Radisson();
        System.out.println("The main ended");
    }
}

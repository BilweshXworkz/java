package com.xworkz.aeroplaneapp.aeroplane;

public class Aeroplane {
    public Aeroplane(){
        System.out.println("The Default Constructor");
    }

    public  Aeroplane(String company, int noOfSeats, double ticketPrice, String  source, String destination){
        System.out.println("The Company Name : "+company);
        System.out.println("No of Seats : "+noOfSeats);
        System.out.println("Ticket Price : "+ticketPrice);
        System.out.println("Sources : "+source);
        System.out.println("Destination : "+destination);
    }

    public  Aeroplane(String company, String  source, String destination){
        System.out.println("The Company Name : "+company);
        System.out.println("Sources : "+source);
        System.out.println("Destination : "+destination);
    }

    public Aeroplane(String company,double ticketPrice, String  source, String destination){
        System.out.println("The Company Name : "+company);
        System.out.println("Ticket Price : "+ticketPrice);
        System.out.println("Sources : "+source);
        System.out.println("Destination : "+destination);
    }
}

package com.xworkz.stationapp;

import com.xworkz.stationapp.management.StationManagement;
import com.xworkz.stationapp.station.Station;

import java.util.Scanner;

public class StationRunner {
    public static void main(String[] args) {
        Station station = new Station();
        StationManagement stationManagement = new StationManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Station Name");
        String name = scanner.next();
        station.setStationName(name);
        System.out.println("Enter the Train name");
        String trainName = scanner.next();
        station.setTrainName(trainName);
        System.out.println("Enter the train number");
        int number = scanner.nextInt();
        station.setTrainNumber(number);
        System.out.println("Enter the Arrival Time");
        String aTime = scanner.next();
        station.setArrivalTime(aTime);
        System.out.println("Enter the Departure Time");
        String dTime = scanner.next();
        station.setDepartureTime(dTime);
        System.out.println(station);

        System.out.println(station.hashCode());

//        boolean trainNumber = station.equals(station1);
//        System.out.println(trainNumber);

        stationManagement.addStation(station);
        stationManagement.getStation();
    }
}

package com.xworkz.stationapp.management;

import com.xworkz.stationapp.station.Station;

public class StationManagement {
    Station station;

    public boolean addStation(Station station){
        boolean isAdded = false;
        if(station != null){
            if(station.getStationName() != null && station.getTrainNumber() > 0){
                this.station = station;
                isAdded = true;
            }
            else{
                System.out.println("Please Enter the Details");
            }
        }
        return isAdded;
    }

    public void getStation(){
        System.out.println("The Station Name : "+station.getStationName());
        System.out.println("Train Number : "+station.getTrainNumber());
        System.out.println("Train Name : "+station.getTrainName());
        System.out.println("Arrival Time : "+station.getArrivalTime());
        System.out.println("Departure time : "+station.getDepartureTime());
    }
}

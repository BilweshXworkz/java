package com.xworkz.stationapp.station;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Station {
    private String stationName;
    private int trainNumber;
    private String trainName;
    private String arrivalTime;
    private String departureTime;

    @Override
    public int hashCode(){
        return trainNumber;
    }

    @Override
    public String toString(){
        return "Station Name : "+stationName+"," +
                "Train Number : "+trainNumber+"," +
                "Train Name : "+trainName+"," +
                "Arrival Time : "+arrivalTime+"," +
                "Departure Time : "+departureTime+".";
    }

    @Override
    public boolean equals(Object obj){
        Station station = (Station) obj;
        if(this.stationName == station.stationName &&
                this.trainNumber == station.trainNumber &&
                this.trainName == station.trainName &&
                this.arrivalTime == station.arrivalTime &&
                this.departureTime == station.departureTime)
            return true;
        return false;
    }

}

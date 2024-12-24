package com.xworkz.washingmachine.booking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class WashingMachine {
    private int id;
    private String capacity;
    private String color;
    private String brand;
    private String productDimension;
    private String specialFeature;
    private String cycleOperation;
    private int voltage;
    private int maximumRotationalSpeed;
    private String accessLocation;

    public WashingMachine(){

    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString(){
        return "Id : "+id+","+
                "Capacity : "+capacity+"," +
                "Color : "+color+"," +
                "Brand : "+brand+"," +
                "Dimension : "+productDimension+"," +
                "Special Feature : "+specialFeature+"," +
                "Cycle Operation : "+cycleOperation+"," +
                "Voltage : "+voltage+"," +
                "Rotational Speed "+maximumRotationalSpeed+"," +
                "Location : "+accessLocation+".";
    }

    @Override
    public boolean equals(Object obj){
        WashingMachine washingMachine = (WashingMachine) obj;
        if(this.capacity == washingMachine.capacity &&
                this.brand == washingMachine.brand)
            return true;
        return false;

    }
}

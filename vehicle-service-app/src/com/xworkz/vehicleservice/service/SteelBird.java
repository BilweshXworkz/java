package com.xworkz.vehicleservice.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SteelBird {
    private String color;
    private String brand;
    private String vehicleServiceType;
    private double itemWeight;
    private String material;

    public SteelBird(){
        System.out.println("Default");
    }

//    @Override
//    public int hashCode(){
//
//    }

    @Override
    public String toString(){
        return "Color : "+color+"," +
                "Brand : "+brand+"," +
                "Services Type : "+vehicleServiceType+"," +
                "Weight : "+itemWeight+"," +
                "Material : "+material+".";
    }

    @Override
    public boolean equals(Object obj){
        SteelBird steelBird = (SteelBird) obj;
        if(this.color == steelBird.color &&
                this.brand == steelBird.brand &&
                this.vehicleServiceType == steelBird.vehicleServiceType &&
                this.itemWeight == steelBird.itemWeight &&
                this.material == steelBird.material)
            return true;
        return false;
    }
}

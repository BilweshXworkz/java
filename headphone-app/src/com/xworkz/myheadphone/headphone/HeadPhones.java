package com.xworkz.myheadphone.headphone;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class HeadPhones {
    private int id;
    private String brand;
    private String color;
    private String earPlacement;
    private String impedance;

    public HeadPhones(){

    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString(){
        return "ID : "+id+","+
                "Brand : "+brand+"," +
                "Color : "+color+"," +
                "Ear Placement : "+earPlacement+"," +
                "Impedance : "+impedance+".";
    }

    @Override
    public boolean equals(Object obj){
        HeadPhones headPhones = (HeadPhones) obj;
        if(this.id == headPhones.id &&
                this.brand == headPhones.brand &&
                this.color == headPhones.color &&
                this.earPlacement == headPhones.earPlacement &&
                this.impedance == headPhones.impedance)
            return true;
        return false;
    }
}

package com.xworkz.bagbooking.handbag;

import lombok.Getter;
import lombok.Setter;

import java.util.logging.StreamHandler;

@Getter
@Setter
public class HandBag {
    private int id;
    private String closure;
    private String material;
    private String style;
    private int pockets;
    private String origin;

    public HandBag(){

    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public String toString(){
        return "ID : "+id+","+
                "Closure : "+closure+"," +
                "Material : "+material+"," +
                "Style : "+style+"," +
                "Pockets : "+pockets+"," +
                "Origin : "+origin+".";
    }

    @Override
    public boolean equals(Object obj){
        HandBag handBag = (HandBag) obj;
        if(this.id == handBag.id &&
                this.material == handBag.material &&
                this.style == handBag.style)
            return true;
        return false;
    }
}

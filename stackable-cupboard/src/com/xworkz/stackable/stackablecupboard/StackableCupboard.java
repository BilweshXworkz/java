package com.xworkz.stackable.stackablecupboard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StackableCupboard {
    private String color;
    private String material;
    private String brand;
    private String productDimension;
    private int noOfDrawers;
    private int itemWhight;
    private boolean assemblyRequried;

    public StackableCupboard(){
        System.out.println("Default");
    }

    @Override
    public int hashCode(){
        return this.itemWhight;
    }

    @Override
    public String toString(){
        return "Color : "+color+"," +
                "Material : "+brand+"," +
                "Dimension : "+productDimension+"," +
                "Drawers : "+noOfDrawers+"," +
                "Weight : "+itemWhight+"," +
                "Required : "+assemblyRequried+".";
    }

    @Override
    public boolean equals(Object obj){
        StackableCupboard stackableCupboard = (StackableCupboard) obj;
        if(this.color == stackableCupboard.color &&
                this.brand == stackableCupboard.brand &&
                this.productDimension == stackableCupboard.productDimension &&
                this.noOfDrawers == stackableCupboard.noOfDrawers &&
                this.assemblyRequried == stackableCupboard.assemblyRequried)
            return true;
        return false;
    }
}

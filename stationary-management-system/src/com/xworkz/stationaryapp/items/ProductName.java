package com.xworkz.stationaryapp.items;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductName {
    private String productName;
    private String brand;
    private String writing;
    private String color;
    private double price;

    public ProductName(){

    }

    @Override
    public String toString(){
        return "Product Name : "+productName+"," +
                "Brand : "+brand+"," +
                "Writing : "+writing+"," +
                "Color : "+color+"," +
                "Price : "+price+".";
    }
}

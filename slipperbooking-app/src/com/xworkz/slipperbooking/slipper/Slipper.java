package com.xworkz.slipperbooking.slipper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Slipper {
    private String material;
    private String resistance;
    private String style;
    private String closure;
    private String heel;
    private String origin;

    public Slipper(){
        System.out.println("Default");
    }
}

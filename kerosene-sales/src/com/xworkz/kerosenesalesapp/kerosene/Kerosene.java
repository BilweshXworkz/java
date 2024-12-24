package com.xworkz.kerosenesalesapp.kerosene;

public class Kerosene {
    public Kerosene(){
        System.out.println("This is Default Constructor");
    }

//    quality = True;

    public  Kerosene(double price, int quantity, boolean quality){
        System.out.println("The Price : Rs."+price);
        System.out.println("The Quantity : "+quantity+"l");
        System.out.println("The Quality : "+quality);
    }

    public Kerosene(boolean quality){
        System.out.println("The Quality : "+quality);
    }

    public Kerosene(double price){
        System.out.println("The Price : Rs."+price);
    }
}

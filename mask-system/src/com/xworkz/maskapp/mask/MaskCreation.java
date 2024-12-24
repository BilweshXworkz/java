package com.xworkz.maskapp.mask;

public class MaskCreation {
    public MaskCreation(){
        System.out.println("This is an default Constructor");
        System.out.println("The Mask app.");
    }

    public MaskCreation(double cost){
        System.out.println("The cost : Rs."+cost);
    }

    public MaskCreation(char size){
        System.out.println("The size : "+size);
    }

    public MaskCreation(String material){
        System.out.println("The Material : "+material);
    }

    public MaskCreation(double cost, char size, String material){
        System.out.println("The cost : Rs."+cost);
        System.out.println("The size : "+size);
        System.out.println("The Material : "+material);
    }

    public MaskCreation(double cost, char size){
        System.out.println("The cost : Rs."+cost);
        System.out.println("The size : "+size);
    }
}

package com.xworkz.mywallet.wallet;

public class Wallet {
    String id;
    String brand;
    int noOfCompartments;
    String color;

    public Wallet(String id, String brand, int noOfCompartments, String color){
        this.id = id;
        this.brand = brand;
        this.noOfCompartments = noOfCompartments;
        this.color = color;
    }

    public void WalletFeature(){
        System.out.println("The wallet Id: "+id);
        System.out.println("The wallet brand : "+brand);
        System.out.println("The number of Compartments: "+noOfCompartments);
        System.out.println("The wallet color: "+color);
    }
}

package com.xworkz.marketapp.market;

import jdk.nashorn.internal.objects.annotations.Getter;

@
public class Market {
    String name;
    String location;
    int shop;
    String type;

    public Market(String name, String location, int shop, String type){
        this.name = name;
        this.location = location;
        this.shop = shop;
        this.type = type;
    }

    public void marketDetails(){
        System.out.println("The Shop Name : "+this.name);
        System.out.println("The Location : "+this.location);
        System.out.println("The Shop : "+this.shop);
        System.out.println("The Shop Type : "+this.type);
    }
}

package com.xworkz.marketapp.supermarket;

import com.xworkz.marketapp.market.Market;

public class SuperMarket extends Market {
    String specialty;

    public SuperMarket(String name, String location, int shop, String type, String specialty){
        super(name, location, shop, type);
        this.specialty = specialty;
    }

    @Override
    public void marketDetails(){
        super.marketDetails();
        System.out.println("Specialty : "+specialty);
    }
}

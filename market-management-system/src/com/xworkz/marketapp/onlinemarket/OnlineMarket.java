package com.xworkz.marketapp.onlinemarket;

import com.xworkz.marketapp.market.Market;

public class OnlineMarket extends Market {
    String website;

    public OnlineMarket(String name, int noOfMlas, String location, int shop, String type, String website){
        super(name, location, shop, type);
        this.website = website;
    }

    @Override
    public void marketDetails(){
        super.marketDetails();
        System.out.println("Website : "+website);
    }
}

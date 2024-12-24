package com.xworkz.marketapp;

import com.xworkz.marketapp.market.Market;
import com.xworkz.marketapp.onlinemarket.OnlineMarket;
import com.xworkz.marketapp.supermarket.SuperMarket;

public class MarketRunner {
    public static void main(String[] args) {
        Market market = new Market("City Market", "Bangalore",50,"Wholesale");
        Market superMarket = new SuperMarket("Big Bazaar", "Bangalore", 20, "Retail", "Discounts");
        Market onlineMarket = new OnlineMarket("Amazon", "Global", 0, "E-commerce", "www.amazon.com");
        OnlineMarket onlineMarket1 = new OnlineMarket("Flipkart", "India", 0, "E-commerce", "www.flipkart.com");
       market.marketDetails();
       System.out.println("===================================");
       superMarket.marketDetails();
       System.out.println("===================================");
       onlineMarket.marketDetails();
       System.out.println("===================================");
       onlineMarket1.marketDetails();
    }
}

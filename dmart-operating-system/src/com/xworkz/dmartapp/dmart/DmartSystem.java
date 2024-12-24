package com.xworkz.dmartapp.dmart;

public class DmartSystem {
    public DmartSystem(){
        System.out.println("Welcome to Dmart");
    }

    private double amount;

    public void salesAmount(double cash){
        if(amount > 0){
            amount = amount + cash;
        }
    }

    public void salesReturn(double cash){
        if(amount <= 0){
            amount = amount - cash;
        }
    }

    public double getAmount() {
        return amount;
    }

}

package com.xworkz.acbooking.daikinac;

public class DaikinAC {
    private String brand;
    private double capacity;
    private double coolingPower;
    private String specialFeature;
    private String productDimensions;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    public double getCapacity(){
        return capacity;
    }

    public void setCoolingPower(double coolingPower){
        this.coolingPower = coolingPower;
    }

    public double getCoolingPower(){
        return coolingPower;
    }

    public void setSpecialFeature(String specialFeature){
        this.specialFeature = specialFeature;
    }

    public String getSpecialFeature(){
        return specialFeature;
    }

    public void setProductDimensions(String productDimensions){
        this.productDimensions = productDimensions;
    }

    public String getProductDimensions(){
        return productDimensions;
    }
}

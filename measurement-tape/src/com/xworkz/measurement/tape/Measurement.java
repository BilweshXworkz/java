package com.xworkz.measurement.tape;

public class Measurement {
    private String brand;
    private String powerSources;
    private String style;
    private String color;
    private int itemWeights;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setPowerSources(String powerSources){
        this.powerSources = powerSources;
    }

    public String getPowerSources(){
        return powerSources;
    }

    public void setStyle(String style){
        this.style = style;
    }

    public String getStyle(){
        return style;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setItemWeights(int itemWeights){
        this.itemWeights = itemWeights;
    }

    public int getItemWeights(){
        return itemWeights;
    }

    @Override
    public String toString(){
        return "Brand : "+brand+"," +
                "Power Sources : "+powerSources+"," +
                "Style : "+style+"," +
                "Color : "+color+"," +
                "Weight : "+itemWeights+".";
    }
}

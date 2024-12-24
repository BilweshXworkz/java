package com.xworkz.ecomapp.ecommerce;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ECommerce {
    private int productID;
    private String brand;
    private String productName;
    private int capacity;
    private String material;
    private double price;

    public ECommerce(){

    }

    @Override
    public int hashCode(){
        return productID;
    }

    @Override
    public String toString(){
        return "Product ID : "+productID+"," +
                "Brand : "+brand+"," +
                "Product Name : "+productName+"," +
                "Capacity : "+capacity+"," +
                "Material : "+material+"," +
                "Price : "+price+".";
    }

    @Override
    public boolean equals(Object obj){
        ECommerce eCommerce = (ECommerce) obj;
        if(this.productID == eCommerce.productID &&
                this.brand.equals(eCommerce.brand) &&
                this.capacity == eCommerce.capacity)
            return true;
        return false;
    }
}

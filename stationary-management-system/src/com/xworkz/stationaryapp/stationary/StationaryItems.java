package com.xworkz.stationaryapp.stationary;

import com.xworkz.stationaryapp.items.ProductName;

public class StationaryItems {
    ProductName productName;

    public boolean addProduct(ProductName productName){
        boolean isAdded = false;
        if(productName != null){
            if(productName.getBrand() != null && productName.getPrice() != 0.0) {
                this.productName = productName;
                isAdded = true;
            }
        }
        else{
            System.out.println("Please Enter the Item...");
        }
        return isAdded;
    }

    public void getProduct(){
        System.out.println("The Product Name : "+productName.getProductName());
        System.out.println("The Brand : "+productName.getBrand());
        System.out.println("The Product writting : "+productName.getWriting());
        System.out.println("The Ink colour : "+productName.getColor());
        System.out.println("The Price : "+productName.getPrice());
    }
}

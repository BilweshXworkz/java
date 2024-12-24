package com.xworkz.ecomapp.management;

import com.xworkz.ecomapp.ecommerce.ECommerce;
import com.xworkz.ecomapp.exception.ProductIdNotFoundException;
import com.xworkz.ecomapp.exception.ProductNameNotFoundException;

public class Management {
    ECommerce eCommerce[] = null;
    int index = 0;

    public Management(int size){
        eCommerce = new ECommerce[size];
    }

    public boolean addProduct(ECommerce eCommerce){
        boolean isAdded = false;
        if(eCommerce != null){
            if(eCommerce.getBrand() != null &&
                    eCommerce.getProductName() != null &&
                    eCommerce.getCapacity() > 0 &&
                    eCommerce.getMaterial() != null &&
                    eCommerce.getPrice() != 0.0 &&
                    eCommerce.getProductID() > 0) {
                this.eCommerce[index++] = eCommerce;
                isAdded = true;
            }
            else {
                System.out.println("Please Enter the product");
            }
        }
        return isAdded;
    }

    public void getProductDetails(){
        if (eCommerce != null){
            for (ECommerce eCommerce1 : this.eCommerce){
                if (eCommerce1 != null){
                    System.out.println("The Product ID         :   "+eCommerce1.getProductID());
                    System.out.println("The Brand              :   "+eCommerce1.getBrand());
                    System.out.println("The Product Name       :   "+eCommerce1.getProductName());
                    System.out.println("The Product Capacity   :   "+eCommerce1.getCapacity());
                    System.out.println("The Material           :   "+eCommerce1.getMaterial());
                    System.out.println("The Product Price      :   "+eCommerce1.getPrice());
                    System.out.println("=================================================");
                }
            }
        }

    }
    public String getProductNameByProductID(int productID){
        String productName = null;
        try {
            for (ECommerce eCommerce1 : this.eCommerce) {
                if (eCommerce1.getProductID() == productID) {
                    productName = eCommerce1.getProductName();
                }
            }
            if (productName == null){
                throw new ProductIdNotFoundException("Id not found please enter the right Id");
            }
        }catch (ProductIdNotFoundException e){
            e.printStackTrace();
        }
        return productName;
    }

    public double getPriceByProductName(String productName){
        double price = 0.0;
        try {
            for (ECommerce eCommerce1 : this.eCommerce) {
                if (eCommerce1.getProductName() == productName) {
                    price = eCommerce1.getPrice();
                }
            }
            if (price == 0.0) {
                throw new ProductNameNotFoundException("The Product Name is not found");
            }
        }catch(ProductNameNotFoundException e){
            e.printStackTrace();
        }

        return price;
    }

    public String getMaterialByProductName(String productName){
        String Material = null;
        try {
            for (ECommerce eCommerce1 : this.eCommerce) {
                if (eCommerce1.getProductName() == productName) {
                    Material = eCommerce1.getMaterial();
                }
            }
            if (Material == null) {
                throw new ProductNameNotFoundException("The Product Name Not found");
            }
        }catch (ProductNameNotFoundException e){
            e.printStackTrace();
        }
        return Material;
    }
}

package com.xworkz.ecomapp.exception;

public class ProductNameNotFoundException extends Exception {
    public ProductNameNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

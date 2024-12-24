package com.xworkz.ecomapp.exception;

public class ProductIdNotFoundException extends RuntimeException{
    public ProductIdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

package com.xworkz.libapp.Exception;

public class GetBookByAuthorNotFoundException extends RuntimeException {
    public GetBookByAuthorNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

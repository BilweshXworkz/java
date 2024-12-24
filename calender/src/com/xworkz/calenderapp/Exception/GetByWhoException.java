package com.xworkz.calenderapp.Exception;

public class GetByWhoException extends RuntimeException{
    public GetByWhoException(String errorMessage){
        super(errorMessage);
    }
}

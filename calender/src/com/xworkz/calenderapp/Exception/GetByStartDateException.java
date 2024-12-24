package com.xworkz.calenderapp.Exception;

public class GetByStartDateException extends RuntimeException{
    public GetByStartDateException(String errorMessage){
        super(errorMessage);
    }
}

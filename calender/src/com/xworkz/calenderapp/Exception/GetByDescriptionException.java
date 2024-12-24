package com.xworkz.calenderapp.Exception;

public class GetByDescriptionException extends RuntimeException{
    public GetByDescriptionException(String errorMessage){
        super(errorMessage);
    }
}

package com.xworkz.calenderapp.Exception;

public class DeleteEventByIdException extends RuntimeException {
    public DeleteEventByIdException(String error){
        super(error);
    }
}

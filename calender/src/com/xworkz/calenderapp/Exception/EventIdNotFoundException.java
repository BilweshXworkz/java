package com.xworkz.calenderapp.Exception;

import com.xworkz.calenderapp.event.Event;

public class EventIdNotFoundException extends RuntimeException{
    public EventIdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}

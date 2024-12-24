package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.Exception.*;
import com.xworkz.calenderapp.constants.EventType;
import com.xworkz.calenderapp.event.Event;

import java.util.Arrays;

public class Calender {
    Event event[] = null;
    int index;

    public Calender(int size){
        event = new Event[size];
    }


    public boolean addEvent(Event event){
        boolean isEventAdd = false;
        if(event.getEventId() > 0 &&
                event.getEventType() != null &&
                event.getWho() != null &&
                event.isAllDayEvent() &&
                event.getDescription() != null &&
                event.getStartDate() != null &&
                event.getEndDate() != null)
        {
            this.event[index++] = event;
            isEventAdd = true;
        }
        return isEventAdd;
    }

    public  void  getEvent(){
        if (event != null) {
            for (Event i : event) {
                if(i != null){
                    System.out.println(i.getEventId());
                    System.out.println(i.getWho());
                    System.out.println(i.getEventType());
                    System.out.println(i.getStartDate());
                    System.out.println(i.getEndDate());
                    System.out.println(i.getDescription());
                    System.out.println("================================");
                }
            }
        }
        else {
            System.out.println("The Data is not Available");
        }
    }

    public Event getById(int eventId) {
        Event eventToBeReturned = null;
        try {
            System.out.println("Start getById ");
            try {
                for (Event event : event) {
                    if (event.getEventId() == eventId) {
                        eventToBeReturned = event;
                    }
                }
                if (eventToBeReturned == null) {
                    throw new EventIdNotFoundException("The Book ID not found");
                }
            } catch (EventIdNotFoundException ref) {
                System.out.println("The Id Not Found Please try again");
            }
            System.out.println("End getById ");
            System.out.println("===============================");
            return eventToBeReturned;
        } catch (EventIdNotFoundException e) {
            e.printStackTrace();
        }
        return eventToBeReturned;
    }


    public void getByDetails(Event event){
         System.out.println(event.getEventId());
         System.out.println(event.getWho());
         System.out.println(event.getEventType());
         System.out.println(event.getStartDate());
         System.out.println(event.getEndDate());
         System.out.println(event.getDescription());
         System.out.println("================================");
    }

    public Event getByWho(String who){
        Event returnEventByName = null;
        try {
            System.out.println("Start getByWho");
            for (Event event : event) {
                if (event.getWho().equals(who)) {
                    returnEventByName = event;
                }
            }
            if (returnEventByName == null){
                throw new GetByWhoException("The Who is not Found");
            }
        }catch (GetByWhoException e){
            e.printStackTrace();
        }
        System.out.println("End getByWho");
        return returnEventByName;
    }

    public Event getByStartDate(String startDate){
        Event returnStartDate = null;
        try {
            System.out.println("Start getByStartDate");
            for (Event event : event) {
                if (event.getStartDate() == startDate) {
                    returnStartDate = event;
                }
            }
            if (returnStartDate == null) {
                throw new GetByStartDateException("Start Date Not Found");
            }
        }catch (GetByStartDateException e){
            e.printStackTrace();
        }
        System.out.println("End getByStartDate");
        return returnStartDate;
    }

    public Event getByEndDate(String endDate){
        System.out.println("Start getByEndDate");
        Event returnEndDate = null;
        try {
            for (Event event : event) {
                if (event.getEndDate() == endDate) {
                    returnEndDate = event;
                }
            }
            if (returnEndDate == null) {
                throw new GetByEndDateException("The End Date is not found");
            }
        }catch (GetByEndDateException e){
            e.printStackTrace();
        }
        System.out.println("Ended getByEndDate");
        return returnEndDate;
    }

    public Event getByDescription(String description){
        System.out.println("Start getByDescription");
        Event returnEventDescription = null;
        try {
            for (Event event : event) {
                returnEventDescription = event;
            }
            if (returnEventDescription == null) {
                throw new GetByDescriptionException("The Description is not found");
            }
        }catch (GetByDescriptionException e){
            e.printStackTrace();
        }
        System.out.println("End getByDescription");
        return  returnEventDescription;
    }

    public Event getEventByEventType(EventType eventType){
        System.out.println("Start getByDescription");
        Event returnEventType = null;
        try {
            for (Event event1 : event) {
                if (event1.getEventType() == eventType)
                    returnEventType = event1;
            }
            if (returnEventType.equals(null)) {
                throw new GetEventByEventTypeException("The Event Type is not found");
            }
        }catch (GetEventByEventTypeException e){
            e.printStackTrace();
        }
        System.out.println("End getBytype");
        return  returnEventType;
    }

    public  String getWhoByStartDate(String startDate){
        String returnedWho = null;
        try {
            for (Event event1 : event) {
                if (event1.getStartDate() == startDate) {
                    returnedWho = event1.getWho();
                    break;
                }
            }
            if (returnedWho == null) {
                throw new GetWhoByStartDateException("The data is not found");
            }
        }catch (GetWhoByStartDateException e){
            e.printStackTrace();
        }
        return returnedWho;
    }

    public String getStartDateByWho(String who){
        String returnedWho = null;
        try {
            for (Event event1 : event) {
                if (event1.getWho() == who) {
                    returnedWho = event1.getStartDate();
                }
            }
            if (returnedWho == null) {
                throw new GetStartDateByWhoException("The person not found");
            }
        }catch (GetStartDateByWhoException e){
            e.printStackTrace();
        }
        return returnedWho;
    }

    public boolean updateStartDateByWho(String who, String updateStartDate){
        boolean isStartDateUpdated = false;
        try {
            for (Event event : this.event) {
                if (event.getWho() == who) {
                    event.setStartDate(updateStartDate);
                    isStartDateUpdated = true;
                }
            }
            if (isStartDateUpdated == false){
                throw new UpdateStartDateByWhoException("The Who is not Found");
            }
        }catch (UpdateStartDateByWhoException e){
            e.printStackTrace();
        }
        return isStartDateUpdated;
    }

//    public boolean updateStartDateAndEndDateByWho(String who, st)

    public boolean deleteEventById(int id){
        boolean isEventDeleted = false;
        int index;
        int newIndex = 0;
        try {
            for (index = 0; index < event.length; index++) {
                Event event = this.event[index];
                if (event.getEventId() != id) {
                    this.event[newIndex++] = this.event[index];
                } else {

                    isEventDeleted = true;
                }
            }
            if (isEventDeleted == false){
                throw new DeleteEventByIdException("The Id Not found");
            }
        }catch (DeleteEventByIdException e){
            e.printStackTrace();
        }
        int size = newIndex ;
        event = Arrays.copyOf(this.event, size);
        return isEventDeleted;
    }

    public String getDescriptionByEventType( EventType eventType){
        String isDescription = null;
        try {
            for (Event event1 : this.event) {
                if (event1.getEventType() == eventType) {
                    isDescription = event1.getDescription();
                }
            }
            if(isDescription == null){
                throw new DescriptionNotFoundException("The Description Not Found");
            }
        }catch (DescriptionNotFoundException e){
            e.printStackTrace();
        }
        return isDescription;
    }

    public boolean getAllDayEventByStartDate(String StartDate){
        boolean allDayEvent = false;
        try {
            for (Event event1 : this.event) {
                if (event1.getStartDate().equals(StartDate)) {
                    event1.isAllDayEvent();
                    allDayEvent = true;
                }
            }
            if (allDayEvent == false){
                throw new AllDayEventNotFoundException();
            }
        }catch (AllDayEventNotFoundException e){
            e.printStackTrace();
        }
        return allDayEvent;
    }
}
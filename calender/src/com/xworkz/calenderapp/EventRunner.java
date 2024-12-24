package com.xworkz.calenderapp;

import com.xworkz.calenderapp.calender.Calender;
import com.xworkz.calenderapp.constants.EventType;
import com.xworkz.calenderapp.event.Event;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class EventRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the event Size : ");
        int size = scanner.nextInt();
        Calender calender = new Calender(size);
        for(int i = 0; i<size; i++) {
            Event event = new Event();
            System.out.println("Enter Event ID");
            event.setEventId(scanner.nextInt());
            System.out.println("Enter the Event Type");
            event.setEventType(EventType.valueOf(scanner.next().toLowerCase()));
            System.out.println("Who is Creating the Event");
            event.setWho(scanner.next());
            System.out.println("Enter the Start Date");
            event.setStartDate(scanner.next());
            System.out.println("Enter the End Date");
            event.setEndDate(scanner.next());
            System.out.println("All Day Event");
            event.setAllDayEvent(scanner.nextBoolean());
            System.out.println("Description for holiday");
            scanner.nextLine();
            event.setDescription(scanner.nextLine());
            calender.addEvent(event);
        }


        String val = null;

        do{
            System.out.println("Press 1 to Get Event By Id");
            System.out.println("Press 2 to Get By Who");
            System.out.println("Press 3 to Get Event By Start Date");
            System.out.println("Press 4 to Get Event By End Date");
            System.out.println("Press 5 to Get Event Description");
            System.out.println("Press 6 to get Event Type");
            System.out.println("Press 7 to get Person By StartDate");
            System.out.println("Press 8 to get Person By EndDate");
            System.out.println("Press 9 to get Update Start Date By Person");
            System.out.println("Press 10 to get all Events");
            System.out.println("Press 11 to Get Decryption by Event Type");
            System.out.println("Press 12 to Get All Day Event");
            int options = scanner.nextInt();
            switch (options){
                case 1:
                    System.out.println("Enter the Event Id");
                    int eventId = scanner.nextInt();
                    Event returnedEvent = calender.getById(eventId);
                    calender.getByDetails(returnedEvent);
                    break;
                case 2:
                    System.out.println("Enter the Name");
                    String name = scanner.next();
                    Event returnedEventByWho = calender.getByWho(name);
                    calender.getByDetails(returnedEventByWho);
                    break;
                case 3:
                    System.out.println("Enter the Event Start Date ");
                    String startDate = scanner.next();
                    Event returnedEventStartDate = calender.getByStartDate(startDate);
                    calender.getByDetails(returnedEventStartDate);
                    break;
                case 4:
                    System.out.println("Enter the End Date");
                    String e = scanner.next();
                    Event returnedEventEndDate = calender.getByEndDate(e);
                    calender.getByDetails(returnedEventEndDate);
                    break;
                case 5:
                    System.out.println("Enter the Event Description ");
                    String description = scanner.next();
                    Event returnedEventDescription = calender.getByDescription(description);
                    calender.getByDetails(returnedEventDescription);
                    break;
                case 6:
                    System.out.println("Enter The Event Type");
                    EventType event1 = EventType.valueOf(scanner.next().toLowerCase());
                    Event returnEventType = calender.getEventByEventType(event1);
                    calender.getByDetails(returnEventType);
                    break;
                case 7:
                    System.out.println("Enter the Event End Date");
                    String date = scanner.next();
                    String  returngetWhoByStartDate = calender.getWhoByStartDate(date);
                    System.out.println("The Person on Leave " +returngetWhoByStartDate);
                    break;
                case 8:
                    System.out.println("Enter the Event Start Date");
                    String  date2 = scanner.next();
                    String returnStartDateByWho = calender.getStartDateByWho("Bilwesh");
                    System.out.println("The leave Date :" +returnStartDateByWho);
                    break;
                case 9:
                    System.out.println("Enter The Updated date by name");
                    String name2 = scanner.next();
                    String date4 = scanner.next();
                    boolean returnUpdatedDate = calender.updateStartDateByWho(name2, date4);
                    System.out.println("The updated date : "+returnUpdatedDate);
                    calender.getEvent();
                    break;
                case 10:
                    calender.getEvent();
                    break;
                case 11:
                    System.out.println("Enter the Event Type ");
                    String  description1 = calender.getDescriptionByEventType(EventType.valueOf(scanner.next()));
                    System.out.println("The Decryption is : "+description1);
                    break;
                case 12:
                    System.out.println("Enter StartDate of the Event");
                    String dayEvent = scanner.next();
                    boolean returnAllDayEvent = calender.getAllDayEventByStartDate(dayEvent);
                    System.out.println("The Event is : "+returnAllDayEvent);
                    break;
                default:
                    System.out.println("Please Enter the valued Number");
            }
            System.out.println("Do you want to continue? (Type Yes or No)");
            val = scanner.next();
        }while(val.equalsIgnoreCase("Yes"));
        System.out.println("Thank You for Your Co-operation... ");
    }
}
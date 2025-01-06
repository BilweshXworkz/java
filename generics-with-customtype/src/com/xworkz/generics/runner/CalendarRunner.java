package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.CalenderIdComparator;
import com.xworkz.generics.comparator.calenderDescriptionComparator;
import com.xworkz.generics.customtype.Calendar;
import com.xworkz.generics.customtype.Gmail;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class CalendarRunner {
    public static void main(String[] args) {
        LinkedList<Calendar> linkedList = new LinkedList<>();
        linkedList.add(new Calendar(3,"01-01-2025","New Year Day ",true));
        linkedList.add(new Calendar(2,"10-01-2025","Celebration",true));
        linkedList.add(new Calendar(1, "07-10-2025", "Ram Birthday",true));


        for (Object o: linkedList){
            System.out.println(o);
        }

        System.out.println("===========================================================");

        Collections.sort(linkedList);

        for (Object obj : linkedList) {
            System.out.println(obj);
        }

        Collections.sort(linkedList, new CalenderIdComparator());

        System.out.println("============================================================");
        for (Object obj1 : linkedList)
            System.out.println(obj1);

        Collections.sort(linkedList, new calenderDescriptionComparator());
        System.out.println("============================================================");
        for (Object obj2 : linkedList)
            System.out.println(obj2);
    }
}

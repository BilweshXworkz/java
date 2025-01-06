package com.xworkz.generics.runner;

import com.xworkz.generics.comparator.InstituteEmailComparator;
import com.xworkz.generics.comparator.InstituteIsPlacedComparator;
import com.xworkz.generics.comparator.InstituteNameComparator;
import com.xworkz.generics.comparator.InstitutePhoneNumberComparator;
import com.xworkz.generics.customtype.Institute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class InstituteRunner {
    public static void main(String[] args) {
        LinkedList<Institute> arrayList = new LinkedList<>();
        arrayList.add(new Institute(3,"Sudeesh","sudeedh@gmail.com",874248987L,false));
        arrayList.add(new Institute(1,"Bilwesh","bilwesh@gmail.com",1234567810L,true));
        arrayList.add(new Institute(2,"Prajwal","prajwal@gmail.com",9566778559L,true));
        for(Object obj: arrayList)
            System.out.println(obj);

        Collections.sort(arrayList);
        System.out.println("===============================");

        for (Object o : arrayList)
            System.out.println(o);

        System.out.println("===============================");

        Collections.sort(arrayList, new InstituteNameComparator());
        for (Object o1 : arrayList)
            System.out.println(o1);

        System.out.println("===============================");

        Collections.sort(arrayList, new InstituteEmailComparator());
        for (Object o2 : arrayList)
            System.out.println(o2);


        System.out.println("===============================");

        Collections.sort(arrayList, new InstitutePhoneNumberComparator());
        for (Object o3 : arrayList)
            System.out.println(o3);

        System.out.println("===============================");

        Collections.sort(arrayList, new InstituteIsPlacedComparator());
        for (Object o4 : arrayList)
            System.out.println(o4);
    }
}

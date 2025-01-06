package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Calendar;

import java.util.Comparator;

public class CalenderIdComparator implements Comparator<Calendar> {
    @Override
    public int compare(Calendar o1, Calendar o2) {
        return o1.getCalenderId() - o2.getCalenderId();
    }
}

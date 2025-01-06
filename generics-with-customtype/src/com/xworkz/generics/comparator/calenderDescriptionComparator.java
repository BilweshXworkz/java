package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Calendar;

import java.util.Comparator;

public class calenderDescriptionComparator implements Comparator<Calendar> {
    @Override
    public int compare(Calendar o1, Calendar o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}

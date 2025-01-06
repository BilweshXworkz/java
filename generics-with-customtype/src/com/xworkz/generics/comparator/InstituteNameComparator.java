package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Institute;

import java.util.Comparator;

public class InstituteNameComparator implements Comparator<Institute> {

    @Override
    public int compare(Institute o1, Institute o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

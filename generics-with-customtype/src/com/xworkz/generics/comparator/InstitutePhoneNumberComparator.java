package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Institute;

import java.util.Comparator;

public class InstitutePhoneNumberComparator implements Comparator<Institute> {
    @Override
    public int compare(Institute o1, Institute o2) {
        return Long.compare(o1.getPhoneNumber(),o2.getPhoneNumber());
    }
}

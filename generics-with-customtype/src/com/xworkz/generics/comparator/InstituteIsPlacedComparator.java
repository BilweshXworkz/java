package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Institute;

import java.util.Comparator;

public class InstituteIsPlacedComparator implements Comparator<Institute> {
    @Override
    public int compare(Institute o1, Institute o2) {
        return Boolean.compare(o1.isPlaced(), o2.isPlaced());
    }
}

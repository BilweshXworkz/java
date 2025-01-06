package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Gmail;

import java.util.Comparator;

public class GmailDescriptionComparator implements Comparator<Gmail> {
    @Override
    public int compare(Gmail o1, Gmail o2) {
        return o1.getDescription().compareTo(o2.getDescription());
    }
}

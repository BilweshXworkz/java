package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Application;

import java.util.Comparator;

public class ApplicationDeveloperComparator implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        return o1.getDeveloper().compareTo(o2.getDeveloper());
    }
}

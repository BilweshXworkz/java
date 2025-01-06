package com.xworkz.generics.comparator;

import com.xworkz.generics.customtype.Application;

import java.util.Comparator;

import static java.lang.Double.valueOf;

public class ApplicationVersionComparator implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        return Double.compare(o1.getVersion(), o2.getVersion());
    }
}

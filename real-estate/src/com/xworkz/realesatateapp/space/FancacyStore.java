package com.xworkz.realesatateapp.space;

public class FancacyStore implements OfficeSpace {
    @Override
    public int doBusiness(){
        System.out.println("This my Fancy Store Business");
        return 1;
    }
}

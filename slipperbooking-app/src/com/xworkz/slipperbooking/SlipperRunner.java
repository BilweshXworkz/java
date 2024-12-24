package com.xworkz.slipperbooking;

import com.xworkz.slipperbooking.slipper.Slipper;

public class SlipperRunner {
    public static void main(String[] args) {
        Slipper wk = new Slipper();
        wk.setMaterial("Rubber");
        wk.setResistance("Water Resistant");
        wk.setStyle("Slipper");
        wk.setClosure("Slip-On");
        wk.setHeel("Flat");
        wk.setOrigin("India");

        System.out.println("Material Type :"+wk.getMaterial());
        System.out.println("Water Resistance Level : "+wk.getResistance());
        System.out.println("Style : "+wk.getStyle());
        System.out.println("Closure Type : "+wk.getClosure());
        System.out.println("Heel Type : "+wk.getHeel());
        System.out.println("Country of Origin : "+wk.getOrigin());
    }
}

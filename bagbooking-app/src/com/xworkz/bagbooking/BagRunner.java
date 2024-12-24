package com.xworkz.bagbooking;

import com.xworkz.bagbooking.handbag.HandBag;

import java.util.Scanner;

public class BagRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HandBag hb = new HandBag();
        System.out.println("Enter the Closure");
        String closure = scanner.next();
        hb.setClosure(closure);
        System.out.println("Enter the Material");
        String material = scanner.next();
        hb.setMaterial(material);
        System.out.println("Enter the style");
        String style = scanner.next();
        hb.setStyle(style);
        System.out.println("Enter the number of Pockets");
        int pockets = scanner.nextInt();
        hb.setPockets(pockets);
        System.out.println("Enter the origin");
        String origin = scanner.next();
        hb.setOrigin(origin);
        System.out.println(hb);




//        System.out.println("Closure Type : "+hb.getClosure());
//        System.out.println("Outer Material : "+hb.getMaterial());
//        System.out.println("Style : "+hb.getStyle());
//        System.out.println("Number of Pockets : "+hb.getPockets());
//        System.out.println("Country of Origin : "+hb.getOrigin());
    }
}

package com.xworkz.stackable;


import com.xworkz.stackable.stackablecupboard.StackableCupboard;

import java.util.Scanner;

public class StackableCupboardFeature {
    public static void main(String[] args) {
        StackableCupboard sc = new StackableCupboard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color");
        String color = scanner.next();
        sc.setColor(color);
        System.out.println("Enter the Material");
        String material = scanner.next();
        sc.setMaterial(material);
        System.out.println("Enter the brand");
        String brand = scanner.next();
        sc.setBrand(brand);
        System.out.println("Enter the Dimension");
        String dim = scanner.next();
        sc.setProductDimension(dim);
        System.out.println("Enter the number of Drawers ");
        int drawers = scanner.nextInt();
        sc.setNoOfDrawers(drawers);
        System.out.println("Enter the whigth");
        int weight = scanner.nextInt();
        sc.setItemWhight(weight);
//        sc.isAssemblyRequried(true);
        System.out.println(sc);

//        StackableCupboard sc1 = new StackableCupboard();
//        sc1.setColor("White");
//        sc1.setMaterial("Polypropylene");
//        sc1.setBrand("JEYANG");
//        sc1.setProductDimension("38D x 33W x 107H Centimeters");
//        sc1.setNoOfDrawers(1);
//        sc1.setItemWhight(240);
//        sc1.isAssemblyRequried(true);
//        System.out.println(sc);

        System.out.println(sc.hashCode());

//        boolean cupboard = sc.equals(sc1);
//        System.out.println(cupboard);

//        String color = sc.getColor();
//        String material = sc.getMaterial();
//        String brand = sc.getBrand();
//        String productDimension = sc.getProductDimension();
//        int noOfDrawers = sc.getNoOfDrawers();
//        int itemWhight = sc.getItemWhight();
//        boolean assemblyRequried = sc.getAssemblyRequried();

//        System.out.println("The Color is : "+color);
//        System.out.println("The Material : "+material);
//        System.out.println("The Brand is : "+brand);
//        System.out.println("The Product Dimension is : "+productDimension);
//        System.out.println("Number of Drawers is : "+noOfDrawers);
//        System.out.println("The Whight : "+itemWhight+"Grams");
//        System.out.println("Assembly Requried : "+assemblyRequried);
    }
}

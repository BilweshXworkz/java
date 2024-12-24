package com.xworkz.maskapp;

import com.xworkz.maskapp.mask.MaskCreation;

public class MaskRunner {
    public static void main(String[] args) {
        MaskCreation maskCreation = new MaskCreation();
        MaskCreation maskCreation1 = new MaskCreation(120);
        MaskCreation maskCreation2 = new MaskCreation('L');
        MaskCreation maskCreation3 = new MaskCreation("Cotton Cloth");
        System.out.println("============================================");
        MaskCreation maskCreation4 = new MaskCreation(120,'M',"Cotton");
        System.out.println("============================================");
        MaskCreation maskCreation5 = new MaskCreation(115,'L');
    }
}

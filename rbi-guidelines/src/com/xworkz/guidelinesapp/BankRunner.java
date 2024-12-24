package com.xworkz.guidelinesapp;

import com.xworkz.guidelinesapp.sbiBank.Hdfc;
import com.xworkz.guidelinesapp.sbiBank.HdfcBank;
import com.xworkz.guidelinesapp.sbiBank.RBIGuide;
import com.xworkz.guidelinesapp.sbiBank.SBIBank;

public class BankRunner {
    public static void main(String[] args) {
        RBIGuide rbiGuide = new SBIBank();
        rbiGuide.personalLoan();
        rbiGuide.currentAccount();
        rbiGuide.knowYourCustomer();
        rbiGuide.mobileBanktransactions();

        Hdfc rbiGuide1 = new HdfcBank();
        rbiGuide1.currentAccount();
        System.out.println(rbiGuide1.getClass());
        System.out.println(rbiGuide1);//Implicit calling of toString()
        System.out.println(rbiGuide1.hashCode());
        System.out.println(rbiGuide1.toString());//Explicit calling of toString()
    }
}

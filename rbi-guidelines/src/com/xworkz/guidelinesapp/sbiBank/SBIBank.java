package com.xworkz.guidelinesapp.sbiBank;

public class SBIBank implements RBIGuide{

    @Override
    public void personalLoan(){
        System.out.println("This Personal loan Guid we are using.");
    }

    @Override
    public void knowYourCustomer(){
        System.out.println("This is Knowing SBI customer");
    }

    @Override
    public void  currentAccount(){
        System.out.println("The Guid lines of current account");
    }

    @Override
    public void mobileBanktransactions(){
        System.out.println("This mobile Transactions");
    }

}

package com.xworkz.guidelinesapp.sbiBank;

public class HdfcBank extends Hdfc {

    @Override
    public void personalLoan(){
        System.out.println("This is Loan system will be applied");
    }

    @Override
    public void knowYourCustomer(){
        System.out.println("This is message for KYC");
    }

    @Override
    public void mobileBanktransactions() {

    }

    @Override
    public  void savingsAccount118(){
        System.out.println("This is savings Account 118");
    }
}

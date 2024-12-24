package com.xworkz.guidelinesapp.sbiBank;

public abstract class Hdfc implements RBIGuide {

    @Override
    public void personalLoan(){
        System.out.println("Hdfc will implement personal loan ");
    }

    @Override
    public void currentAccount(){
        System.out.println("HDFC will implements current Account ");
    }

//    public abstract void personLoan();
    public abstract void savingsAccount118();
}

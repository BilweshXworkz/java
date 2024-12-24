package com.xworkz.bankapp.saving;

import com.xworkz.bankapp.banking.BankAccount;

public class SavingAccount  extends BankAccount {

    public  SavingAccount(){
        super();
        System.out.println("The const of SavingsAccount ");
    }
    public double interest;

    public  void calculateRateOfInterest(){
        this.interest = (interest* getBalance())/100;
        credit(interest);

    }
}
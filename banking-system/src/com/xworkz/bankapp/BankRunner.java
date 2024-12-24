package com.xworkz.bankapp;

import com.xworkz.bankapp.banking.BankAccount;
import com.xworkz.bankapp.saving.SavingAccount;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Main Statred");
//        SavingAccount savingAccount = new SavingAccount();
        SavingAccount myAccount = new SavingAccount();
        myAccount.interest = 2.80;
        System.out.println("The Amount credited : "+myAccount.credit(5000));
        System.out.println("The balance is"+myAccount.getBalance());
        System.out.println("The Amount debited : " +myAccount.credit(3000));
        System.out.println("The balance is"+myAccount.getBalance());
        myAccount.calculateRateOfInterest();
        System.out.println("The balance is"+myAccount.getBalance());
        System.out.println("=============================================");

        SavingAccount friendAccount = new SavingAccount();
        friendAccount.interest = 3.50;
        friendAccount.credit(8000);
        System.out.println("The balance is"+friendAccount.getBalance());
        friendAccount.credit(2000);
        System.out.println("The balance is"+friendAccount.getBalance());
        friendAccount.calculateRateOfInterest();
        System.out.println("The balance is"+friendAccount.getBalance());
        System.out.println("===============================================");


        myAccount.transfer(friendAccount, 200);

        System.out.println("The my balance is"+myAccount.getBalance());

        System.out.println("The friend balance is"+friendAccount.getBalance());


        SavingAccount sisterAccount = new SavingAccount();
        sisterAccount.interest = 3.70;
        sisterAccount.credit(5000);
        System.out.println("The sister balance is"+sisterAccount.getBalance());
        sisterAccount.credit(1000);
        System.out.println("The sister balance is"+sisterAccount.getBalance());
        sisterAccount.calculateRateOfInterest();
        System.out.println("The sister balance is"+sisterAccount.getBalance());
        System.out.println("=============================================");

        SavingAccount motherAccount = new SavingAccount();
        motherAccount.interest = 2.89;
        motherAccount.credit(7000);
        System.out.println("The mom balance is "+motherAccount.getBalance());
        motherAccount.debit(500);
        System.out.println("The mom balance is "+motherAccount.getBalance());
        motherAccount.calculateRateOfInterest();
        System.out.println("The mom balance is "+motherAccount.getBalance());
        System.out.println("================================================");
        

        SavingAccount fatherAccount = new SavingAccount();
        fatherAccount.interest=3.00;
        fatherAccount.credit(9000);
        System.out.println("The Father balance is "+fatherAccount.getBalance());
        fatherAccount.calculateRateOfInterest();
        System.out.println("The Father balance is "+fatherAccount.getBalance());
        System.out.println("====================================================");

        fatherAccount.transfer(myAccount, 500);
        System.out.println("The Father balance is "+fatherAccount.getBalance());
        System.out.println("The Father balance is "+myAccount.getBalance());

        fatherAccount.transfer(motherAccount, 2000);
        System.out.println("The Father balance is "+fatherAccount.getBalance());
        System.out.println("The Father balance is "+motherAccount.getBalance());

        SavingAccount myAnotherAccount = new SavingAccount();
        myAnotherAccount. interest = 3.00;
        myAnotherAccount.credit(5000);
        myAnotherAccount.calculateRateOfInterest();
        System.out.println("The my another balance is "+myAnotherAccount.getBalance());
        System.out.println("====================================================");



        System.out.println("Main Ended");
    }
}

package com.xworkz.bankapp.banking;

public class BankAccount {

    public BankAccount(){
        System.out.println("The const of BankAccount");
    }

    private double balance;

    public double credit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
        return amount;

    }

    public  double  debit(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }
        return amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(BankAccount beneficiaryAccount, double amount){
        System.out.println("Transfer started ");
        this.debit(amount);
        beneficiaryAccount.credit(amount);
        System.out.println("Transfer ended");
    }
}
package com.xworkz.myairtel.bill;

public class Bill {
    public Bill(){
        System.out.println("Constructor is created");
    }
    private int billId;
    private double billAmount;
    private String billName;
    private String billAddress;
    private boolean isBillPaid;

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillPaid(boolean billPaid) {
        this.isBillPaid = billPaid;
    }

    public boolean isBillPaid() {
        return isBillPaid;
    }

    @Override
    public String toString(){
        return "Bill Id : "+billId+"," +
                "Bill Amount : "+billAmount+"," +
                "Bill Name : "+billName+"," +
                "Bill Address : "+billAddress+"," +
                "Bill Amount : "+billAmount+"," ;
    }
}


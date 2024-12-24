package com.xworkz.myairtel;

import com.xworkz.myairtel.bill.Bill;

import java.util.Scanner;

public class BillRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bill bill = new Bill();
        System.out.println("Enter the Bill ID :");
        int billId = scanner.nextInt();
        bill.setBillId(billId);
        System.out.println("Enter the Name :");
        String name = scanner.next();
        bill.setBillName(name);
        System.out.println("Enter the Amount :");
        int amt = scanner.nextInt();
        bill.setBillAmount(amt);
        System.out.println("Enter the Billed Location ");
        String loc = scanner.next();
        bill.setBillAddress(loc);
        System.out.println("Bill paid or not");
        Boolean paid = scanner.nextBoolean();
        bill.setBillPaid(paid);

        System.out.println("The Bill Id : "+bill.getBillId());
        System.out.println("The Bill Name : "+bill.getBillName());
        System.out.println("The Bill Amount : Rs"+bill.getBillAmount());
        System.out.println("The Bill Address : "+bill.getBillAddress());
        System.out.println("P");
    }
}

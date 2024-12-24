package com.xworkz.libapp;

import com.xworkz.libapp.book.Book;

import java.util.Scanner;

public class Exception extends Book {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Book book = new Book();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book Id ");
        int bookId = scanner.nextInt();
        book.setBookId(bookId);
        System.out.println("Enter the Book Name ");
        String bookName = scanner.next();
        book.setBookName(bookName);
        System.out.println("Enter the Author of the Book ");
        String author = scanner.next();
        book.setAuthor(author);
        System.out.println("Enter the Price of the Book ");
        double price = scanner.nextDouble();
        book.setPrice(price);

        System.out.println(book);

        System.out.println("Main Ended");
    }
}
//        String str = "25";
//        String str1 = "False";
//        String phoneNo = "9874563219";
//
//
//        int num = Integer.parseInt(str);
//        Boolean status = Boolean.parseBoolean(str1);
//        long number = Long.parseLong(phoneNo);
//
//        System.out.println(num);
//        System.out.println(status);
//        System.out.println(number);

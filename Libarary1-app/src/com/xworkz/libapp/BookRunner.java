package com.xworkz.libapp;

import com.xworkz.libapp.book.Book;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("The main Started");

        Book book = new Book();
        System.out.println(book);
        book.setBookId(1);
//        book.setBookName("Sherlock Holmes");
        book.getBookName().length();
        book.setAuthor("Arthur Conan Doyle");
        book.setPrice(180.95);


        try {
            String bookDetails = book.getBookName();
            System.out.println(bookDetails);
        }catch (NullPointerException e){
            System.out.println("The Data is not Existing..");
        }

        System.out.println("The Main Ended");
    }
}

//        BookRunner book = new BookRunner();

//        Book book = new Book();
//        System.out.println(book);
//        book.setBookId(1);
//        book.setBookName("Sherlock Holmes");
//        book.setAuthor("Arthur Conan Doyle");
//        book.setPrice(180.95);
//
//        Book book1 = Book.clone();
//        System.out.println(book1.getPrice());
//
//        Book book2 = Book.clone();
//        book2.setPrice(500.25);
//        System.out.println(book2.getPrice());


//        System.out.println(book.getBookId());
//        System.out.println(book.getBookName());
//        System.out.println(book.getAuthor());
//        System.out.println(book.getPrice());

//        Book book1 = book;
//        book1.setPrice(120.00);
//        System.out.println(book1.getPrice());

//        Book book2 = book1;
//        book2.setPrice(500.00);
//        System.out.println(book1.getPrice());
//        System.out.println(book2.getPrice());
//        System.out.println(book1.getPrice());


//        collegeLibrary.addBook(book);
//        collegeLibrary.getBook();
//        System.out.println(book);

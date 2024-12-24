package com.xworkz.libapp.book;

public class Book  {
    private  int bookId;
    private  String bookName;
    private  String author;
    private  double price;

    public Book(){
        System.out.println("Book is clone");
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return "Book Details " +
                "Book Id : "+bookId+"," +
                "Book Name : "+bookName+"," +
                "Author : "+author+"," +
                "Price : "+price+".";
    }
}

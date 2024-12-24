package com.xworkz.libapp.book;

public class Book implements Cloneable{
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    public Book(){

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
    public int hashCode(){
        return this.bookId;
    }

    @Override
    public String toString(){
        return "Book Id - "+bookId+ ", Book Name - "+bookName+", Book Author - "+author+",Book Price - "+price+".";
        //  \n to next line.
    }

    @Override
    public  boolean equals(Object obj){
        Book book = (Book) obj;
        if(this.bookId == book.bookId &&
                this.bookName == book.bookName &&
                this.author == book.author &&
                this.price == book.price)
            return true;
        return false;
    }

//    @Override
//    protected Object
}

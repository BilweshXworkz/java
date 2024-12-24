package com.xworkz.libapp.library;

import com.xworkz.libapp.book.Book;

public interface LibraryDetails {
    public boolean addBook(Book book);
    public void getBook();
    public double updatePriceByID(double price, int id);
    public Book getBookById(int bookId);
    public double getPriceByBookName(String bookName);
    public Book getBookByAuthor(String authorName);
    public String  getAuthorByBook(String bookName);
    public String  getAuthorById(int id);
    public boolean updatePricesByBookName(double price, String bookName);
    public int getIdByBook(String bookName);
    public boolean deleteBookByBookName(String deleteBook);
}
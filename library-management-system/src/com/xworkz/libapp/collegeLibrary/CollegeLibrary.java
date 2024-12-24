package com.xworkz.libapp.collegeLibrary;

import com.xworkz.libapp.Exception.*;
import com.xworkz.libapp.book.Book;
import com.xworkz.libapp.library.LibraryDetails;

import java.util.Arrays;

public class CollegeLibrary implements LibraryDetails {
    Book book[] = null;
    int index;

    public CollegeLibrary(int size){
        book = new Book[size];
    }

    public boolean addBook(Book book){
        boolean isBookAdd = false;
        if(book != null){
            if(book.getBookId() > 0 && book.getBookName() != null){
                this.book[index++] = book;
                isBookAdd = true;
            }
            else{
                System.out.println("Please Enter the details");
            }
        }
        return isBookAdd;
    }

    public  void getBook() {
        try {
            if (book != null) {
                for (Book book1 : this.book) {
                    if (book1 != null) {
                        System.out.println("The Book Id : " + book1.getBookId());
                        System.out.println("The Book Name : " + book1.getBookName());
                        System.out.println("The Book Author : " + book1.getAuthor());
                        System.out.println("The Price : Rs." + book1.getPrice());
                    }
                }
            }
        }catch (BookNotFoundException e){
        e.printStackTrace();
        }
    }

    public double updatePriceByID(double price, int id){
        double updatedPrice = 0.0;
        for (Book book1 : this.book){
            if(book1 != null){
                updatedPrice = book1.setPrice(price);
            }
            else {
                System.out.println("Price is not Updated");
            }
        }
        return updatedPrice;
    }

    public Book getBookById(int bookId){
        Book book2 = null;
        try {
            boolean isBookIdFound = false;
            for (Book book1 : this.book) {
                if (book1.getBookId() == bookId) {
                    book2 = getBook();
                    isBookIdFound = true;
                }
            }
            if (isBookIdFound == false){
                throw new BookNotFoundByIdException("Book Id "+ bookId+" not Found");
            }
        }catch (BookNotFoundByIdException e){
            System.out.println("Error "+e.getMessage());
            e.printStackTrace();
        }
        return book2;
    }

    public double getPriceByBookName(String bookName){
        double price = 0.0;
        boolean isBookName = false;
        try {
            for (Book book1 : this.book) {
                if (book1.getBookName().equals(bookName)) {
                    price = book1.getPrice();
                    isBookName = true;
                }
            }
            if (isBookName == false){
                throw new getPriceByBookNameException("Book Name "+ bookName+" not Found");
            }
        }catch (getPriceByBookNameException e){
            e.printStackTrace();
        }
        return price;
    }

    public Book getBookByAuthor(String authorName){
        Book book2 = null;
        try {
            boolean isAuthorFound = false;
            for (Book book1 : this.book) {
                if (book1.getAuthor().equals(authorName)) {
                    book1.getBookName();
                    book2=isAuthorFound = true;
                } else System.out.println("Author Name Not Found");
            }
            if (isAuthorFound == false){
                throw new GetBookByAuthorNotFoundException("Book Author "+ authorName +" not Found");
            }
        }catch (GetBookByAuthorNotFoundException e) {
            e.printStackTrace();
        }
        return book2;
    }

    public String  getAuthorByBook(String bookName){
        String authorName = null;
        boolean isBookFound = false;
        try {
            for (Book book1 : this.book) {
                if (book1.getBookName().equals(bookName)) {
                    authorName = book1.getAuthor();
                    isBookFound = true;
                } else System.out.println("Book not found of particular author");
            }
            if (isBookFound == false){
                throw new GetAuthorByBookException("Book Name "+bookName+" not Found");
            }
        }catch (GetAuthorByBookException e){
            e.printStackTrace();
        }
        return authorName;
    }

    public String getAuthorById(int id){
        String author = null;
        boolean isIdFound = false;
        try {
            for (Book book1 : this.book) {
                if (book1.getBookId() == id) {
                    author = book1.getAuthor();
                    isIdFound = true;
                } else System.out.println("Book Id Not Found");
            }
            if (isIdFound == false){
                throw new GetAuthorByIdException("Book Id " +id+" not Found");
            }
        }catch (GetAuthorByIdException e){
            e.printStackTrace();
        }
        return author;
    }

    public boolean updatePricesByBookName(double price, String bookName){
        boolean isUpdated = false;
        try {
            for (Book book1 : this.book) {
                if (bookName != null) {
                    book1.setPrice(price);
                    isUpdated = true;
                } else System.out.println("Book not Found");
            }
            if (isUpdated == false){
                throw new updatePricesByBookNameException("The prise is not Updated");
            }
        }
        catch (updatePricesByBookNameException e){
            e.printStackTrace();
        }
        return isUpdated
    }

    public int getIdByBook(String bookName){
        int bookId = 0;
        try {
            boolean isBookName = false;
            for (Book book1 : this.book) {
                if (book1.getBookName().equals(bookName)) {
                    bookId = book1.getBookId();
                    isBookName = true;
                } else System.out.println("Book Not found");
            }
            if (isBookName == false){
                throw new GetAuthorByIdException("The Book Name not Found");
            }
        }
        catch (GetIdByBookException e){
            e.printStackTrace();
        }
        return bookId;
    }

    public boolean deleteBookByBookName(String deleteBook){
      int index;
      int newIndex;
      boolean isBookDeleted = false;
      try {
          for (index = 0, newIndex = 0; index < book.length; index++) {
              Book book1 = this.book[index];
              if (book1.getBookName() != deleteBook) {
                  this.book[newIndex++] = this.book[index];
              } else {
                  System.out.println("The Book Deleted");
                  isBookDeleted = true;
              }
          }
          if (isBookDeleted == false){
              throw new DeleteBookByBookNameException("The Book is not Deleted");
          }
      }catch (DeleteBookByBookNameException e){
          e.printStackTrace();
      }
      int size = newIndex;
      book = Arrays.copyOf(this.book, size);
      return isBookDeleted;2
    }
}

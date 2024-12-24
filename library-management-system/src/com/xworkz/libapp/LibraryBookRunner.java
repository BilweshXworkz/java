package com.xworkz.libapp;

import com.xworkz.libapp.book.Book;
import com.xworkz.libapp.collegeLibrary.CollegeLibrary;

import java.util.Scanner;

public class LibraryBookRunner extends Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Books in Library.");
        int size = scanner.nextInt();
        CollegeLibrary collegeLibrary = new CollegeLibrary(size);

        for (int i=0; i<size; i++){
            Book book = new Book();
            System.out.println("Enter Book ID : ");
            int id = scanner.nextInt();
            book.setBookId(id);
            System.out.println("Enter Book Name : ");
            String name = scanner.next();
            book.setBookName(name);
            System.out.println("Enter Book Author : ");
            String author = scanner.next();
            book.setAuthor(author);
            System.out.println("Enter the Book Price : ");
            double price = scanner.nextDouble();
            book.setPrice(price);
            collegeLibrary.addBook(book);
        }
        collegeLibrary.getBook();

        String input = null;

        do{
            System.out.println("Press 1 To Get All The Information");
            System.out.println("Press 2 To Update Book Price");
            System.out.println("Press 3 To Get Details Of Book By Id");
            System.out.println("Press 4 To Get Price By BookName");
            System.out.println("Press 5 To Get Book By Author");
            System.out.println("Press 6 To Get Author By Book");
            System.out.println("Press 7 To Get Author By Id");
            System.out.println("Press 8 To Update Price By Book Name ");
            System.out.println("Press 9 To Get Id By Book Name");
            System.out.println("Press 10 To Delete Book By Book Name");

            int options = scanner.nextInt();

            switch (options){
                case 1:
                    collegeLibrary.getBook();
                    break;
                case 2:
                    System.out.println("Please Enter the Book Id ");
                    int bookid1 = scanner.nextInt();
                    System.out.println("Please Enter the Updated Price");
                    double updatedprice1 = scanner.nextDouble();
                    collegeLibrary.updatePriceByID(updatedprice1,bookid1);
                    break;
                case 3:
                    System.out.println("Please Enter Book ID ");
                    int bookId = scanner.nextInt();
                    collegeLibrary.getBookById(bookId);
                    break;
                case 4:
                    System.out.println("Enter the Book Name");
                    String bookName = scanner.next();
                    collegeLibrary.getPriceByBookName(bookName);
                    collegeLibrary.getBook();
                    break;
                case 5:
                    System.out.println("Please Enter the Author Name");
                    collegeLibrary.getBookByAuthor(scanner.next());
                    break;
                case 6:
                    System.out.println("Please Enter the Author Name");
                    collegeLibrary.getAuthorByBook(scanner.next());
                    break;
                case 7:
                    System.out.println("Press Enter the Book Id");
                    collegeLibrary.getAuthorById(scanner.nextInt());
                    break;
                case  8:
                    System.out.println("Please Enter the Book name");
                    String bookName1 = scanner.next();
                    System.out.println("Please Enter the Updated Price");
                    int price = scanner.nextInt();
                    collegeLibrary.updatePricesByBookName(price, bookName1);
                    break;
                case 9:
                    System.out.println("Please Enter the Book Name");
                    collegeLibrary.getIdByBook(scanner.next());
                    break;
                case 10:
                    System.out.println("Please Enter the Book Name to be Deleted");
                    collegeLibrary.deleteBookByBookName(scanner.next());
                    break;
                default:
                    System.out.println("Please Enter the valid number");
            }
            System.out.println("Do you want to continue Yes/No");
            input = scanner.next();
        }while (input.equalsIgnoreCase("Yes"));

        System.out.println("Thank you for your co-operation");
    }
}

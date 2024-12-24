package com.xworkz.bankingapp;

import java.sql.DriverManager;
import java.sql.SQLException;

public class RBIBank {
    public static void main(String[] args) {
        System.out.println("The main Started");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Database Loading...");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/RBIBank", "root","bilwesh");
            System.out.println("Database Connected");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Database Not Connected"+e.getMessage());
        }
        System.out.println("The main Ended");
    }
}

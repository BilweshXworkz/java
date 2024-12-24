package com.xworkz.govapp.runner;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class GovPapers {
    public static void main(String[] args) {
        System.out.println("The main started");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Database Loading...");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/GovPapers", "root", "bilwesh");
            System.out.println("Database Connected");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Database not connected "+e.getMessage());
        }
        System.out.println("The main ended");
    }
}
